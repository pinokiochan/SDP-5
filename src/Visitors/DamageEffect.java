package Visitors;

public class DamageEffect implements EffectVisitor{
    @Override
    public void applyBoost(Character character){

    }
    @Override
    public void applyDamage(Character character){
        System.out.println("Damaging character!");
        character.reduceHealth(15);
    }
}
