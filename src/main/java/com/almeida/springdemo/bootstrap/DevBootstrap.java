package com.almeida.springdemo.spring5demo.bootstrap;

import com.almeida.springdemo.spring5demo.model.Author;
import com.almeida.springdemo.spring5demo.model.Book;
import com.almeida.springdemo.spring5demo.model.Publisher;
import com.almeida.springdemo.spring5demo.repositories.AuthorRepository;
import com.almeida.springdemo.spring5demo.repositories.BookRepository;
import com.almeida.springdemo.spring5demo.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository =publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
    private void initData() {

        Author author;
        Book book;
        Publisher publisher;


        // Eric
        publisher = new Publisher();
        publisher.setName("Harper Collins");
        publisherRepository.save(publisher);

        author = new Author("Eric", "Evans");
        book = new Book("Domain Driven Design", "1234", publisher);
        author.getBooks().add(book);
        book.getAuthors().add(author);

        authorRepository.save(author);
        bookRepository.save(book);



        // Rod
        publisher = new Publisher();
        publisher.setName("Worx");
        publisherRepository.save(publisher);

        author = new Author("Rod", "Jhonson");
        book = new Book("J2EE Development without EJB", "23444", publisher);
        author.getBooks().add(book);
        book.getAuthors().add(author);

        authorRepository.save(author);
        bookRepository.save(book);
    }



}
