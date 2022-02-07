package by.epam.library.main;

import by.epam.library.entity.Book;
import by.epam.library.entity.BookList;
import by.epam.library.logic.LibraryLogic;
import by.epam.library.view.LibraryView;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString.Создать второй класс агрегирующий массив типа Book, с подходящими конструктарами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Book:id, название, автор(ы),издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a)список книг заданного автора;
 * б)список книг, выпущенных заданным издательством.
 * в)список кник, выпущенных после заданного года.*/

public class Main {

	public static void main(String[] args) {
		BookList bookList = new BookList();
		bookList.addBook(new Book(123, "war and peace", "Tolstoy", "Moscow", 1985, 900, 50));
		bookList.addBook(new Book(124, "the idiot", "Dostoevsky", "St. petersburg", 1999, 650, 45));
		bookList.addBook(new Book(120, "madame Bovary", "Flaubert", "Paris", 1998, 400, 30));
		bookList.addBook(new Book(145, "the Count of Monte Cristo", "Dumas", "Marseille", 1998, 800, 55));
		bookList.addBook(new Book(120, "the Gulag Archipelago", "Solzhenitsyn", "Moscow", 1991, 2000, 100));
		bookList.addBook(new Book(121, "the three musketeers", "Dumas", "Marseille", 1997, 800, 80));

		LibraryLogic labraryLogic = new LibraryLogic();
		LibraryView libraryView = new LibraryView();

		libraryView.printBooks(bookList);

		labraryLogic.searchBooksAuthor(bookList, labraryLogic.enterFromConsole("Please, enter the author's name"));

		libraryView.printBooks(labraryLogic.searchBooksAuthor(bookList,
				labraryLogic.enterFromConsole("Please, enter the author's name")));

		libraryView.printBooks(labraryLogic.searchBooksPublisher(bookList,
				labraryLogic.enterFromConsole("Please, enter the name of the publisher")));

		libraryView.printBooks(labraryLogic.searchBooksYearIssue(bookList,
				labraryLogic.enterFromConsole2("Please, enter the year of publication")));
	}

}
