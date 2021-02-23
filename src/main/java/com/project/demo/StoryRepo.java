package com.project.demo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface StoryRepo extends Neo4jRepository<Story, Long>{
	Story getStoryByName(String name);
}
