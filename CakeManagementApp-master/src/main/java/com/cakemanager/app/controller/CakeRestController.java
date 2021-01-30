package com.cakemanager.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cakemanager.app.entities.CakeEntity;
import com.cakemanager.app.service.CakeService;

@RestController
public class CakeRestController {

	@Autowired
	private CakeService cakeService;
	
	@GetMapping(value="/cakes")
	public Iterable<CakeEntity> getAllCakes(Model model){
		return cakeService.getAllCakes();
	}
}
