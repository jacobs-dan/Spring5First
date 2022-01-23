package guru.springFramework.spring5WebApp.repositories;

import guru.springFramework.spring5WebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
