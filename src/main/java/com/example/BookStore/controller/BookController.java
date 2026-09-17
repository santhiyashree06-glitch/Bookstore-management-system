package com.example.BookStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookStore.Service.BookService;
import com.example.BookStore.model.BookStore;

@RestController 
public class BookController {
 @Autowired
 BookService bs;
 @PostMapping("/book") 
 public BookStore get1(@RequestBody BookStore b)
 {
	 return bs.addbook(b);
 }
}
