package com.example.database_demo.database_demo.repo;

import com.example.database_demo.database_demo.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PersonRepository {
    @PersistenceContext
    EntityManager entityManager;

    public Person getById(int id){
        return entityManager.find(Person.class,id);
    }

    public Person insert(Person p) {
        return entityManager.merge(p);
    }


    public Person findbyid(int id) {
        return entityManager.find(Person.class,id);
    }

}
