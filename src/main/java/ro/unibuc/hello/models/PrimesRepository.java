package ro.unibuc.hello.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimesRepository extends CrudRepository<Primes, Integer> {
}
