package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.KlubDAO;
import com.example.demo.model.Klub;

@Service
public class KlubServiceImpl implements KlubService {
	
	@Autowired
	private KlubDAO klubDao;

	@Override
	public List<Klub> getAllKlubovi() {
		return klubDao.getAll();
	}

	@Override
	public Klub getKlubById(int id) {
		return klubDao.getById(id);
	}

	@Override
	public int deleteKlubById(int id) {
		return klubDao.delete(id);
	}

	@Override
	public int saveKlub(Klub klub) {
		return klubDao.save(klub);
	}

	@Override
	public int updateKlub(Klub klub, int id) {
		return klubDao.update(klub, id);
	}

}
