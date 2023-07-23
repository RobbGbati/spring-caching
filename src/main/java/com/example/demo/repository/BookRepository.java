package com.example.demo.repository;

import com.example.demo.model.Book;

public interface BookRepository {

	Book getByIsbn(String isbn);
}
