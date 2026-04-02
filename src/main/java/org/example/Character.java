package org.example;

import org.example.states.NormalState;
import org.example.states.PoisonedState;
import org.example.states.State;

public class Character{

    private String name;
    private final int maxHealth;
    private int currentHealth;
    private final int baseAttackPower;
    private int currentAttackPower;
    private State state;

    public Character(String name, int health, int attack) {
        this.name = name;
        maxHealth = health;
        currentHealth = health;
        baseAttackPower = attack;
        currentAttackPower = attack;
        state = new NormalState(this);
        state.enter();
    }

    public String getName() {
        return name;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getCurrentHealth() {
        return currentHealth;
    }
    public int getBaseAttackPower() {
        return baseAttackPower;
    }
    public int getCurrentAttackPower() {
        return currentAttackPower;
    }
    public State getState() {
        return state;
    }
    public void setCurrentAttackPower(int attack) {
        currentAttackPower = attack;
    }
    public void takeDamage(int damage){
        if (currentHealth - damage <= 0) {
            throw new IllegalStateException();
        }
        currentHealth = currentHealth - damage;
    }

    public void poison() {
        state.exit();
        state = new PoisonedState(this);
        state.enter();
    }
    public void undoSpells() {
        state.exit();
        state = new NormalState(this);
        state.enter();
    }
}
