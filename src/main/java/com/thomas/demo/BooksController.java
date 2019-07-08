package com.thomas.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return Arrays.asList(
				new Book(1l, "The Ultimate Martini Recipes", "Aju T Thomas"),
				new Book(1l, "Java Cook Book", "A Thomas")
				);
	}
}
