package entities;

public class Terrestre extends Animal implements Omnivore<Animal.Food> {
    protected int nbrlegs;
    public Terrestre(String family, String name, int age, boolean isMammal, int nbrlegs) {
        super(family, name, age, isMammal);
        this.nbrlegs = nbrlegs;
    }
    public Terrestre(){

    }

    @Override
    public String toString() {
        return super.toString() + " Number of legs: " + nbrlegs;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("animal terrestre mange de la viande");
        } else {
            System.out.println("animal terrestre ne mange pas de la viande");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("animal terrestre mange des plantes.");
        } else {
            System.out.println("animal terrestre ne  mange pas des plantes.");
        }
    }

    @Override
    public void eatPlantANDMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println("animal terrestre mange à la fois des plantes et de la viande");
        } else {
            System.out.println("animal terrestre ne mange pas à la fois des plantes et de la viande.");
        }

    }
}



