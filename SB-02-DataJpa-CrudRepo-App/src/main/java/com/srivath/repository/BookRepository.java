package com.srivath.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.srivath.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	/*
	 * findBy methods - methods name is very important
	 */

	public List<Book> findByBookPriceGreaterThan(Double price);

	public Book findByBookPrice(Double price);

	public List<Book> findByBookPriceLessThan(Double price);

	public Book findByBookName(String name);

	/*
	 * custom queries
	 */
	@Query(value = "select * from book;", nativeQuery = true)
	public List<Book> getBooksNative();
	
	@Query(value = "from Book")
	public List<Book> getBookJpql();
	

}
