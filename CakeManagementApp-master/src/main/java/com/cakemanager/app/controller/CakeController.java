package com.cakemanager.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakemanager.app.entities.CakeEntity;
import com.cakemanager.app.service.CakeService;

@Controller
public class CakeController {

	@Autowired
	private CakeService cakeService;
	
	@GetMapping(value="/")
	public String createTicket(Model model){
		model.addAttribute("cakeList", cakeService.getAllCakes());
		return "index";
	}
	
	@PostMapping(value="/save-cake")
	public String saveCake(@ModelAttribute CakeEntity cakeEntity,Model model ) {
	
		cakeService.createCake(cakeEntity);
		return "redirect:/";
	}
	
}
