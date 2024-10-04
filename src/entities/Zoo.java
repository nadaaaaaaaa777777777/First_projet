package entities;

public class Zoo {
     protected Animal[] animals;
     protected String name;
    protected String city;
    protected  final int nbrCages = 25;
    protected int animalCount;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("saisir un nom");
        } else {
            this.name = name;
        }
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public void displayZoo() {
        System.out.println("name: " + name);
        System.out.println("city: " + city);
        System.out.println("nbrcages: " + nbrCages);
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
        if (isZooFull()) {

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
                animals[i] = animals[i + 1];
            }
            animals[animalCount - 1] = null;
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

    // Only one definition of isZooFull
    public boolean isZooFull() {
        return animalCount >= animals.length;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount > z2.animalCount ? z1 : z2;
    }

    @Override
    public String toString() {
        return "name: " + name + ", city: " + city + ", nbrcages: " + nbrCages;
    }
}
