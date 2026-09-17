package com.example.BookStore.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookStore.dao.BookRepo;
import com.example.BookStore.model.BookStore;

@Service
public class BookService {
@Autowired
BookRepo br;
public BookStore addbook(BookStore b)
{
	return br.save(b);
}
}
