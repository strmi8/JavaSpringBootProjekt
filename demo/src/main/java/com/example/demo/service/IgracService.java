package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Igrac;

public interface IgracService {
	
	public List<Igrac> getAllIgraci();
	
	Igrac getIgracById(int id);
	
	int deleteIgracById(int id);
	
	int saveIgrac(Igrac igrac);
	
	int updateIgrac(Igrac igrac,int id);

}
