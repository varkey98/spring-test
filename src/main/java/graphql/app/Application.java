package graphql.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

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
