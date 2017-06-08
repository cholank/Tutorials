/**
 * 
 */
package com.test.springboot.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author Cholan
 *
 */
@RestController
@EnableAutoConfiguration
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/")
	public String getM() {
		return "REST Service Success";
	}

	@RequestMapping("/topic")
	public String getTopic() {
		return "topic";
	}

	@RequestMapping("/lists")
	public List<String> getList() {
		List<String> list = new ArrayList<String>();
		list.add("val1");
		list.add("val2");
		list.add("val3");
		return list;
	}

	@RequestMapping("/books")
	public List<Book> getBook() {
		Book book1 = new Book(1, "Book name1");
		Book book2 = new Book(2, "Book name2");
		List<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		return books;
	}

	@RequestMapping("/tester")
	public String tester() {
		return "Success test ";
	}
}
