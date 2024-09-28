public class Zoo {
    Animal[] animals;
    String name;
    String city;
    private final int nbrCages = 25;
    int animalCount;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[25];
    }

    public void displayZoo() {
        System.out.println("name: " + name);
        System.out.println("city: " + city);
        System.out.println("numbercages: " + nbrCages);
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount >= animals.length) {

            return false;
        }
        if (this.searchAnimal(animal.name) == -1) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {

            return false;
        }
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.name);
        if (index != -1) {
            for (int i = index; i < animalCount - 1; i++) {
                animals[i] = animals[i + 1]; // Shift animals down
            }
            animals[animalCount - 1] = null; // Clear the last spot
            animalCount--;
            return true;
        } else {

            return false;
        }
    }

    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i].toString());
        }
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount > z2.animalCount ? z1 : z2;
    }

    @Override
    public String toString() {
        return "name: " + name + ", city: " + city + ", numbercages: " + nbrCages;
    }
}