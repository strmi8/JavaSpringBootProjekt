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

import com.example.demo.model.Dvorana;
import com.example.demo.service.DvoranaService;


@RestController
public class DvoranaController {
	
	@Autowired
	private DvoranaService dvoranaService;
	
	@GetMapping(value="/dvorane")
	ResponseEntity<?> getAllDvorane(){
		List<Dvorana> listaDvorana = dvoranaService.getAllDvorane();
		return new ResponseEntity<>(listaDvorana,HttpStatus.OK);
	}
	
	@GetMapping(value="/dvorane/{id}")
	ResponseEntity<?> getDvoranaById(@PathVariable int id){
		Dvorana dvorana = dvoranaService.getDvoranaById(id);
		return new ResponseEntity<>(dvorana,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/dvorane/{id}")
	ResponseEntity<?> deleteDvoraneById(@PathVariable int id){
		int numOfRows = dvoranaService.deleteDvoranaById(id);
		return new ResponseEntity<>(numOfRows + " Dvorana izbrisana",HttpStatus.OK);
	}
	
	@PostMapping(value="/dvorane")
	ResponseEntity<?> saveDvorana(@RequestBody Dvorana dvorana){
		int numOfRows = dvoranaService.saveDvorana(dvorana);
		return new ResponseEntity<>(numOfRows + " Dvorana dodana",HttpStatus.OK);
	}
	
	@PutMapping("/dvorane/{id}")
	ResponseEntity<?> updateDvorana(@RequestBody Dvorana dvorana, @PathVariable int id){
		int numOfRows = dvoranaService.updateDvorana(dvorana,id);
		return new  ResponseEntity<>(numOfRows + " Dvorana updejtana", HttpStatus.OK);
	}
}
