package com.almeida.springdemo.repositories;

import com.almeida.springdemo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
