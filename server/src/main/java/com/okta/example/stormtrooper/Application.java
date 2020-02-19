package com.okta.example.stormtrooper;

import antlr.collections.impl.IntRange;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.stream.IntStream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Component
//    static class DbInit implements CommandLineRunner {
//
//        private final StormtrooperRepository repository;
//
//        final static private String[] trooperTypes = {"Basic", "Space", "Aquatic", "Marine", "Jump", "Sand"};
//        final static private String[] planetsList = {"Coruscant", "Tatooine", "Felucia", "Hoth", "Naboo", "Serenno"};
//        final static private String[] speciesList = {"Human", "Kel Dor", "Nikto", "Twi'lek", "Unidentified"};
//        final static private Random RANDOM = new Random();
//
//        DbInit(StormtrooperRepository repository) {
//            this.repository = repository;
//        }
//
//        private static StormtrooperModel randomTrooper(String id) {
//            String planet = planetsList[RANDOM.nextInt(planetsList.length)];
//            String species = speciesList[RANDOM.nextInt(speciesList.length)];
//            String type = trooperTypes[RANDOM.nextInt(trooperTypes.length)];
//
//            return new StormtrooperModel()
//                .setId(id)
//                .setPlanetOfOrigin(planet)
//                .setSpecies(species)
//                .setType(type);
//        }
//
//        private static StormtrooperModel randomTrooper() {
//            String id = "FN-"  + String.format("%04d", RANDOM.nextInt(9999));
//            return randomTrooper(id);
//        }
//
//        @Override
//        public void run(String... args) throws Exception {
//            IntStream.range(0, 10).forEach(index -> repository.save(randomTrooper()));
//        }
//    }
}
