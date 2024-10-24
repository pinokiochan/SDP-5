package Actions;

public class DefendAction extends GameAction{
    @Override
    protected void action(Character character){
        character.defend();
    }
}
