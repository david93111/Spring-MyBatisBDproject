package com.BD2UniverseProject.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.BD2UniverseProject.map.ClientMapper;
import com.BD2UniverseProject.map.SaleDetailMapper;
import com.BD2UniverseProject.map.SaleMapper;
import com.BD2UniverseProject.model.Client;
import com.BD2UniverseProject.model.Sale;
import com.BD2UniverseProject.model.SaleDetailExample;

@Controller
public class SalesDetailController {
	
	@Autowired
	private SaleDetailMapper salesDetailMapper;
	
	@Autowired
	private SaleMapper salesMapper;
	
	@Autowired
	private ClientMapper clientMapper;
	
	@RequestMapping(value="/salesDetail")
	public String salesDetail(Model model,HttpServletRequest request){
		if(request.getParameter("orderId")!=null&&!request.getParameter("orderId").equals("")){
			BigDecimal orderId = new BigDecimal(request.getParameter("orderId"));
			Sale saleModel = salesMapper.selectByPrimaryKey(orderId);
			if(saleModel!=null){				
			Client clientModel = clientMapper.selectByPrimaryKey(saleModel.getCLIENT_ID());
			SaleDetailExample saleDetailExample = new SaleDetailExample();
			saleDetailExample.createCriteria().andSALE_DETAIL_IDEqualTo(orderId);
			Map<String, Object> mapParams = new HashMap<String, Object>();
			mapParams.put("saleId", orderId.intValue());
			List<Map<String,Object>> detailsSaleList = salesDetailMapper.selectDetailTableForSale(mapParams);
			model.addAttribute("salesDetail", detailsSaleList);
			return "SalesDetailView";
			}
		}
		return "redirect:/SalesView.html?message=The Order Does not exist";
	}

}
