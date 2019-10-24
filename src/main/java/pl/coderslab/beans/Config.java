package pl.coderslab.beans;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import pl.coderslab.model.Author;
import pl.coderslab.model.Book;

@Configuration
@EnableWebMvc
@ComponentScan("pl.coderslab")
public class Config {

    @Bean
    public Book getBook(){

        return new Book(getAuthor());
    }

    @Bean
    Author getAuthor(){

        return new Author();
    }
}
