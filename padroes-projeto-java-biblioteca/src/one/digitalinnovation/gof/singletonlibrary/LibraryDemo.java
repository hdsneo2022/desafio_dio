package one.digitalinnovation.gof.singletonlibrary;

import java.util.List;

public class LibraryDemo {
    public static void main(String[] args) {
        // Obtém a instância única da biblioteca
        Library library = Library.getInstance();
        library.setName("Minha Biblioteca Pública");

        // Adiciona livros à biblioteca
        Library.Book book1 = new Library.Book("Aprendendo Java", "Autor 1");
        Library.Book book2 = new Library.Book("Introdução ao Padrão Singleton", "Autor 2");

        library.addBook(book1);
        library.addBook(book2);

        // Obtém a lista de livros da biblioteca
        List<Library.Book> books = library.getBooks();

        // Exibe os livros da biblioteca
        System.out.println("Livros na biblioteca: " + library.getName());
        for (Library.Book book : books) {
            System.out.println("Título: " + book.getTitle() + ", Autor: " + book.getAuthor());
        }
    }
}
