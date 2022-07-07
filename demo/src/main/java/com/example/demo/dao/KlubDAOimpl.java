package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Klub;

@Repository
public class KlubDAOimpl implements KlubDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int save(Klub klub)  {
		return jdbcTemplate.update("insert into public.klub (id_kluba, ime_kluba, mjesto_kluba, id_dvorana) values (?,?,?,?)", new Object[] {klub.getId_kluba(), klub.getIme_kluba(), klub.getMjesto_kluba(), klub.getId_dvorana()});
	}

	@Override
	public int update(Klub klub, int id) {
		return jdbcTemplate.update("UPDATE public.klub SET ime_kluba =?, mjesto_kluba =?, id_dvorana =? WHERE id_kluba =?", new Object[] {klub.getIme_kluba(),  klub.getMjesto_kluba(), klub.getId_dvorana(), id});
	}


	@Override
	public int delete(int id) {
		return jdbcTemplate.update("DELETE FROM public.klub WHERE id_kluba =?", id);
	}

	@Override
	public List<Klub> getAll() {
		List<Klub> list = null;
		list = jdbcTemplate.query("select *  from klub;", new BeanPropertyRowMapper<>(Klub.class));
		return list;
	}

	@Override
	public Klub getById(int id) {
		return jdbcTemplate.queryForObject("select * from public.klub where id_kluba = ?", new BeanPropertyRowMapper<Klub>(Klub.class), id);
	}

}
