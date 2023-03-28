package graphql.app;


import graphql.entities.Author;
import graphql.entities.Book;
import graphql.repositories.AuthorDaoCrud;
import graphql.repositories.BookDaoCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    AuthorDaoCrud authorRepo;

    @Autowired
    BookDaoCrud bookRepo;

    @QueryMapping
    public int init() {
        List<Book> books =  Arrays.asList(
                new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
                new Book("book-2", "Moby Dick", 635, "author-2"),
                new Book("book-3", "Interview with the vampire", 371, "author-3")
        );
        List<Author> authors = Arrays.asList(
                new Author("author-1", "Joanne", "Rowling"),
                new Author("author-2", "Herman", "Melville"),
                new Author("author-3", "Anne", "Rice")
        );

        bookRepo.saveAll(books);
        authorRepo.saveAll(authors);
        return books.size();
    }

    @QueryMapping
    public Book bookById(@Argument String id){
       return bookRepo.findByCustomId(id).orElse(null);
    }

    @SchemaMapping
    public Author author(Book book) {
        return authorRepo.findByCustomId(book.getAuthorId()).orElse(null);
    }
}
