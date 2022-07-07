package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Dvorana;

public interface DvoranaService {
	
	public List<Dvorana> getAllDvorane();
	
	Dvorana getDvoranaById(int id);
	
	int deleteDvoranaById(int id);
	
	int saveDvorana(Dvorana dvorana);
	
	int updateDvorana(Dvorana dvorana,int id);

}
