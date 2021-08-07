package thiago.example.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import thiago.example.cloud.model.Person;
import thiago.example.cloud.repository.PersonRepository;

import java.util.UUID;

/**
 * @author thiagop
 * @date 2021-08-07
 */
@RestController
@RequestMapping(value = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public Person save(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @GetMapping(value ="/{id}")
    public Person getById(@PathVariable String id) {
        return personRepository.findById(id).orElse(Person.builder().build());
    }

    @GetMapping(value = "/example")
    public Person getExample() {
        return Person
                .builder()
                .id(UUID.randomUUID().toString())
                .firstName("this is a fake person")
                .lastName("with a fake id")
                .build();
    }
}
