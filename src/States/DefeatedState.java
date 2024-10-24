package States;

public class DefeatedState implements  CharacterState{
    @Override
    public void attack(Character character){
        System.out.println("Cannot attack, character is defeated.");
    }
    @Override
    public void defend(Character character){
        System.out.println("Defeated: cannot defend.");
    }
}
