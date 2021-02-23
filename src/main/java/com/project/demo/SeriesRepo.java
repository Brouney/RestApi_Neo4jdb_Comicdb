package com.project.demo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface SeriesRepo extends Neo4jRepository<Series, Long>{
	Series getSeriesByName(String name);
}
