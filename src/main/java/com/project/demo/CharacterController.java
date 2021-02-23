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
@RequestMapping("/characters")
public class CharacterController {
    private final CharacterRepo characterRepo;

    public CharacterController(CharacterRepo characterRepo) {
        this.characterRepo = characterRepo;
    }

    @GetMapping
    public Iterable<Character> findAll() {
        return characterRepo.findAll();
    }

    @GetMapping("/{name}")
    public Character getCharacterByName(@PathVariable String name) {
        return characterRepo.getCharacterByName(name);
    }
    
    @PostMapping("/create")
    public ResponseEntity<Character> createCharacter(@RequestBody Character character){
    	
    	characterRepo.save(character);
    	return new ResponseEntity<Character>(character,HttpStatus.OK);
    	
    }
    
    
}