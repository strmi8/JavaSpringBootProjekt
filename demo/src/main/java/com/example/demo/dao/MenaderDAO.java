package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Menader;



public interface MenaderDAO {
	
	int save(Menader menader);
	
	int update(Menader menader,int id);
	
	int delete(int id);

	List<Menader> getAll(); 
	
	Menader getById(int id);
}

