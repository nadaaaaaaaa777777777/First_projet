package entities;

public class Animal {

    String family;
    String name;
    int age;
    Boolean isMammal;


    public Animal() {
    }

    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
        this.age =age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeExeception {
        if (age < 0) {

            throw new InvalidAgeExeception("le âge doit etre positive");
        } else {
            this.age = age;
        }
    }

    public Boolean getMammal() {
        return isMammal;
    }

    public void setMammal(Boolean mammal) {
        isMammal = mammal;
    }

    @Override
public String toString( ){
    return "name"   +name  + ",family:"  +family+",age" +age+",is mammal" + isMammal ;}
}
