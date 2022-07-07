package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Klub;

public interface KlubService {
	
	public List<Klub> getAllKlubovi();
	
	Klub getKlubById(int id);
	
	int deleteKlubById(int id);
	
	int saveKlub(Klub klub);
	
	int updateKlub(Klub klub,int id);

}
