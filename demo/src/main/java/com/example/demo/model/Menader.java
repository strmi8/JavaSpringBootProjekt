package com.example.demo.model;

import java.sql.Date;

public class Menader {
	
	private int id_menader;
	private String ime_menadera;
	private String prezime_menadera;
	private String oib;
	private Date datum_rodenja;
	
	
	public int getId_menader() {
		return id_menader;
	}
	public void setId_menader(int id_menader) {
		this.id_menader = id_menader;
	}
	public String getIme_menadera() {
		return ime_menadera;
	}
	public void setIme_menadera(String ime_menadera) {
		this.ime_menadera = ime_menadera;
	}
	public String getPrezime_menadera() {
		return prezime_menadera;
	}
	public void setPrezime_menadera(String prezime_menadera) {
		this.prezime_menadera = prezime_menadera;
	}
	public String getOib() {
		return oib;
	}
	public void setOib(String oib) {
		this.oib = oib;
	}
	public Date getDatum_rodenja() {
		return datum_rodenja;
	}
	public void setDatum_rodenja(Date datum_rodenja) {
		this.datum_rodenja = datum_rodenja;
	}
}
