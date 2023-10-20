package one.digitalinnovation.gof.singletonlibrary;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton "biblioteca".
 * 
 * @author Haron de Santiago
 */

public class Library {
	
    // Atributos da biblioteca
	
    private String name;
    private List<Book> books;

    // Instância única da biblioteca (padrão Singleton)
    
    private static Library instance = null;

    // Construtor privado para evitar a criação de instâncias diretas
    
    private Library() {
        name = "Minha Biblioteca";
        books = new ArrayList<>();
    }

    // Método estático para obter a instância única da biblioteca
    
    public static Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    // Métodos para adicionar e listar livros
    
    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    // Outros métodos da biblioteca

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Classe interna para representar livros
    
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