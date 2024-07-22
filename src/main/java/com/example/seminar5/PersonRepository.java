package com.example.seminar5;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
}
