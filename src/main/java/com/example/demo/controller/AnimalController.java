package com.example.demo.controller;

import com.example.demo.model.Animal;
import com.example.demo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
@Autowired
    private AnimalRepository animalRepository;
@GetMapping("/animal")
public Iterable<Animal> mayAnimal(){
return animalRepository.findAll();
}
}
