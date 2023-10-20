package one.digitalinnovation.gof.libraryfacade;

import java.util.List;

public class Library {
	
    public static void main(String[] args) {
        LibraryFacade library = new LibraryFacade("Minha Biblioteca Pública");

        library.addBook("Aprendendo Java", "Autor 1");
        library.addBook("Introdução ao Padrão Facade", "Autor 2");
        library.addBook("Livro sem autor", "");

        System.out.println("Livros na biblioteca: " + library.getLibraryName());
        List<Book> books = library.getAllBooks();

        for (Book book : books) {
            System.out.println("Título: " + book.getTitle() + ", Autor: " + book.getAuthor());
        }
    }
}



