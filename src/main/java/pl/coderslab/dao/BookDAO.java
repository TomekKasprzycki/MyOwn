package pl.coderslab.dao;

import org.springframework.stereotype.Component;
import pl.coderslab.model.Book;

import java.util.List;

@Component
public class BookDAO {

    private List<Book> books;

    public BookDAO() {}

    public BookDAO(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){

            books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
