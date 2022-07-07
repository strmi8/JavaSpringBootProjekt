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

import com.example.demo.model.Menader;
import com.example.demo.service.MenaderService;

@RestController
public class MenaderController {
	
	@Autowired
	private MenaderService menaderService;
	
	@GetMapping(value="/menadere")
	ResponseEntity<?> getAllMenaderi(){
		List<Menader> listaMenadera = menaderService.getAllMenaderi();
		return new ResponseEntity<>(listaMenadera,HttpStatus.OK);
	}
	
	@GetMapping(value="/menadere/{id}")
	ResponseEntity<?> getMenaderById(@PathVariable int id){
		Menader menader = menaderService.getMenaderById(id);
		return new ResponseEntity<>(menader,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/menadere/{id}")
	ResponseEntity<?> deleteMenaderById(@PathVariable int id){
		int numOfRows = menaderService.deleteMenaderById(id);
		return new ResponseEntity<>(numOfRows + " menader izbrisan",HttpStatus.OK);
	}
	
	@PostMapping(value="/menadere")
	ResponseEntity<?> saveMenader(@RequestBody Menader menader){
		int numOfRows = menaderService.saveMenader(menader);
		return new ResponseEntity<>(numOfRows + " menader dodan",HttpStatus.OK);
	}
	
	@PutMapping("/menadere/{id}")
	ResponseEntity<?> updateMenader(@RequestBody Menader menader, @PathVariable int id){
		int numOfRows = menaderService.updateMenader(menader, id);
		return new  ResponseEntity<>(numOfRows + " menader updejtan", HttpStatus.OK);
	}

}
