package guru.springFramework.spring5WebApp.bootstrap;

import guru.springFramework.spring5WebApp.domain.Author;
import guru.springFramework.spring5WebApp.domain.Book;
import guru.springFramework.spring5WebApp.repositories.AuthorRepository;
import guru.springFramework.spring5WebApp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author dan = new Author("Dan", "Jacobs");
        Book mine = new Book("Mylife", "1234");
        dan.getBooks().add(mine);
        mine.getAuthors().add(dan);

        authorRepository.save(dan);
        bookRepository.save(mine);

        Author rod = new Author("Rod", "Jhonson");
        Book spring = new Book("Spring5", "23432");
        rod.getBooks().add(spring);
        spring.getAuthors().add(rod);

        //authorRepository.save()

        System.out.println("Satrting our BootStrap");
        System.out.println("Number of books: " + bookRepository.count());

        System.out.println("Adding new book...");
        bookRepository.save(spring);
        authorRepository.save(rod);

        System.out.println("Number of books: " + bookRepository.count());


    }
}
