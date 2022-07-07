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

import com.example.demo.model.Igrac;
import com.example.demo.service.IgracService;

@RestController
public class IgracController {
	
	@Autowired
	private IgracService igracService;
	
	@GetMapping(value="/igraci")
	ResponseEntity<?> getAllIgraci(){
		List<Igrac> listaIgraca = igracService.getAllIgraci();
		return new ResponseEntity<>(listaIgraca,HttpStatus.OK);
	}
	
	@GetMapping(value="/igraci/{id}")
	ResponseEntity<?> getIgracById(@PathVariable int id){
		Igrac igrac = igracService.getIgracById(id);
		return new ResponseEntity<>(igrac,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/igraci/{id}")
	ResponseEntity<?> deleteIgracById(@PathVariable int id){
		int numOfRows = igracService.deleteIgracById(id);
		return new ResponseEntity<>(numOfRows + " igrac izbrisan",HttpStatus.OK);
	}
	
	@PostMapping(value="/igraci")
	ResponseEntity<?> saveIgrac(@RequestBody Igrac igrac){
		int numOfRows = igracService.saveIgrac(igrac);
		return new ResponseEntity<>(numOfRows + " igrac dodan",HttpStatus.OK);
	}

	@PutMapping("/igraci/{id}")
	ResponseEntity<?> updateIgrac(@RequestBody Igrac igrac, @PathVariable int id){
		int numOfRows = igracService.updateIgrac(igrac,id);
		return new  ResponseEntity<>(numOfRows + " igrac updatean", HttpStatus.OK);
	}
}
