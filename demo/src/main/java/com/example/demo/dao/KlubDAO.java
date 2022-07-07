package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Klub;



public interface KlubDAO {
	
	int save(Klub klub);
	
	int update(Klub klub,int id);
	
	int delete(int id);

	List<Klub> getAll(); 
	
	Klub getById(int id);
	
}