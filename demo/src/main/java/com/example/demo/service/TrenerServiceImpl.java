package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TrenerDAO;
import com.example.demo.model.Trener;

@Service
public class TrenerServiceImpl implements TrenerService {
	
	@Autowired
	private TrenerDAO trenerDao;

	@Override
	public List<Trener> getAllTreneri() {
		return trenerDao.getAll();
	}

	@Override
	public Trener getTrenerById(int id) {
		return trenerDao.getById(id);
	}

	@Override
	public int deleteTrenerById(int id) {
		return trenerDao.delete(id);
	}

	@Override
	public int saveTrener(Trener trener) {
		return trenerDao.save(trener);
	}

	@Override
	public int updateTrener(Trener trener, int id) {
		return trenerDao.update(trener, id);
	}

}
