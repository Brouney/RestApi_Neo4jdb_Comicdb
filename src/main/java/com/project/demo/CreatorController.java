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
@RequestMapping("/creators")
public class CreatorController {

	private final CreatorRepo repo;

	public CreatorController(CreatorRepo repo) {
		this.repo = repo;
	}

	@GetMapping
	public Iterable<Creator> getAllCreators() {
		return repo.findAll();
	}
	
	@GetMapping("/{name}")
    public Character getCreatorByName(@PathVariable String name) {
        return repo.getCreatorByName(name);
    }
    
    @PostMapping("/create")
    public ResponseEntity<Creator> createCharacter(@RequestBody Creator creator){
    	
    	repo.save(creator);
    	return new ResponseEntity<Creator>(creator,HttpStatus.OK);
    	
    }

}
