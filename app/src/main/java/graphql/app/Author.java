package graphql.app;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class Author {
    String id;
    String firstName;
    String lastName;
    private static List<Author> AUTHORS = Arrays.asList(
            new Author("author-1", "Joanne", "Rowling"),
            new Author("author-2", "Herman", "Melville"),
            new Author("author-3", "Anne", "Rice")
    );;
    public Author(String id, String firstName, String lastName) {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public static Author getAuthorById(String id) {
        return AUTHORS.stream().filter(author->author.getId().equals(id)).findAny().orElse(null);
    }

    public String getId() {
        return this.id;
    }

}
