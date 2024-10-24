package Visitors;

public interface EffectVisitor {
    void applyBoost(Character character);
    void applyDamage(Character character);
}
