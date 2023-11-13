package com.degiv.springmvcwebapp.dao;

import org.springframework.stereotype.Component;
import com.degiv.springmvcwebapp.models.Person;

import java.util.ArrayList;
import java.util.List;


@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Bob", 1, "Bob@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "John", 24, "John@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Joshua", 62, "Joshua@yahoo.com"));
        people.add(new Person(++PEOPLE_COUNT, "Ivan", 24, "Ivan@yandex.ru"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);

        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }
}
