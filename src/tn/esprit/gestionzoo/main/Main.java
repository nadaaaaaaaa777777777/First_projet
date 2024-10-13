package tn.esprit.gestionzoo.main;
import entities.*;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("FFFF", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Dolphin dolphin = new Dolphin("Delphinidae", "Dolphin", 8, true, "Ocean", 25.5f);
        Terrestre cheetah = new Terrestre("Felidae", "Cheetah", 6, true, 4);
        Aquatic aquatic = new Aquatic("Pisces", "Shark", 12, false, "Ocean");
         Penguin penguin = new Penguin("Spheniscidae", "Penguin", 3, true, "Arctic", 5.0f);

        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(elephant);
        System.out.println(dolphin);
        System.out.println(cheetah);
        Zoo zoo1 = new Zoo("Central Zoo", "Tunis");

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);
        zoo1.addAnimal(elephant);
        zoo1.addAnimal(dolphin);
        zoo1.addAnimal(cheetah);
        zoo1.displayAnimals();
        aquatic.swim();
        dolphin.swim();
        penguin.swim();
        /*Animal[] animals = {lion};


        Zoo zoo1 = new Zoo("Central Zoo", "Tunis");

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);
        zoo1.addAnimal(elephant);

        zoo1.displayZoo();

        zoo1.displayAnimals();

        System.out.println(zoo1.toString());
        System.out.println(lion.toString());
        System.out.println("recherche animal" + zoo1.searchAnimal("Lion"));

        Animal Lion1 = new Animal("Felidae", "Lion", 5, true);
        System.out.println("Ajouter  un aniaml : " + zoo1.addAnimal(Lion1));

        System.out.println("supprimer aniaml: " + zoo1.removeAnimal(tiger));
        zoo1.displayAnimals();*/
    }
}