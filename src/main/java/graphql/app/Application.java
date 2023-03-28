package graphql.app;

import graphql.entities.Author;
import graphql.entities.Book;
import graphql.repositories.AuthorDaoCrud;
import graphql.repositories.BookDaoCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
import java.util.List;

@EnableJpaRepositories("graphql.repositories")
@EntityScan("graphql.entities")
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            Author author = new Author("1","Herbert", "Schildt");
            Book book = new Book("Java: A Beginner's Guide, Sixth Edition", "0071809252", 728, "1");
        };
    }
}
