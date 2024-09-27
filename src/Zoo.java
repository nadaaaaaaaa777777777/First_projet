public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals;
    }
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    public String   toString() {
        return "Name:" + name + "City:"+city+"NbrCages:"+nbrCages;
    }
}
