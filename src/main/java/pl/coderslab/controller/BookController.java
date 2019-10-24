package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.dao.BookDAO;
import pl.coderslab.model.Author;
import pl.coderslab.model.Book;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private final BookDAO bookDao;

    @Autowired
    public BookController(BookDAO bookDao){
        this.bookDao = bookDao;
    }

    @GetMapping("/getBook")
    public String getBookWeb(){

       return "/WEB-INF/views/bookAddForm.jsp";
    }

    @PostMapping("/getBook")
    public String getBooks(@RequestParam String title, @RequestParam String firstName, @RequestParam String lastName,
                           Model model){

        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        Book book = new Book(author);
        book.setTitle(title);

        bookDao.addBook(book);
        List<Book> books = bookDao.getBooks();

        model.addAttribute("books", books);

        return "/WEB-INF/views/bookAddForm.jsp";
    }

}
