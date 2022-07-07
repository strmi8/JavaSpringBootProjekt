package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Trener;


public interface TrenerDAO {
	
	int save(Trener trener);
	
	int update(Trener trener,int id);
	
	int delete(int id);

	List<Trener> getAll(); 
	
	Trener getById(int id);
}