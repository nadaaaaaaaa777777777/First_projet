package entities;

public interface Omnivore <T> extends Carnivore<T>,Herbivore<T>{
    void eatPlantANDMeet(T food);
}
