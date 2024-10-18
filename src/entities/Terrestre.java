package entities;

public class Terrestre extends Animal {
    protected int nbrlegs;
    public Terrestre(String family, String name, int age, boolean isMammal, int nbrlegs) {
        super(family, name, age, isMammal);
        this.nbrlegs = nbrlegs;
    }
    public Terrestre(){

    }

    @Override
    public String toString() {
        return super.toString() + " Number of legs: " + this.nbrlegs;
    }



}
