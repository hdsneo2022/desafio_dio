package one.digitalinnovation.gof.libraryfacade;

import java.util.ArrayList;
import java.util.List;

//Classe LibraryFacade que atua como uma fachada para o sistema da biblioteca

class LibraryFacade {
	
	private List<Book> books;
	private String libraryName;

 public LibraryFacade(String libraryName) {
     	this.libraryName = libraryName;
     	this.books = new ArrayList<>();
 }

 public void addBook(String title, String author) {
	 
     Book book = new Book(title, author);
     books.add(book);
     System.out.println("Livro adicionado à biblioteca: " + title + " por " + author);
 }

 public List<Book> getAllBooks() {
     return books;
 }

 public String getLibraryName() {
     return libraryName;
 	}
}
