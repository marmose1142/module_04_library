package by.epam.library.logic;

import by.epam.library.entity.BookList;
import java.util.Scanner;

public class LibraryLogic {

	public String enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextLine()) {
			sc.next();
			System.out.println(message);
		}

		return sc.nextLine();
	}

	public int enterFromConsole2(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		return sc.nextInt();
	}

	public BookList searchBooksAuthor(BookList bookList, String author) {
		BookList bookListAuthor = new BookList();
		for (int i = 0; i < bookList.getBooks().size(); i++) {
			if (author.equals(bookList.getBooks().get(i).getAuthor())) {
				bookListAuthor.addBook(bookList.getBooks().get(i));
			}
		}

		return bookListAuthor;
	}

	public BookList searchBooksPublisher(BookList bookList, String publisher) {
		BookList bookListPublisher = new BookList();

		for (int i = 0; i < bookList.getBooks().size(); i++) {
			if (publisher.equals(bookList.getBooks().get(i).getPublisher())) {
				bookListPublisher.addBook(bookList.getBooks().get(i));
			}
		}

		return bookListPublisher;
	}

	public BookList searchBooksYearIssue(BookList bookList, int year) {
		BookList booksYearIssue = new BookList();

		for (int i = 0; i < bookList.getBooks().size(); i++) {
			if (year < bookList.getBooks().get(i).getYearPublication()) {
				booksYearIssue.addBook(bookList.getBooks().get(i));
			}
		}

		return booksYearIssue;
	}
}
