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
@RequestMapping("/events")
public class EventController {
	private final EventRepo repo;

	public EventController(EventRepo repo) {
		this.repo = repo;
	}

	@GetMapping
	public Iterable<Event> getAllEvent() {
		return repo.findAll();
	}
	
	
	 @GetMapping("/{name}")
	    public Event getCharacterByName(@PathVariable String name) {
	        return repo.getEventByName(name);
	    }
	    
	    @PostMapping("/create")
	    public ResponseEntity<Event> createCharacter(@RequestBody Event event){
	    	
	    	repo.save(event);
	    	return new ResponseEntity<Event>(event,HttpStatus.OK);
	    	
	    }
}
