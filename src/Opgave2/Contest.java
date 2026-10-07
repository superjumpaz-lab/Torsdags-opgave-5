package Opgave2;

public class Contest {
    private Animal fighter;
    private Animal defender;
    private int count;

    public Contest(Animal fighter, Animal defender){
        this.fighter = fighter;
        this.defender = defender;

    }

    public void playRound(Animal fighter, Animal defender){
        while(fighter.isActive() && defender.isActive()){
            defender.setEnergy(defender.getEnergy() - fighter.attack());
            System.out.println(fighter.getName() + " attacks for " + fighter.attack() + "! (" + defender.getName() + " has " + defender.getEnergy() + " energy left)");
            fighter.setEnergy(fighter.getEnergy() - defender.attack());
            System.out.println(defender.getName() + " attacks for " + defender.attack() + "! (" + fighter.getName() + " has " + fighter.getEnergy() + " energy left)");
            count++;
            System.out.println(" ");
        }

    }

    public String getWinner(){
        if(fighter.isActive() && !defender.isActive()){
            return fighter.getName() + " is the winner!" + "\nRounds: " + count;
        } else if(defender.isActive() && !fighter.isActive()){
            return defender.getName() + " is the winner!" + "\nRounds: " + count;
        }
        return null;
    }


}
