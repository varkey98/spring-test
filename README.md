
Clone this repo and execute `mvnw spring-boot:run`. Or inside an IDE, execute the class `graphql.app.Application`.

To access the database, you can go to [http://localhost:8080/h2-console/login.jsp](http://localhost:8080/h2-console/login.jsp) and enter the following information:
- JDBC URL: jdbc:h2:mem:testdb
- User Name: sa
- Password: <blank>

Or go to [http://localhost:8080/graphiql](http://localhost:8080/graphiql) to start executing queries. For example:
```
{
  findAllBooks {
    id
    isbn
    title
    pageCount
    author {
      firstName
      lastName
    }
  }
}
```

Or:
```
mutation {
  newBook(
    title: "Java: The Complete Reference, Tenth Edition", 
    isbn: "1259589331", 
    author: 1) {
      id title
  }
}
```

# Extras

This build demos some UIs hosted at [graphql-java-kickstart](https://github.com/graphql-java-kickstart/graphql-spring-boot).
  * Launch with `mvn spring-boot:run`
  * Open a browser to view UIs at the following links:
    * [GraphiQL](http://localhost:8080/graphiql)
    * [Altair](http://localhost:8080/altair)
    * [Playground](http://localhost:8080/playground)  
    * [Voyager](http://localhost:8080/voyager)

# License
MIT
