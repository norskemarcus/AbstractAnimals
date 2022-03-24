import java.util.ArrayList;
import java.util.Random;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // create some cats and dogs
        Cat cat1 = new Cat("Mandu");
        Cat cat2 = new Cat("Mia V.");
        Dog dog1 = new Dog("Lassie");
        Dog dog2 = new Dog("Santa's little helper");

        // Create a list, and populate it with cats and dogs
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(dog1);
        animals.add(dog2);

        // Make a list of foods, and a random-thingy
        String[] foods = {"raw meat", "dog food", "rotten seal", "fish"};
        Random rand = new Random();

        // Go through all animals, make them eat and sleep
       // Animal ani1 = new Animal("Dyr"); // dette dyret kan ikke spise, bare sove! Mangler også en toString i Animals
        //animals.add(ani1);

        for(Animal animal : animals) { // behandler de polymorft. det er behov for en tom metode i Animal
            // henviser til alle Animals
            System.out.println(animal); // kalder toString automatisk
            animal.makeNoise();

            animal.eat(foods[rand.nextInt(foods.length)]); // eat random food
            animal.sleep(rand.nextInt(5));                 // sleep up to 5 hours
            // TODO: What if we want them to wag their tail or hiss?


            if(animal instanceof Cat cat){ // hvis man skal bruge en specifik metode hos en subklasse
                // eller skrive cat efter Cat efter instanceOf! Smart
             //   Cat cat = (Cat)animal;
               cat.hiss();
                // eller:
                // ((Cat)animal).hiss(); // at caste!

            }


            System.out.println();
        }
    }
}
