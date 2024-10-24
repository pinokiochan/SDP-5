package Actions;

public class AttackAction extends GameAction{
    @Override
    protected void action(Character character){
        character.attack();
    }
}
