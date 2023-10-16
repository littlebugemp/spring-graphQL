package com.limbo.sb.graphql.dao;

import com.limbo.sb.graphql.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    Person findByEmail(String email);
}
