package com.project.demo;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@NodeEntity
public class ComicIssue {

	@Id
	@GeneratedValue
	private Long id;

	@Property(name = "name")
	private String name;
	
	@Property(name = "imagefile")
	private String imagefile;
	
	@Property(name = "countOfPages")
	private Integer countOfPages;
	
	@Property(name = "bookNumber")
	private Double bookNumber;

	
	@Relationship(type = "INCLUDES")
	@JsonIgnoreProperties("characterComics")
	public List<Character> characters = new ArrayList<>();

	
	@Relationship(type = "CREATED_BY")
	public List<Creator> creators = new ArrayList<>();

	@Relationship(type = "PART_OF")
	public List<Event> events = new ArrayList<>();

	@Relationship(type = "BELONGS_TO")
	public List<Series> series = new ArrayList<>();

	@Relationship(type = "MADE_OF")
	public List<Story> stories = new ArrayList<>();

	public ComicIssue() {
	}

	public ComicIssue(String name, String imagefile, Integer countOfPages, Double bookNumber) {

		this.name = name;
		this.imagefile = imagefile;
		this.countOfPages = countOfPages;
		this.bookNumber = bookNumber;
	}

	public List<Creator> getCreators() {
		return creators;
	}

	public void setCreators(List<Creator> creators) {
		this.creators = creators;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public List<Series> getSeries() {
		return series;
	}

	public void setSeries(List<Series> series) {
		this.series = series;
	}

	public List<Story> getStories() {
		return stories;
	}

	public void setStories(List<Story> stories) {
		this.stories = stories;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImagefile() {
		return imagefile;
	}

	public void setImagefile(String imagefile) {
		this.imagefile = imagefile;
	}

	public Integer getCountOfPages() {
		return countOfPages;
	}

	public void setCountOfPages(Integer countOfPages) {
		this.countOfPages = countOfPages;
	}

	public Double getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(Double bookNumber) {
		this.bookNumber = bookNumber;
	}

	public List<Character> getCharacters() {
		return characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}
	
}
