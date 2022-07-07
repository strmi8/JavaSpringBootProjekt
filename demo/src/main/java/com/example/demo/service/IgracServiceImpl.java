package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IgracDAO;
import com.example.demo.model.Igrac;

@Service
public class IgracServiceImpl implements IgracService {

	@Autowired
	private IgracDAO igracDao;
	
	@Override
	public List<Igrac> getAllIgraci() {
		return igracDao.getAll();
	}

	@Override
	public Igrac getIgracById(int id) {
		return igracDao.getById(id);
	}

	@Override
	public int deleteIgracById(int id) {
		return igracDao.delete(id);
	}

	@Override
	public int saveIgrac(Igrac igrac) {
		return igracDao.save(igrac);
	}

	@Override
	public int updateIgrac(Igrac igrac, int id) {
		return igracDao.update(igrac, id);
	}

}
