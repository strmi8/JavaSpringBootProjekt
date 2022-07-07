package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Pozicija;

public interface PozicijaDAO {
	
	List<Pozicija> getAll(); 
	
	int save(Pozicija pozicija);
	
	int update(Pozicija pozicija,int id);
	
	int delete(int id);

	Pozicija getById(int id);
	

}