package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MenaderDAO;
import com.example.demo.model.Menader;


@Service
public class MenaderServiceImpl implements MenaderService {

	@Autowired
	private MenaderDAO menaderDao;
	
	@Override
	public List<Menader> getAllMenaderi() {
		return menaderDao.getAll();
	}

	@Override
	public Menader getMenaderById(int id) {
		return menaderDao.getById(id);
	}

	@Override
	public int deleteMenaderById(int id) {
		return menaderDao.delete(id);
	}

	@Override
	public int saveMenader(Menader menader) {
		return menaderDao.save(menader);
	}

	@Override
	public int updateMenader(Menader menader, int id) {
		return menaderDao.update(menader, id);
	}

}
