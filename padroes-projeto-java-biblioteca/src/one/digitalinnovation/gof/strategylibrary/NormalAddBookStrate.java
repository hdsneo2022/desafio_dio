package one.digitalinnovation.gof.strategylibrary;

public class NormalAddBookStrate {
	
	class NormalAddBookStrategy implements AddBookStrategy {
	    @Override
	    public void addBook(Library library, Library.Book book) {
	        library.addBook(book);
	    }
	}
}
