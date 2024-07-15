package com.srivath;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.srivath.entity.Book;
import com.srivath.repository.BookRepository;

@SpringBootApplication
public class Sb02DataJpaCrudRepoAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt = SpringApplication.run(Sb02DataJpaCrudRepoAppApplication.class, args);
		BookRepository repo = cxt.getBean(BookRepository.class);
		/*
		 * save methods
		 */
		
//		 repo.save(new Book(103,"AWS",3000.0));
//
//		Book book1 = new Book(104, "GCP", 3000.0);
//		Book book2 = new Book(105, "Azure", 4000.0);
//		Book book3 = new Book(106, "React", 5000.0);
//		repo.saveAll(Arrays.asList(book1, book2, book3));

		/*
		 * existsById and deleteById method
		 */
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter id of book which you want to delete:");
//		int id = scanner.nextInt();
//		if (repo.existsById(id)) {
//			repo.deleteById(id);
//			System.out.println("Book with id " + id + " deleted");
//		} else {
//			System.out.println("Book not found with id " + id);
//		}

		/*
		 * count method
		 */
		
//		System.out.println("Book table has " + repo.count() + " no of records.");

		/*
		 * find methods
		 */
		
//		Optional<Book> optional = repo.findById(102);
//		if (optional.isPresent()) {
//			System.out.println(optional.get().getBookName());
//		} else {
//			System.out.println("Book not present");
//		}

//		Iterable<Book> iterable = repo.findAllById(Arrays.asList(101, 102, 105, 108, 110, 105));
//		//note sql query executed by Hibernate: select b1_0.book_id,b1_0.book_name,b1_0.book_price from book b1_0 where b1_0.book_id in (?,?,?,?,?,?)
//		for (Book book : iterable) {
//			System.out.println("id=" + book.getBookId() + ", name=" + book.getBookName());
//		}

//		Iterable<Book> bookIterable = repo.findAll();
//		for (Book b : bookIterable) {
//			System.out.println("id=" + b.getBookId() + ", name=" + b.getBookName());
//		}

		/*
		 * findBy methods
		 * 
		 */
		
//		System.out.println("findByBookPriceGreaterThan");
//		List<Book> bookList = repo.findByBookPriceGreaterThan(3000.0);
//		bookList.stream().forEach(b -> System.out.println(b.getBookName() + " " + b.getBookPrice()));
//		System.out.println("===================================");
//		System.out.println("findByBookPrice");
//		Book book1 = repo.findByBookPrice(4000.0);
//		if (book1 != null) {
//			System.out.println(book1.getBookName());
//		} else {
//			System.out.println("Book not found!");
//		}
//		System.out.println("===================================");
//		System.out.println("findByBookPriceLessThan");
//		List<Book> lstBooks = repo.findByBookPriceLessThan(4000.0);
//		lstBooks.stream().map(b -> b.getBookName() + " " + b.getBookPrice()).forEach(b -> System.out.println(b));
//		System.out.println("===================================");
//		System.out.println("findByBookName");
//		Book book_01 = repo.findByBookName("React");
//		System.out.println(book_01);

		/*
		 * custom queries
		 */

		System.out.println("getBooksNative");
		List<Book> lst = repo.getBooksNative();
		lst.stream().map(b -> b.getBookName()).forEach(System.out::println);
		System.out.println("=========================");

		System.out.println("getBookJpql");
		List<Book> lst_01 = repo.getBookJpql();
		lst_01.stream().map(book -> book.getBookName()).forEach(System.out::println);
		
		
	}
}
