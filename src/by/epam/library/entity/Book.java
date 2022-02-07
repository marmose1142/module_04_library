package by.epam.library.entity;

import java.util.Objects;

public class Book {
	private int id;
	private String name;
	private String author;
	private String publisher;
	private int yearPublication;
	private int quantityPages;
	private int price;

	public Book() {

	}

	public Book(int id, String name, String author, String publisher, int yearPublication, int quantityPages,
			int price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.yearPublication = yearPublication;
		this.quantityPages = quantityPages;
		this.price = price;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearPublication() {
		return yearPublication;
	}

	public void setYearPublication(int yearPublication) {
		this.yearPublication = yearPublication;
	}

	public int getQuantityPages() {
		return quantityPages;
	}

	public void setQuantityPages(int quantityPages) {
		this.quantityPages = quantityPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, name, price, publisher, quantityPages, yearPublication);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name)
				&& price == other.price && Objects.equals(publisher, other.publisher)
				&& quantityPages == other.quantityPages && yearPublication == other.yearPublication;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher
				+ ", yearPublication=" + yearPublication + ", quantityPages=" + quantityPages + ", price=" + price
				+ "]"+"\r";
	}

}
