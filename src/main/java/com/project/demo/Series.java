package com.project.demo;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Series {
	
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private Integer startYear, endYear;

	public String getName() {
		return name;
	}

	public Series() {
	}

	public Series(String name, Integer startYear, Integer endYear) {

		this.name = name;
		this.startYear = startYear;
		this.endYear = endYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStartYear() {
		return startYear;
	}

	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
	}

	public Integer getEndYear() {
		return endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}
}
