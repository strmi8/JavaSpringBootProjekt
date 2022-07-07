package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Pozicija;

@Repository
public class PozicijaDAOimpl implements PozicijaDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Pozicija> getAll() {
		List<Pozicija> list = null;
		list = jdbcTemplate.query("SELECT *  FROM public.pozicija;", new BeanPropertyRowMapper<>(Pozicija.class));
		return list;
	}

	@Override
	public int save(Pozicija pozicija) {
		return jdbcTemplate.update("INSERT INTO public.pozicija (id_pozicija, naziv_pozicije) values (?,?)", new Object[] {pozicija.getId_pozicija(), pozicija.getNaziv_pozicije()});
	}

	@Override
	public int update(Pozicija pozicija, int id) {
		return jdbcTemplate.update("UPDATE public.pozicija SET naziv_pozicije =? WHERE id_pozicija =?", new Object[] {pozicija.getNaziv_pozicije(), id});
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("DELETE FROM public.pozicija WHERE id_pozicija =?", id);
	}

	@Override
	public Pozicija getById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM public.pozicija WHERE id_pozicija = ?", new BeanPropertyRowMapper<Pozicija>(Pozicija.class), id);
	}

}
