package org.example;

import org.example.states.State;

public class Character{

    private String name;
    private final int maxHealth = 100;
    private int currentHealth; //текущий уровень здоровья
    private final int baseAttackPower = 20;//номинальная сила атаки персонажа.
                                            // В течении жизни персонажа не меняется, является базой для расчета текущей силы атаки
    private int currentAttackPower; //текущая сила атаки, может отличаться от номинальной в зависимости от состояния персонажа
}
