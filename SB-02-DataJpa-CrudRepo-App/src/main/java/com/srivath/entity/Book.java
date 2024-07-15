package com.srivath.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	
	public Book() {
	}

	public Book(Integer bookId, String bookName, Double bookPrice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

}
