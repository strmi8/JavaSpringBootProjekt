package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Dvorana;

@Repository
public class DvoranaDAOImpl implements DvoranaDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Dvorana> getAll() {
		List<Dvorana> list = null;
		list = jdbcTemplate.query("SELECT *  FROM public.dvorana;", new BeanPropertyRowMapper<>(Dvorana.class));
		return list;
	}

	@Override
	public int save(Dvorana dvorana) {
		return jdbcTemplate.update("INSERT INTO public.dvorana (id_dvorana, naziv_dvorane, broj_mjesta, datum_otvaranja) values (?,?,?,?)", new Object[] {dvorana.getId_dvorana(), dvorana.getNaziv_dvorane(), dvorana.getBroj_mjesta(), dvorana.getDatum_otvaranja()});
	}

	@Override
	public int update(Dvorana dvorana, int id) {
		return jdbcTemplate.update("UPDATE public.dvorana SET naziv_dvorane =?, broj_mjesta =?, datum_otvaranja =? WHERE id_dvorana =?", new Object[] {dvorana.getNaziv_dvorane(), dvorana.getBroj_mjesta(), dvorana.getDatum_otvaranja(), id});
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("DELETE FROM public.dvorana WHERE id_dvorana =?", id);
	}

	@Override
	public Dvorana getById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM public.dvorana WHERE id_dvorana = ?", new BeanPropertyRowMapper<Dvorana>(Dvorana.class), id);
	}

}
