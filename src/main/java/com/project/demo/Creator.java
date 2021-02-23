package com.project.demo;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Creator {

	@Id
	@GeneratedValue
	private Long Id;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Creator() {
	}

	public Creator(String name) {

		this.name = name;
	}

}
