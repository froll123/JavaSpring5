package com.example.seminar5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public Person updatePerson(Long id, Person personDetails) {
        Person person = personRepository.findById(id).orElse(null);
        if (person != null) {
            person.setFirstName(personDetails.getFirstName());
            person.setLastName(personDetails.getLastName());
            return personRepository.save(person);
        }
        return null;
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }
}
