package ru.vlapin.experiments.arch04demo.configs;

import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.vlapin.experiments.arch04demo.dao.CatRepository;
import ru.vlapin.experiments.arch04demo.dao.DogRepository;
import ru.vlapin.experiments.arch04demo.model.Cat;
import ru.vlapin.experiments.arch04demo.model.Dog;

@Component
@RequiredArgsConstructor
public class Initer implements ApplicationRunner {

  CatRepository catRepository;
  DogRepository dogRepository;

  @Override
  public void run(ApplicationArguments args) {
    Stream.of("Мурзик", "Барсик", "Матроскин")
        .map(Cat::new)
        .forEach(catRepository::save);

    Stream.of("Шарик", "Тузик")
        .map(Dog::new)
        .forEach(dogRepository::save);
  }
}
