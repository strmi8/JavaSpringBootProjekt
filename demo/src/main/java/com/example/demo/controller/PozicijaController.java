package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pozicija;
import com.example.demo.service.PozicijaService;

@RestController
public class PozicijaController {

	
	@Autowired
	private PozicijaService pozicijaService;
	
	@GetMapping(value="/pozicije")
	ResponseEntity<?> getAllPozicije(){
		List<Pozicija> listaPozicija = pozicijaService.getAllPozicije();
		return new ResponseEntity<>(listaPozicija,HttpStatus.OK);
	}
	
	@GetMapping(value="/pozicije/{id}")
	ResponseEntity<?> getPozicijaById(@PathVariable int id){
		Pozicija pozicija = pozicijaService.getPozicijaById(id);
		return new ResponseEntity<>(pozicija,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/pozicije/{id}")
	ResponseEntity<?> deletePozicijaById(@PathVariable int id){
		int numOfRows = pozicijaService.deletePozicijaById(id);
		return new ResponseEntity<>(numOfRows + " Pozicija izbrisana",HttpStatus.OK);
	}
	
	@PostMapping(value="/pozicije")
	ResponseEntity<?> savePozicija(@RequestBody Pozicija pozicija){
		int numOfRows = pozicijaService.savePozicija(pozicija);
		return new ResponseEntity<>(numOfRows + " Pozicija dodana",HttpStatus.OK);
	}
	
	@PutMapping("/pozicije/{id}")
	ResponseEntity<?> updatePozicija(@RequestBody Pozicija pozicija, @PathVariable int id){
		int numOfRows = pozicijaService.updatePozicija(pozicija,id);
		return new  ResponseEntity<>(numOfRows + " pozicija updejtana", HttpStatus.OK);
	}
}
