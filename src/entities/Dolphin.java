package entities;

public class Dolphin extends Aquatic{
    protected   float swimmingSpeed;
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public  Dolphin(){

    }
    public void  swim (){
        System.out.println("This dolphin is swimming");
    }




}