package com.MyBookstoreAdmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MyBookstoreAdmin.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
