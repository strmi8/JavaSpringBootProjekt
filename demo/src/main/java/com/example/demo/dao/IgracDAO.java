package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Igrac;


public interface IgracDAO {
	
	int save(Igrac igrac);
	
	int update(Igrac igrac,int id);
	
	int delete(int id);

	List<Igrac> getAll(); 
	
	Igrac getById(int id);
}
