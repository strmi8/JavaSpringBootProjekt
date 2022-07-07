package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Dvorana;

public interface DvoranaDAO {
	
	List<Dvorana> getAll(); 
	
	int save(Dvorana dvorana);
	
	int update(Dvorana dvorana,int id);
	
	int delete(int id);

	Dvorana getById(int id);
	

}
