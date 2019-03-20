package com.almeida.springdemo.spring5demo.repositories;

import com.almeida.springdemo.spring5demo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository  extends CrudRepository<Publisher, Long> {
}
