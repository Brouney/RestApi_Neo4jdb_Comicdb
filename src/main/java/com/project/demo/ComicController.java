package com.project.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comics")
public class ComicController {

	@Autowired
	private final ComicRepo comicRepo;
	
	private ComicIssue comicIssue;
	private Integer comicID;
	public ComicController(ComicRepo comicRepo) {
		this.comicRepo = comicRepo; 
	}

	@GetMapping
	public Iterable<ComicIssue> finAll() {
		return comicRepo.findAll();
	}

	@GetMapping("/{name}")
	public ComicIssue getComicIssueByName(@PathVariable String name,Model model) {
		ComicIssue comicIssu2 = comicRepo.getComicBookByName(name);
		
		return comicIssu2;
	}
	
	
	
	@PostMapping("/create")
	public ResponseEntity<ComicWrapper> createComic(@RequestBody ComicWrapper comicwrapper ) {
		
		this.comicIssue = new ComicIssue();
		this.comicIssue.setName(comicwrapper.getTextComic().getName());
		this.comicIssue.setImagefile(comicwrapper.getTextComic().getImagefile());
		this.comicIssue.setCountOfPages(comicwrapper.getTextComic().getCountOfPages());
		this.comicIssue.setBookNumber(comicwrapper.getTextComic().getBookNumber());
		this.comicIssue.setCharacters(comicwrapper.getCharacters());
		this.comicIssue.setCreators(comicwrapper.getCreators());
		this.comicIssue.setEvents(comicwrapper.getEvents());
		this.comicIssue.setSeries(comicwrapper.getSeries());
		this.comicIssue.setStories(comicwrapper.getStories());
		comicRepo.save(this.comicIssue);
		return new ResponseEntity<ComicWrapper>(comicwrapper,HttpStatus.OK);
	}
	
	
}
