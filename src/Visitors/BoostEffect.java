package Visitors;

public class BoostEffect implements EffectVisitor{
    @Override
    public void applyBoost(Character character){
        System.out.println("Boosting character stats!");
        character.increaseDefense(10);
    }
    @Override
    public void applyDamage(Character character){

    }
}
