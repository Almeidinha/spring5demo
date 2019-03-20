package com.almeida.springdemo.spring5demo.repositories;

import com.almeida.springdemo.spring5demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
