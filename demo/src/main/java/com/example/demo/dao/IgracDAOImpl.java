package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Igrac;

@Repository
public class IgracDAOImpl implements IgracDAO {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Igrac igrac) {
		return jdbcTemplate.update("insert into public.igrac (id_igraca, ime_igraca, prezime_igrac, broj_dresa, id_pozicija, id_kluba, id_menader) values (?,?,?,?,?,?,?)", new Object[] {igrac.getId_igraca(), igrac.getIme_igraca(), igrac.getPrezime_igrac(), igrac.getBroj_dresa(), igrac.getId_pozicija(), igrac.getId_kluba(), igrac.getId_menader()});
	}

	@Override
	public int update(Igrac igrac, int id) {
		return jdbcTemplate.update("UPDATE public.igrac SET ime_igraca =?, prezime_igrac =?, broj_dresa =?, id_pozicija =?, id_kluba =?, id_menader =? WHERE id_igraca =?", new Object[] {  igrac.getIme_igraca(),  igrac.getPrezime_igrac(), igrac.getBroj_dresa(), igrac.getId_pozicija(), igrac.getId_kluba(), igrac.getId_menader(), id});
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("DELETE FROM public.igrac WHERE id_igraca =?", id);
	}

	@Override
	public List<Igrac> getAll() {
		List<Igrac> list = null;
		list = jdbcTemplate.query("select *  from igrac;", new BeanPropertyRowMapper<>(Igrac.class));
		return list;
	}

	@Override
	public Igrac getById(int id) {
		return jdbcTemplate.queryForObject("select * from public.igrac where id_igraca = ?", new BeanPropertyRowMapper<Igrac>(Igrac.class), id);
	}

}
