package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Menader;

public interface MenaderService {
	
	public List<Menader> getAllMenaderi();
	
	Menader getMenaderById(int id);
	
	int deleteMenaderById(int id);
	
	int saveMenader(Menader menader);
	
	int updateMenader(Menader menader,int id);

}
