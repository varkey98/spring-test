package graphql.repositories;

import graphql.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookDaoCrud extends CrudRepository<Book, Long> {
    Optional<Book> findByCustomId(String id);
}
