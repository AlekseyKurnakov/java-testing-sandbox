package org.example.states;

import org.example.Character;

public class NormalState implements State {
    private final org.example.Character character;

    public NormalState(Character character) {
        this.character = character;
    }
    @Override
    public String getTitle() {
        return "Normal";
    }
    @Override
    public void enter() {
        System.out.println(character.getName() + " enters normal state");
        character.setCurrentAttackPower(character.getBaseAttackPower());
    }

    @Override
    public void exit() {
        System.out.println(character.getName() + " exits normal state");
    }
    @Override
    public void update() {
    }
    @Override
    public int handleAttack() {
        return character.getCurrentAttackPower();
    }

}
