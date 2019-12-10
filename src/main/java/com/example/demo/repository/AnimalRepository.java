package com.example.demo.repository;

import com.example.demo.model.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal,Long> {
}
