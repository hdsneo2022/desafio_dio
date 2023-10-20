package one.digitalinnovation.gof.strategylibrary;

import java.util.ArrayList;
import java.util.List;

// Interface para a estratégia de adicionar livros

interface AddBookStrategy {
    
	void addBook(Library library, Library.Book book);
}