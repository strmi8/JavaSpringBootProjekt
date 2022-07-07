package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Pozicija;

public interface PozicijaService {
	
	public List<Pozicija> getAllPozicije();
	
	Pozicija getPozicijaById(int id);
	
	int deletePozicijaById(int id);
	
	int savePozicija(Pozicija pozicija);
	
	int updatePozicija(Pozicija pozicija,int id);

}