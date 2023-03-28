package graphql.entities;

import javax.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(unique = true, nullable = false)
    String customId;
    @Column(nullable = false)
    String firstName;
    @Column(nullable = false)
    String lastName;

    public Author() {}
    public Author(String id, String firstName, String lastName) {
        this.customId =id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getCustomId() {
        return this.customId;
    }

}
