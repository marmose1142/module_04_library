package by.epam.library.entity;

import java.util.ArrayList;
import java.util.List;

public class BookList {
	List<Book> books = new ArrayList<>();

	public BookList() {

	}

	public BookList(List<Book> books) {
		this.books = books;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "BookList [books=" + books + "]";
	}

}
