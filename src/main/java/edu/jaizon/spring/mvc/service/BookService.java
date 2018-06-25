package edu.jaizon.spring.mvc.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import edu.jaizon.spring.mvc.domain.Book;

public interface BookService {
	
	List<Book> findAll();
	Book findById(Long id);
	Book save(Book book);
	Page<Book> findAllByPage(Pageable pageable);
}