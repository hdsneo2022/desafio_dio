package one.digitalinnovation.gof.strategylibrary;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
    private String name;
    private List<Book> books;
    private AddBookStrategy addBookStrategy;

    public Library(String name, AddBookStrategy addBookStrategy) {
        this.name = name;
        this.books = new ArrayList<>();
        this.addBookStrategy = addBookStrategy;
    }

    public void addBook(Book book) {
        addBookStrategy.addBook(this, book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
        return name;
    }

    public static class Book {
    	
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }
}