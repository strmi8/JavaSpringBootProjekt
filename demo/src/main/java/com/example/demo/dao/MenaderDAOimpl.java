package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Menader;

@Repository
public class MenaderDAOimpl implements MenaderDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(Menader menader) {
		return jdbcTemplate.update("insert into public.menader (id_menader, ime_menadera, prezime_menadera, oib, datum_rodenja) values (?,?,?,?,?)", new Object[] {menader.getId_menader(), menader.getIme_menadera(), menader.getPrezime_menadera(), menader.getOib(), menader.getDatum_rodenja()});
	}

	@Override
	public int update(Menader menader, int id) {
		return jdbcTemplate.update("UPDATE public.menader SET ime_menadera =?, prezime_menadera =?, oib =?, datum_rodenja =? WHERE id_menader =?", new Object[] { menader.getIme_menadera(),  menader.getPrezime_menadera(), menader.getOib(), menader.getDatum_rodenja(), id});
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("DELETE FROM public.menader WHERE id_menader =?", id);
	}

	@Override
	public List<Menader> getAll() {
		List<Menader> list = null;
		list = jdbcTemplate.query("select *  from menader;", new BeanPropertyRowMapper<>(Menader.class));
		return list;
	}

	@Override
	public Menader getById(int id) {
		return jdbcTemplate.queryForObject("select * from public.menader where id_menader = ?", new BeanPropertyRowMapper<Menader>(Menader.class), id);
	}

}
