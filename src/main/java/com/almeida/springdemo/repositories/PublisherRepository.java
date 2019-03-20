package com.almeida.springdemo.repositories;

import com.almeida.springdemo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository  extends CrudRepository<Publisher, Long> {
}
