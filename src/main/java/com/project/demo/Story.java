package com.project.demo;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Story {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	public String getName() {
		return name;
	}

	public Story() {}
	
	public Story(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
