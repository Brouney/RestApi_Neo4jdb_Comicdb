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
@RequestMapping("/stories")
public class StoryController {

	private final StoryRepo repo;

	public StoryController(StoryRepo repo) {
		this.repo = repo;
	}
	
	@GetMapping
	public Iterable<Story> getAllStories() {
		return repo.findAll();
	}
	 @GetMapping("/{name}")
	    public Story getCharacterByName(@PathVariable String name) {
	        return repo.getStoryByName(name);
	    }
	    
	    @PostMapping("/create")
	    public ResponseEntity<Story> createCharacter(@RequestBody Story story){
	    	
	    	repo.save(story);
	    	return new ResponseEntity<Story>(story,HttpStatus.OK);
	    	
	    }
}
