package graphql.repositories;

import graphql.entities.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorDaoCrud extends CrudRepository<Author, Long> {
    Optional<Author> findByCustomId(String id);
}
