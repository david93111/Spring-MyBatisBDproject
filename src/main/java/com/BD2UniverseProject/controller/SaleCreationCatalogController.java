package com.BD2UniverseProject.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BD2UniverseProject.map.ClientMapper;
import com.BD2UniverseProject.map.ProductMapper;
import com.BD2UniverseProject.map.SaleDetailMapper;
import com.BD2UniverseProject.map.SaleMapper;
import com.BD2UniverseProject.model.Client;
import com.BD2UniverseProject.model.ClientExample;
import com.BD2UniverseProject.model.Product;
import com.BD2UniverseProject.model.Sale;

@Controller
public class SaleCreationCatalogController {
	
	@Autowired
	private SaleDetailMapper salesDetailMapper;
	
	@Autowired
	private SaleMapper salesMapper;
	
	@Autowired
	private ClientMapper clientMapper;
	
	@Autowired
	private ProductMapper ProductMapper;
	
	
	@RequestMapping("/saleCatalog")
	public String salesManagment(Model model,HttpServletRequest request){
		request.getParameter("from");
		try{
		if(request.getParameter("saleId")!=null&&!request.getParameter("saleId").equals("")){			
			BigDecimal saleId = new BigDecimal(request.getParameter("saleId"));
			List<Product> productList = ProductMapper.selectByExample(null);
			if(productList!=null&&!productList.isEmpty()){
				JSONArray prodsJSNarray = buildProductsJson(productList);
				model.addAttribute("productsArray", prodsJSNarray.toString());
			}else{
				model.addAttribute("warning", "No products are registered or available at this moment, please verify the inventory or the products registers");	
			}
			Sale sale = salesMapper.selectByPrimaryKey(saleId);
			model.addAttribute("totalPriceSale", sale.getTOTAL_PRICE());
			model.addAttribute("saleId", saleId);
			model.addAttribute("edit", true);
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("saleId", saleId);
			List<Map<String, Object>> listDetails =  salesDetailMapper.selectDetailTableForSale(map);
			
			if(listDetails!=null&&!listDetails.isEmpty()){
				JSONArray detailsJson = buildDetailsJson(listDetails);
				model.addAttribute("detailsArray", detailsJson.toString());			
			}
		}else{
			model.addAttribute("edit", false);
		}
		}catch(Exception e){
			model.addAttribute("error", "cause: "+e.getCause() +",detail message:"+e.getMessage()+". Report this to the administrator");
			model.addAttribute("edit", false);
		}
		model.addAttribute("context", request.getContextPath());
		return "SaleCatalogView";
	}
	
	@RequestMapping("/saleCatalog/getClientsList")
	public void getClientJson(HttpServletRequest request,HttpServletResponse response){
		JSONObject JSNreturn = new JSONObject();
		JSONArray JSNarray = new JSONArray();
		try{
			ClientExample ClientAutocompleteExample = new ClientExample();
			String search = request.getParameter("term");
			ClientAutocompleteExample.or().andFIRST_NAMELike("%"+search+"%");
			ClientAutocompleteExample.or().andSECOND_NAMELike("%"+search+"%");
			ClientAutocompleteExample.or().andFIRST_LASTNAMELike("%"+search+"%");
			ClientAutocompleteExample.or().andSECOND_LASTNAMELike("%"+search+"%");
			List<Client> clientsList = clientMapper.selectByExample(ClientAutocompleteExample);
			Integer count=1;
			if(clientsList!=null&&!clientsList.isEmpty()&&request.getParameter("clientsCount")!=null&&!request.getParameter("clientsCount").equals("0")){
				count = clientMapper.countByExample(null);
				JSNreturn.put("countClients", count);
			}
			
			if(!count.equals(0)){
				for(Client client:clientsList){
					JSONObject JSNclient = new JSONObject();
					JSNclient.put("value", client.getCLIENT_ID());
					JSNclient.put("label", 
							(client.getFIRST_NAME()+(client.getSECOND_NAME()!=null?" "+client.getSECOND_NAME():"")) 
							+
							(" "+client.getFIRST_LASTNAME()+(client.getSECOND_LASTNAME()!=null?" "+client.getSECOND_LASTNAME():""))
							);
					JSNarray.put(JSNclient);
				}
			}else{
				JSNreturn.put("warning", "there is no clients registered in the system");
			}
		}catch(Exception e){
			e.printStackTrace();
			JSNreturn.put("error", "cause: "+e.getCause() +",detail message:"+e.getMessage()+". Report this to the administrator");
		}
		
		JSNreturn.put("arrayResults", JSNarray);
		
		try {
//			JSNreturn.write(response.getWriter());
			response.getWriter().write(JSNreturn.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/saleCatalog/processClientAndSale")
	@Transactional
	public void processClientAndOrder(HttpServletRequest request,HttpServletResponse response){
		JSONObject JSNreturn = new JSONObject();
		JSONArray JSNarray = new JSONArray();
		try{
			if(request.getParameter("clientId")!=null&&!request.getParameter("clientId").equals("")){
				BigDecimal client = new BigDecimal(request.getParameter("clientId"));
				Client clientSelected = clientMapper.selectByPrimaryKey(client);
				
				if(clientSelected!=null){
					Map<String, Object> paramsMap = new HashMap<String, Object>();
					paramsMap.put("clientId", client);
					paramsMap.put("status", "PENDIENTE");
					paramsMap.put("v_sale_id", null);
					salesMapper.SP_CREATE_SALE(paramsMap);
					BigDecimal saleId = new BigDecimal(paramsMap.get("v_sale_id").toString());
					if(saleId!=null){
						JSNreturn.put("sucess", "Sale created sucessfully, now you can add products to it!");
						JSNreturn.put("saleId", saleId);
						JSNreturn.put("clientNames", clientSelected.getFIRST_NAME()+" "+clientSelected.getFIRST_LASTNAME());
						JSNreturn.put("Address", clientSelected.getADDRESS());
						
						List<Product> productList = ProductMapper.selectByExample(null);
						if(productList!=null&&!productList.isEmpty()){
							JSONArray prodsJSNarray = buildProductsJson(productList);
							JSNreturn.put("productsArray", prodsJSNarray);
						}else{
							JSNreturn.put("warning", "No products are registered or available at this moment, please verify the inventory or the products registers");	
						}
						
					}			
				}else{
					JSNreturn.put("error", "there is no such client registered in the system");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
			JSNreturn.put("error", "cause: "+e.getCause() +",detail message:"+e.getMessage()+". Report this to the administrator");
		}
		JSNreturn.put("arrayResults", JSNarray);
		
		try {
//			JSNreturn.write(response.getWriter());
			response.getWriter().write(JSNreturn.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public JSONArray buildProductsJson(List<Product> productList){
		JSONArray JSNarrayProd = new JSONArray();
		for(Product product:productList){
			JSONObject prodObject = new JSONObject();
			prodObject.put("prodId", product.getPRODUCT_ID());
			prodObject.put("name", product.getPRODUCT_NAME());
			prodObject.put("code", product.getPRODUCT_CODE());
			prodObject.put("price", product.getPRODUCT_PRICE());
			prodObject.put("inventory", product.getINVENTORY());
			JSNarrayProd.put(prodObject);
		}
		return JSNarrayProd;
	}
	
	@RequestMapping("/saleCatalog/getDetailsSale")
	public void getDetailsForSale(HttpServletRequest request,HttpServletResponse response){
		request.getParameter("orderId");
		salesDetailMapper.countByExample(null);
	}
	
	@RequestMapping("/saleCatalog/processDetailForOrder")
	@Transactional
	public void AddOrUpdateDetailForSale(HttpServletRequest request,HttpServletResponse response){
		JSONObject JSNreturn = new JSONObject();
		JSONArray JSNarrayDetails = new JSONArray();
		try{
			if(request.getParameter("orderId")!=null&&!request.getParameter("orderId").equals("")
				&&request.getParameter("productCode")!=null&&!request.getParameter("productCode").equals("")&&
				request.getParameter("quantity")!=null&&!request.getParameter("quantity").equals("")||!request.getParameter("quantity").equals("0")){
				BigDecimal quantity = new BigDecimal(request.getParameter("quantity"));
				BigDecimal orderID = new BigDecimal(request.getParameter("orderId"));
				String productCode = request.getParameter("productCode");
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("v_sale_id", orderID);
				map.put("v_product_code", productCode);
				map.put("v_detail_quantity", quantity);
				
				salesDetailMapper.SP_ADD_DETAIL(map);
				
				JSNreturn.put("sucess", "Product sucesfully added to the sale!");

				map.put("saleId", orderID);
				salesMapper.SP_call_update_sale_value(map);
				List<Map<String, Object>> listDetails =  salesDetailMapper.selectDetailTableForSale(map);
				
				if(listDetails!=null&&!listDetails.isEmpty()){
					JSONArray detailsJson = buildDetailsJson(listDetails);
					JSNreturn.put("detailsArray", detailsJson);
					Sale sale = salesMapper.selectByPrimaryKey(orderID);
					JSNreturn.put("totalPriceSale", sale.getTOTAL_PRICE());
				}
				
			}else{
				String errors = "";
				if(request.getParameter("orderId")==null||request.getParameter("orderId").equals("")){
					errors+="<li>The actual order ca not be obtained or validated, plesae try again, or go to order details and edit the order</li>";
				}
				if(request.getParameter("productCode")==null||request.getParameter("productCode").equals("")){
					errors+="<li>The selected product can not be obtained please try to add it again</li>";
				}
				if(request.getParameter("quantity")==null||request.getParameter("quantity").equals("")||request.getParameter("quantity").equals("0")){
					errors+="<li>The quantity is a invalid quantity</li>";
				}
				JSNreturn.put("error", errors);
			}
		}catch(Exception e){
			e.printStackTrace();
			JSNreturn.put("error", "cause: "+e.getCause() +",detail message:"+e.getMessage()+". Report this to the administrator");
		}
		JSNreturn.put("arrayResults", JSNarrayDetails);
		
		try {
//			JSNreturn.write(response.getWriter());
			response.getWriter().write(JSNreturn.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public JSONArray buildDetailsJson(List<Map<String, Object>> detailsList){
		JSONArray JSNarrayDetail = new JSONArray();
		for(Map<String, Object> detail:detailsList){
			JSONObject detailObject = new JSONObject();
			detailObject.put("detailId", detail.get("SALE_DETAIL_ID"));
			detailObject.put("name", detail.get("PRODUCT_CODE"));
			detailObject.put("price", detail.get("PRICE"));
			detailObject.put("quantity", detail.get("QUANTITY"));
//			prodObject.put("price", product.getPRODUCT_PRICE());
//			prodObject.put("inventory", product.getINVENTORY());
			JSNarrayDetail.put(detailObject);
		}
		return JSNarrayDetail;
	}
	
	@RequestMapping("/saleCatalog/removeDetailFromSale")
	public void removeDetailFromSale(HttpServletRequest request,HttpServletResponse response){
		JSONObject JSNreturn = new JSONObject();
		JSONArray JSNarrayDetails = new JSONArray();
		try{
			if(request.getParameter("orderId")!=null&&!request.getParameter("orderId").equals("")
				&&request.getParameter("saleDetailId")!=null&&!request.getParameter("saleDetailId").equals("")){
				BigDecimal saleDetailId = new BigDecimal(request.getParameter("saleDetailId"));
				BigDecimal orderID = new BigDecimal(request.getParameter("orderId"));
				
				salesDetailMapper.deleteByPrimaryKey(saleDetailId);
				
				JSNreturn.put("sucess", "Product sucesfully removed from the sale!");
				
				Map<String, Object> map = new HashMap<String, Object>();
				
				map.put("v_sale_id", orderID);
				salesMapper.SP_call_update_sale_value(map);
				
				map.put("saleId", orderID);
				List<Map<String, Object>> listDetails =  salesDetailMapper.selectDetailTableForSale(map);
				
				if(listDetails!=null&&!listDetails.isEmpty()){
					JSONArray detailsJson = buildDetailsJson(listDetails);
					JSNreturn.put("detailsArray", detailsJson);
					Sale sale = salesMapper.selectByPrimaryKey(orderID);
					JSNreturn.put("totalPriceSale", sale.getTOTAL_PRICE());
				}
			}else{
				String errors = "";
				if(request.getParameter("orderId")==null||request.getParameter("orderId").equals("")){
					errors+="<li>The actual order ca not be obtained or validated, plesae try again, or go to order details and edit the order</li>";
				}
				if(request.getParameter("saleDetailId")==null||request.getParameter("saleDetailId").equals("")){
					errors+="<li>The selected detail can not be obtained please try again</li>";
				}
				JSNreturn.put("error", errors);
			}
		}catch(Exception e){
			e.printStackTrace();
			JSNreturn.put("error", "cause: "+e.getCause() +",detail message:"+e.getMessage()+". Report this to the administrator");
		}
		
		JSNreturn.put("arrayResults", JSNarrayDetails);
		
		try {
//			JSNreturn.write(response.getWriter());
			response.getWriter().write(JSNreturn.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
