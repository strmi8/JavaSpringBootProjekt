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

import com.example.demo.model.Trener;
import com.example.demo.service.TrenerService;


@RestController
public class TrenerController {
	
	@Autowired
	private TrenerService trenerService;
	
	@GetMapping(value="/treneri")
	ResponseEntity<?> getAllTreneri(){
		List<Trener> listaTrenera = trenerService.getAllTreneri();
		return new ResponseEntity<>(listaTrenera,HttpStatus.OK);
	}

	@GetMapping(value="/treneri/{id}")
	ResponseEntity<?> getTrenerById(@PathVariable int id){
		Trener trener = trenerService.getTrenerById(id);
		return new ResponseEntity<>(trener,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/treneri/{id}")
	ResponseEntity<?> deleteTrenerById(@PathVariable int id){
		int numOfRows = trenerService.deleteTrenerById(id);
		return new ResponseEntity<>(numOfRows + " trener izbrisana",HttpStatus.OK);
	}
	
	@PostMapping(value="/treneri")
	ResponseEntity<?> saveTrener(@RequestBody Trener trener){
		int numOfRows = trenerService.saveTrener(trener);
		return new ResponseEntity<>(numOfRows + " trener dodan",HttpStatus.OK);
	}
	
	@PutMapping("/treneri/{id}")
	ResponseEntity<?> updateTrener(@RequestBody Trener trener, @PathVariable int id){
		int numOfRows = trenerService.updateTrener(trener,id);
		return new  ResponseEntity<>(numOfRows + " trener updejtana", HttpStatus.OK);
	}
}
