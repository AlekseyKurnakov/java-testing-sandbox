package org.example;

import org.example.states.State;

public class Character{

    private String name;
    private final int maxHealth;
    private int currentHealth;
    private final int baseAttackPower;
    private int currentAttackPower;

    public Character(String name, int health, int attack) {
        this.name = name;
        maxHealth = health;
        currentHealth = health;
        baseAttackPower = attack;
        currentAttackPower = attack;
    }
}
