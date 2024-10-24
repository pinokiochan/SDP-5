package Actions;

public abstract class GameAction {
    public final void executeAction(Character character){
        startAction();
        action(character);
        endAction();
    }
    protected void startAction(){
        System.out.println("Starting action...");
    }
    protected abstract void action(Character character);
    protected void endAction(){
        System.out.println("Action completed.");
    }
}
