package graphql.test;

import graphql.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
    @Autowired
    private Book book;

    public Book getBook() {
        return this.book;
    }
}
