package com.flowyk.fprom.persistence;

import com.flowyk.fprom.business.PersonRepository;
import com.flowyk.fprom.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositoryDAO extends PersonRepository, JpaRepository<Person, Long> {

}
