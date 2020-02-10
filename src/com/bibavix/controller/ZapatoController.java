package com.bibavix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bibavix.dao.ZapatoDao;
import com.bibavix.model.Zapato;

@Controller
public class ZapatoController {
	@Autowired
	private ZapatoDao dao;
	
	@RequestMapping("/zapatos")
	public String viewShoes(Model m) {
		List<Zapato> listShoes = dao.listAllShoes();
		m.addAttribute("listShoes",listShoes);
		return "viewshoes";
	}
	

}
