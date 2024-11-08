package entities;

public class Dolphin extends Aquatic{
    protected   float swimmingSpeed;
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public  Dolphin(){

    }
    @Override
    public void  swim (){
        System.out.println("This dolphin is swimming");
    }


    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(this.name + " the dolphin is eating meat.");
        } else {
            System.out.println(this.name + " the dolphin cannot eat this type of food.");
        }
    }
}
