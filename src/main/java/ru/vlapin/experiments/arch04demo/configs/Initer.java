package ru.vlapin.experiments.arch04demo.configs;

import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.vlapin.experiments.arch04demo.dao.CatRepository;
import ru.vlapin.experiments.arch04demo.model.Cat;

@Component
@RequiredArgsConstructor
public class Initer implements ApplicationRunner {

  CatRepository catRepository;

  @Override
  public void run(ApplicationArguments args) {
    Stream.of("Мурзик", "Барсик", "Матроскин")
        .map(Cat::new)
        .forEach(catRepository::save);
  }
}
