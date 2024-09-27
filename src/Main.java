public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);


        Animal[] animals = {lion};


        Zoo zoo1 = new Zoo("Safari Park", "Tunis", 10, animals);


        zoo1.displayZoo();


        System.out.println(zoo1.toString());
        System.out.println(lion.toString());
    }
}