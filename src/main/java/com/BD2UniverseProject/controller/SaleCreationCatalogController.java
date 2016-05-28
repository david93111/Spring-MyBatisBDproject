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
//		request.getSession().setAttribute("orderId", "50");
//		request.getSession().getAttribute("orderId");
//		request.getSession().removeAttribute("orderId");
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
						JSNreturn.put("sucess", "Sale created sucessfully, know you can add products to it!");
						List<Product> productList = ProductMapper.selectByExample(null);
						
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
	
}
