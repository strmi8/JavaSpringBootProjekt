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

import com.example.demo.model.Klub;
import com.example.demo.service.KlubService;

@RestController
public class KlubController {
	
	@Autowired 
	private KlubService klubService;
	
	@GetMapping(value="/klubovi")
	ResponseEntity<?> getAllKlubovi(){
		List<Klub> listaKlubova = klubService.getAllKlubovi();
		return new ResponseEntity<>(listaKlubova,HttpStatus.OK);
	}
	
	@GetMapping(value="/klubovi/{id}")
	ResponseEntity<?> getKlubById(@PathVariable int id){
		Klub klub = klubService.getKlubById(id);
		return new ResponseEntity<>(klub,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/klubovi/{id}")
	ResponseEntity<?> deleteKlubById(@PathVariable int id){
		int numOfRows = klubService.deleteKlubById(id);
		return new ResponseEntity<>(numOfRows + " klub izbrisan",HttpStatus.OK);
	}
	
	@PostMapping(value="/klubovi")
	ResponseEntity<?> saveKlub(@RequestBody Klub klub){
		int numOfRows = klubService.saveKlub(klub);
		return new ResponseEntity<>(numOfRows + " klub dodan",HttpStatus.OK);
	}
	
	@PutMapping("/klubovi/{id}")
	ResponseEntity<?> updateKlub(@RequestBody Klub klub, @PathVariable int id){
		int numOfRows = klubService.updateKlub(klub, id);
		return new  ResponseEntity<>(numOfRows + " klub updejtan", HttpStatus.OK);
	}
	
}
