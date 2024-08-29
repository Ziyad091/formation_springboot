package com.dev.formation_springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.dev.formation_springboot.classes.Produit;
import com.dev.formation_springboot.repositories.ProduitRepository;

import lombok.Getter;

@Service
public class ProduitService {
	
	@Autowired
	private ProduitRepository produitRepository; 
		
	public void create(Produit produit) {
		produit.setId(0);
		produit.setActif(true);
		produitRepository.save(produit);
		
	}
		
	public Produit getProduit(int id) {
		
		return produitRepository.findById(id).orElse(null);
		 
	}

	public List<Produit> getProduits() {
		
		return produitRepository.findAll();
		
	}
	
   public List<Produit> getProduitsActif() {
		List<Produit> produits =  this.getProduits();
	   
		return  null;
	}
	
}
