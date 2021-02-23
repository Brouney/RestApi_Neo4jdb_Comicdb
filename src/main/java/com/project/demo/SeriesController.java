package com.project.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class SeriesController {
	private final SeriesRepo repo;

	public SeriesController(SeriesRepo repo) {
		this.repo = repo;
	}

	@GetMapping
	public Iterable<Series> getAllSeries() {
		return repo.findAll();
	}
	
	 @GetMapping("/{name}")
	    public Series getSeriesByName(@PathVariable String name) {
	        return repo.getSeriesByName(name);
	    }
	    
	    @PostMapping("/create")
	    public ResponseEntity<Series> createCharacter(@RequestBody Series series){
	    	
	    	repo.save(series);
	    	return new ResponseEntity<Series>(series,HttpStatus.OK);
	    	
	    }
}
