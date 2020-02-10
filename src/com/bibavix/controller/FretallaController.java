package com.bibavix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bibavix.dao.ClienteDao;
import com.bibavix.dao.FretallaDao;
import com.bibavix.dao.ZapatoDao;
import com.bibavix.model.Cliente;
import com.bibavix.model.Fretalla;
import com.bibavix.model.Zapato;

@Controller
public class FretallaController {

	@Autowired
	private FretallaDao fretallaDao;
	
	@Autowired
	private ClienteDao clienteDao;
	
	@Autowired
	private ZapatoDao  zapatoDao;
	
	
	@RequestMapping("/registro")
	public String register(Model m) {
		Fretalla fretalla = new Fretalla();
		List<Cliente> listClient = clienteDao.listAllClients();
		List<Zapato> listShoe = zapatoDao.listAllShoes();
		m.addAttribute("listClient", listClient);
		m.addAttribute("listShoe", listShoe);
		m.addAttribute("fretalla",fretalla);
		return "register";
	}
	
	@RequestMapping(name = "/tallas", method = RequestMethod.POST)
	public String saveFretalla(@ModelAttribute("fretalla") Fretalla fretalla, Model m) {
		fretallaDao.save(fretalla);
		List<Fretalla> listFretalla = fretallaDao.listAllFretallas();
		m.addAttribute("listFretalla", listFretalla);
		return "/viewsize";
	}
	
	@RequestMapping("/frecuentes")
	public String viewFrequency(Model m) {
		Fretalla fretalla = new Fretalla();
		long id = fretalla.getFrecuencia(fretallaDao.listAllFretallas()).getZapato();
		m.addAttribute("frezapato", zapatoDao.searchBy(id));
		return "/viewfrequency";
	}
	@RequestMapping("/tallasusadas")
	public String talla(Model m) {
		List<Fretalla> listFretalla = fretallaDao.listAllFretallas();
		m.addAttribute("listFretalla", listFretalla);
		return "viewsize";
	}
	
}
