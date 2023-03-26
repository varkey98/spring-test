package graphql.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses=BookController.class)
public class GQLApplication {
    public static void main(String[] args) {
        SpringApplication.run(GQLApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            Author author = new Author("1","Herbert", "Schildt");
            Book book = new Book("Java: A Beginner's Guide, Sixth Edition", "0071809252", 728, "1");
        };
    }
}


