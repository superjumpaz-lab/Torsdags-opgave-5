package Opgave2;

public class Rabbit extends Animal{
    public Rabbit(String name){
        super(name, 300);
    }

    @Override
    public int attack(){
      return 10;
    }
}
