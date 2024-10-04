package tn.esprit.gestionzoo.main;
import entities.*;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("FFFF", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);

        Animal[] animals = {lion};


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
        zoo1.displayAnimals();
    }
}