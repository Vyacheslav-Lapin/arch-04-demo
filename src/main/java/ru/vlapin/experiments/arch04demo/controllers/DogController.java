package ru.vlapin.experiments.arch04demo.controllers;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vlapin.experiments.arch04demo.dao.DogRepository;
import ru.vlapin.experiments.arch04demo.model.Dog;

@RestController
@RequestMapping("/api/dogs")
@RequiredArgsConstructor
public class DogController {

  DogRepository dogRepository;

  @SneakyThrows
  @Contract(pure = true)
  @GetMapping("{dogId}")
  public final @NotNull Dog getDog(@PathVariable int dogId) {
    return dogRepository.findById(dogId)
               .orElseThrow(RuntimeException::new);
  }

}
