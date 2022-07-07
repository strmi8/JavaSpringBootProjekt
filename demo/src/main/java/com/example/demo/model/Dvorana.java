package com.example.demo.model;

import java.sql.Date;

public class Dvorana {
	
	private int id_dvorana;
	private String naziv_dvorane;
	private int broj_mjesta;
	private Date datum_otvaranja;
	
	
	public int getId_dvorana() {
		return id_dvorana;
	}
	public void setId_dvorana(int id_dvorana) {
		this.id_dvorana = id_dvorana;
	}
	public String getNaziv_dvorane() {
		return naziv_dvorane;
	}
	public void setNaziv_dvorane(String naziv_dvorane) {
		this.naziv_dvorane = naziv_dvorane;
	}
	public int getBroj_mjesta() {
		return broj_mjesta;
	}
	public void setBroj_mjesta(int broj_mjesta) {
		this.broj_mjesta = broj_mjesta;
	}
	public Date getDatum_otvaranja() {
		return datum_otvaranja;
	}
	public void setDatum_otvaranja(Date datum_otvaranja) {
		this.datum_otvaranja = datum_otvaranja;
	}
	
}
