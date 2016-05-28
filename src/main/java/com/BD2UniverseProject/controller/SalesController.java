package com.BD2UniverseProject.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.BD2UniverseProject.map.SaleMapper;

@Controller
public class SalesController {
	
	@Autowired
	private SaleMapper salesMapper;
	
	@RequestMapping(value="/salesManagment", method=RequestMethod.GET)
	public String salesManagment(Model model){
		List<Map<String,Object>> salesList = salesMapper.selectSalesTable();
		model.addAttribute("sales", salesList);
		return "SalesView";
	}

}
