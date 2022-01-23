package guru.springFramework.spring5WebApp.repositories;

import guru.springFramework.spring5WebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
