package thiago.example.cloud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import thiago.example.cloud.model.Person;

/**
 * @author thiagop
 * @date 2021-08-07
 */
@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
}
