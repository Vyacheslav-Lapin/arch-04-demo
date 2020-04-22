package ru.vlapin.experiments.arch04demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.arch04demo.model.Dog;

//@Repository
public interface DogRepository extends JpaRepository<Dog, Integer> {
}
