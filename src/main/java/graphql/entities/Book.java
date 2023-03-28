package graphql.entities;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long isbn;
    @Column(nullable = false, unique = true)
    String customId;
    @Column(nullable = false, unique = true)
    String name;
    @Column(nullable = false)
    String authorId;
    @Column(nullable = false)
    int pageCount;

    public Book() {}
    public Book(String customId, String name, int pageCount, String authorId) {
        this.customId = customId;
        this.authorId=authorId;
        this.name=name;
        this.pageCount=pageCount;
    }


    public String getCustomId() {
        return this.customId;
    }
    public String getAuthorId() {
        return this.authorId;
    }
}
