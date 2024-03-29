package com.danielgkneto.mcjavabc.craigslist;

import org.springframework.data.repository.CrudRepository;
import java.util.ArrayList;

public interface JobRepository extends CrudRepository<Job, Long> {
    ArrayList<Job> findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(String title, String author);
}
