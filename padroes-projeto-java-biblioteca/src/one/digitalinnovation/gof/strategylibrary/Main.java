package one.digitalinnovation.gof.strategylibrary;

import java.util.ArrayList;
import java.util.List;

public static void main(String[] args) {
	
		AddBookStrategy normalAddStrategy = new NormalAddBookStrategy();
		AddBookStrategy checkedAddStrategy = new CheckedAddBookStrategy();

		Library library1 = new Library("Minha Biblioteca Pública (Sem Verificação)", normalAddStrategy);
		Library library2 = new Library("Minha Biblioteca Pública (Com Verificação)", checkedAddStrategy);

		Library.Book book1 = new Library.Book("Aprendendo Java", "Autor 1");
		Library.Book book2 = new Library.Book("Introdução ao Padrão Strategy", "Autor 2");
		Library.Book book3 = new Library.Book("", "Autor 3");

    	library1.addBook(book1);
    	library1.addBook(book2);

    	library2.addBook(book1);
    	library2.addBook(book2);
    	library2.addBook(book3);

    	System.out.println("Livros na biblioteca (Sem Verificação): " + library1.getName());
    		for (Library.Book book : library1.getBooks()) {
    			System.out.println("Título: " + book.getTitle() + ", Autor: " + book.getAuthor());
    		}

    	System.out.println("\nLivros na biblioteca (Com Verificação): " + library2.getName());
    		for (Library.Book book : library2.getBooks()) {
    			System.out.println("Título: " + book.getTitle() + ", Autor: " + book.getAuthor());
    		}
		}

}






