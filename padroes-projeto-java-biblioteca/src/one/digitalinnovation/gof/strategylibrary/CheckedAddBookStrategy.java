package one.digitalinnovation.gof.strategylibrary;

//Estratégia para adicionar livros com verificação

class CheckedAddBookStrategy implements AddBookStrategy {
 @Override
 public void addBook(Library library, Library.Book book) {
	 
     if (book.getTitle().length() > 0 && book.getAuthor().length() > 0) {
         library.addBook(book);
     } else {
         System.out.println("Não é possível adicionar o livro. Título ou autor vazios.");
     }
 }
}
