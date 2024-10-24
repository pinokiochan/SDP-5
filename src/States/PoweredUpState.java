package States;

public class PoweredUpState implements CharacterState{
    @Override
    public void attack(Character character){
        System.out.println("Powered-up attack with strength 20!");
    }
    @Override
    public void defend(Character character){
        System.out.println("Powered-up defense: reduces damage by 10!");
    }
}
