package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Trener;



@Repository
public class TrenerDAOImpl implements TrenerDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(Trener trener) {
		return jdbcTemplate.update("insert into public.trener (id_trenera, ime_trenera, prezime_trenera, vrsta_trenera, id_kluba) values (?,?,?,?,?)", new Object[] {trener.getId_trenera(), trener.getIme_trenera(), trener.getPrezime_trenera(), trener.getVrsta_trenera(), trener.getId_kluba()});
	}

	@Override
	public int update(Trener trener, int id) {
		return jdbcTemplate.update("UPDATE public.trener SET ime_trenera =?, prezime_trenera =?, vrsta_trenera =?, id_kluba =? WHERE id_trenera =?", new Object[] {  trener.getIme_trenera(),  trener.getPrezime_trenera(), trener.getVrsta_trenera(), trener.getId_kluba(), id});
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("DELETE FROM public.trener WHERE id_trenera =?", id);
	}

	@Override
	public List<Trener> getAll() {
		List<Trener> list = null;
		list = jdbcTemplate.query("select *  from trener;", new BeanPropertyRowMapper<>(Trener.class));
		return list;
	}

	@Override
	public Trener getById(int id) {
		return jdbcTemplate.queryForObject("select * from public.trener where id_trenera = ?", new BeanPropertyRowMapper<Trener>(Trener.class), id);
	}

}
