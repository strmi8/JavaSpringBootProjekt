package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PozicijaDAO;
import com.example.demo.model.Pozicija;

@Service
public class PozicijaServiceimpl implements PozicijaService {

	@Autowired
	private PozicijaDAO pozicijaDao;
	
	@Override
	public List<Pozicija> getAllPozicije() {
		return pozicijaDao.getAll();
	}

	@Override
	public Pozicija getPozicijaById(int id) {
		return pozicijaDao.getById(id);
	}

	@Override
	public int deletePozicijaById(int id) {
		return pozicijaDao.delete(id);
	}

	@Override
	public int savePozicija(Pozicija pozicija) {
		return pozicijaDao.save(pozicija);
	}

	@Override
	public int updatePozicija(Pozicija pozicija, int id) {
		return pozicijaDao.update(pozicija, id);
	}

}
