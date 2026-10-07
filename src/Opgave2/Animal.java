package Opgave2;

public class Animal {
    private String name;
    private int energy;
    private boolean isActive;
    private int attack;

    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;

    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy){
        this.energy = energy;
    }

    public boolean isActive(){
        return energy > 0;
    }

    public int attack(){
        return 10;
    }

    public String toString(){
        return this.name + " " + name + " (energi: " +getEnergy() +")";
    }
}
