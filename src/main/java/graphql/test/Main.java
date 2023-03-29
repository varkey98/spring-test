package graphql.test;

import graphql.entities.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        Company company = context.getBean("company", Company.class);
        System.out.println(company.getBook().getAuthorId());
    }

    @Bean
    public Book newBook() {
        return new Book("id","name",3,"authorId");
    }
}
