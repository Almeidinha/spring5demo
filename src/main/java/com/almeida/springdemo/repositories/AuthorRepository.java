package com.almeida.springdemo.repositories;

import com.almeida.springdemo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
