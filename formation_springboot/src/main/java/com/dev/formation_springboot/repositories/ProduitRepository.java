package com.dev.formation_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.formation_springboot.classes.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Integer> {
	
	

}
