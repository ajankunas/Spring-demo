package lt.techin.demo.controllers;

import lt.techin.demo.entities.Person;
import lt.techin.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {
@Autowired
    private PersonRepository personRepository;
   // private final ArrayList<String> people = new ArrayList<>(Arrays.asList("Jurgis", "Antanas",
    //        "Aloyzas", "Martynas"));
   // private String set;

    @GetMapping("/people")
    public List<Person> getPeople() {
        return personRepository.findAll();
    }

    @GetMapping("/people/{id}")
    public Person getPerson(@PathVariable int id) {
        return personRepository.findById(id).get();
    }

    @PostMapping("/people")
    public void addPerson(@RequestBody Person person) {
        personRepository.save(person);
    }

    //@DeleteMapping("/people/{index}")
    //public void deletePerson(@PathVariable int index) {
     //   people.remove(index);
    //}
    //@PutMapping("/people/{index}")
    //public void updatePerson(@PathVariable int index, @RequestBody String name) {
     //   people.set(index, name);
   // }
}

