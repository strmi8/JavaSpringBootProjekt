package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Trener;

public interface TrenerService {
	
	public List<Trener> getAllTreneri();
	
	Trener getTrenerById(int id);
	
	int deleteTrenerById(int id);
	
	int saveTrener(Trener trener);
	
	int updateTrener(Trener trener,int id);

}
