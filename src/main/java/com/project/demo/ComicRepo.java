package com.project.demo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ComicRepo extends Neo4jRepository<ComicIssue,Long> {

	ComicIssue getComicBookByName(String name);
}
