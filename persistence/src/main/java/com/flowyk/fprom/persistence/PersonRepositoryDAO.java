package com.flowyk.fprom.persistence;

import com.flowyk.fprom.business.PersonRepository;
import com.flowyk.fprom.domain.PersistablePerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositoryDAO extends JpaRepository<PersistablePerson, Long> {

}
