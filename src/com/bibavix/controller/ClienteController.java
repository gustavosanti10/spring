package com.bibavix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bibavix.dao.ClienteDao;
import com.bibavix.model.Cliente;

@Controller
public class ClienteController {
	@Autowired
	private ClienteDao clienteDao;
	
	@RequestMapping("/clientes")
	public String viewClients(Model m) {
		List<Cliente> listClient = clienteDao.listAllClients();
		m.addAttribute("listClient", listClient);
		return "viewclients";
	}
	
}
