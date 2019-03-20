package com.almeida.springdemo.spring5demo.repositories;

import com.almeida.springdemo.spring5demo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
