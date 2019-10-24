package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.dao.BookDAO;
import pl.coderslab.model.Author;
import pl.coderslab.model.Book;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class BookController {


    @GetMapping("/getBook")
    public String getBookWeb(Model model){

       return "/WEB-INF/views/bookAddForm.jsp";
    }

    @PostMapping("/getBook")
    public String getBooks(@RequestParam String title, @RequestParam String firstName, @RequestParam String lastName,
                           HttpServletRequest request){

        BookDAO bookDao = (BookDAO) request.getAttribute("books");
        if (bookDao==null) {
            bookDao = new BookDAO();
        }

        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        Book book = new Book(author);
        book.setTitle(title);

        bookDao.addBook(book);
        List<Book> books = bookDao.getBooks();

        request.setAttribute("books", books);

        return "/WEB-INF/views/bookAddForm.jsp";
    }

}
