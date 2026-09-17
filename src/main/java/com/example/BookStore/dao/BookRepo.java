package com.example.BookStore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookStore.model.BookStore;

public interface BookRepo extends JpaRepository<BookStore,Integer>{

}
