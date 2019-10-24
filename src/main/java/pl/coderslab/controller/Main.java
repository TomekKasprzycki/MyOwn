package pl.coderslab.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.Config;
import pl.coderslab.model.Book;

public class Main {

    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class)){
            Book book = context.getBean("getBook", Book.class);
            book.getAuthor().introduceYourself();
        }

    }
}
