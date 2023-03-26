package graphql.app;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class Book {
    String id;
    String name;
    String authorId;
    int pageCount;
    private static List<Book> BOOKS = Arrays.asList(
            new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
            new Book("book-2", "Moby Dick", 635, "author-2"),
            new Book("book-3", "Interview with the vampire", 371, "author-3")
    );;

    public Book(String id, String name, int pageCount, String authorId) {
        this.id=id;
        this.authorId=authorId;
        this.name=name;
        this.pageCount=pageCount;
    }

    public static Book getBookById(String id) {
        return BOOKS.stream().filter(book->book.getId().equals(id)).findAny().orElse(null);
    }

    public String getId() {
        return this.id;
    }
}
