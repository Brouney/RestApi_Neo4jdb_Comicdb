package com.project.demo;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.ogm.annotation.Relationship;

public class ComicWrapper {
	public List<Character> characters;
	TextComic textComic;

	public List<Creator> creators;

	public List<Event> events;

	public List<Series> series;

	public List<Story> stories;

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

	public List<Character> getCharacters() {
		return characters;
	}

	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}

	public TextComic getTextComic() {
		return textComic;
	}

	public void setTextComic(TextComic textComic) {
		this.textComic = textComic;
	}

}
