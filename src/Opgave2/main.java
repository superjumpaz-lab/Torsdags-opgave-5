import Opgave2.*;

public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<>();
    Wolf wolf = new Wolf("Ulven",100);
    Lion lion = new Lion("Zumba",100);
    Rabbit rabbit = new Rabbit("Mush");
    Wolf wolf2 = new Wolf("jaj",50);
    animals.add(wolf);
    animals.add(wolf2);
    animals.add(lion);
    animals.add(rabbit);

    Contest tournament = new Contest(wolf,lion);
    tournament.playRound(wolf,lion);
    System.out.println(tournament.getWinner());
    System.out.println(" ");

    tournament.playRound(wolf2,rabbit);
    System.out.println(tournament.getWinner());


}
