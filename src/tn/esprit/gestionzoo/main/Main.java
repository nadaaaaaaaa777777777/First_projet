package tn.esprit.gestionzoo.main;
import entities.*;


public class Main {
    public static void main(String[] args) {
        try {


                Animal lion = new Animal("FFFF", "Lion", 5, true);
               lion.setAge(5);
            Animal tiger = new Animal("Felidae", "Tiger", 4, true);
               tiger.setAge(4);
                Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
                Dolphin dolphin = new Dolphin("Delphinidae", "Dolphin", 8, true, "Ocean", 25.5f);
                Terrestre cheetah = new Terrestre("Felidae", "Cheetah", 6, true, 4);
                // Aquatic aquatic = new Aquatic("Pisces", "Shark", 12, false, "Ocean");
                Penguin penguin1 = new Penguin("Spheniscidae", "Penguin1", 3, true, "Arctique", 5.0f);
                Penguin penguin2 = new Penguin("Spheniscidae", "Penguin2", 4, true, "Arctique", 9.0f);
                Penguin penguin3 = new Penguin("Spheniscidae", "Penguin1", 3, true, "Arctique", 5.0f);
                Terrestre t1= new Terrestre();
                t1.eatMeat(Animal.Food.MEAT);
               penguin1.eatMeat(Animal.Food.MEAT);

                Zoo zoo1 = new Zoo("Central Zoo", "Tunis");

                zoo1.addAnimal(lion);
                zoo1.addAnimal(tiger);
                zoo1.addAnimal(elephant);
                zoo1.addAnimal(dolphin);
                zoo1.addAnimal(cheetah);
                zoo1.displayAnimals();
        /*
        zoo1.addAquaticAnimal(dolphin);
        zoo1.addAquaticAnimal(penguin1);
        zoo1.addAquaticAnimal(penguin2);
        zoo1.addAquaticAnimal(penguin3);
        float maxDepth = zoo1.maxPenguinSwimmingDepth();
        System.out.println("La profondeur maximale  " + maxDepth);
        zoo1.displayNumberOfAquaticsByType();
        System.out.println("penguin1/penguin2: " + penguin1.equals(penguin2));
        System.out.println("penguin1 /penguin3: " + penguin1.equals(penguin3));



        /*aquatic.swim();
        dolphin.swim();
        penguin.swim();
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
        zoo1.displayAnimals();*/
            } catch (ZooFullException e){
                System.out.println(e.getMessage());
        } catch (InvalidAgeExeception e) {
            System.out.println(e.getMessage());
        }
    }
}