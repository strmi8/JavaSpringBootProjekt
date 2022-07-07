package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DvoranaDAO;
import com.example.demo.model.Dvorana;

@Service
public class DvoranaServiceImpl implements DvoranaService {
	
	@Autowired
	private DvoranaDAO dvoranaDao;

	@Override
	public List<Dvorana> getAllDvorane() {
		return dvoranaDao.getAll();
	}

	@Override
	public Dvorana getDvoranaById(int id) {
		return dvoranaDao.getById(id);
	}

	@Override
	public int deleteDvoranaById(int id) {
		return dvoranaDao.delete(id);
	}

	@Override
	public int saveDvorana(Dvorana dvorana) {
		return dvoranaDao.save(dvorana);
	}

	@Override
	public int updateDvorana(Dvorana dvorana, int id) {
		return dvoranaDao.update(dvorana, id);
	}

}
