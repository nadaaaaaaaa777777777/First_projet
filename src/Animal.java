public class Animal {

    String family;
    String name;
    int age;
    Boolean isMammal;


    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
        this.age =age;
        this.isMammal = isMammal;
    }




@Override
public String toString( ){
    return "name"   +name  + ",family:"  +family+",age" +age+",is mammal" + isMammal ;}
}
