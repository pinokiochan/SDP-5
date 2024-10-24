package States;

public class NormalState implements CharacterState{
    @Override
    public void attack(Character character){
        System.out.println("Normal attack with strength 10.");
    }
    @Override
    public void defend(Character character){
        System.out.println("Normal defense: reduces damage by 5.");
    }
}
