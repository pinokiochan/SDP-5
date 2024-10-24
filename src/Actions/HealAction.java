package Actions;

public class HealAction extends GameAction{
    @Override
    protected void action(Character character){
        System.out.println("Healing action: +20 health.");
        character.heal(20);
    }
}
