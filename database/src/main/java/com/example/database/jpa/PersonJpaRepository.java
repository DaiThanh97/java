package com.example.database.jpa;


import com.example.database.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonJpaRepository {

    // connect to database
    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

    public Person update(Person person) {
        return entityManager.merge(person);
    }

    public Person insert(Person person) {
        return entityManager.merge(person);
    }

    public void delete(Person person) {
        Person a = findById(person.getId());
        entityManager.remove(a);
    }

    public List<Person> findAll() {
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_person", Person.class);
        return namedQuery.getResultList();
    }
}
