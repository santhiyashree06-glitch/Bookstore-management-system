package com.example.BookStore.model;

import jakarta.persistence.*;

@Entity
public class BookStore {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  int id;
  String name;
  String author;
  
  public BookStore() {
	super();
	// TODO Auto-generated constructor stub
  }
  public BookStore(String name, String author) {
	super();
	this.name = name;
	this.author = author;
  }
  public int getId() {
	return id;
  }
  public void setId(int id) {
	this.id = id;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getAuthor() {
	return author;
  }
  public void setAuthor(String author) {
	this.author = author;
  }
  
}
