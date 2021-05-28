package zoo;

import java.io.File;

public class Main {

    public static void main(String[] argv) {

        String filePath = argv[0];

        // Create zoo
        Zoo zoo = new Zoo();
        // Add animals to the zoo

        ForParser parser = new ForParser(argv);
        zoo.addAnimalsFile(parser.getPath(),parser.getTypeFile());

        // Create user action trigger
        ActionTrigger trigger = new ActionTrigger(zoo);

        AnimalType herbivore = AnimalType.HERBIVORE;
        AnimalType carnivore = AnimalType.CARNIVORE;

        // All of the following actions are up to users choice
        zoo.printAllStates();
        trigger.setMorning();
        zoo.printAllStates();

        trigger.visit(herbivore);
        zoo.printAllStates();
//        trigger.visit(carnivore);
        trigger.feedAnimals(herbivore);
        zoo.printAllStates();
        trigger.setRain();
        zoo.printAllStates();

        trigger.setNight();
        zoo.printAllStates();

        trigger.setMorning();
        zoo.printAllStates();
        trigger.feedAnimals(carnivore);
        trigger.setThunder();
        zoo.printAllStates();


        trigger.feedAnimals(herbivore);
        zoo.printAllStates();
        trigger.drinkAnimals(herbivore);
        zoo.printAllStates();
        trigger.setNight();
        zoo.printAllStates();

        trigger.setMorning();
        zoo.printAllStates();
    }
}