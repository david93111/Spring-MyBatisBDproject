package com.BD2UniverseProject.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BD2UniverseProject.map.ClientMapper;
import com.BD2UniverseProject.map.SaleDetailMapper;
import com.BD2UniverseProject.map.SaleMapper;
import com.BD2UniverseProject.model.Client;
import com.BD2UniverseProject.model.ClientExample;

@Controller
public class SaleCreationCatalogController {
	
	@Autowired
	private SaleDetailMapper salesDetailMapper;
	
	@Autowired
	private SaleMapper salesMapper;
	
	@Autowired
	private ClientMapper clientMapper;
	
	
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
		ClientExample ClientAutocompleteExample = new ClientExample();
		String search = request.getParameter("term");
		ClientAutocompleteExample.or().andFIRST_NAMELike("%"+search+"%");
		ClientAutocompleteExample.or().andSECOND_NAMELike("%"+search+"%");
		ClientAutocompleteExample.or().andFIRST_LASTNAMELike("%"+search+"%");
		ClientAutocompleteExample.or().andSECOND_LASTNAMELike("%"+search+"%");
		List<Client> clientsList = clientMapper.selectByExample(ClientAutocompleteExample);
		
		if(clientsList!=null&&!clientsList.isEmpty()){
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
			JSNreturn.put("error", "there is no clients registered in the system");
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
