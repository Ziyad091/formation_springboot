package com.dev.formation_springboot.controllers;

import java.lang.ModuleLayer.Controller;
import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.formation_springboot.classes.Produit;
import com.dev.formation_springboot.services.ProduitService;

@RestController
@RequestMapping("/formation-springboot/produit")
public class ProduitController {

	@Autowired
	ProduitService produitService;
	
	@PostMapping("/create")
	public ResponseEntity<Void> create(@RequestBody Produit produit) {
		produitService.create(produit);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produit> getProduit(@PathVariable int id) {
		return ResponseEntity.ok(produitService.getProduit(id));
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Produit>> getProduits() {
		
		return  ResponseEntity.ok(produitService.getProduits());
	}
	
}
