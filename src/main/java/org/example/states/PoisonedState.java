package org.example.states;
import org.example.Character;

public class PoisonedState implements State {
    private final Character character;

    public PoisonedState(Character character) {
        this.character = character;
    }

    @Override
    public String getTitle() {
        return "Poisoned";
    }

    @Override
    public void enter() {
        System.out.println(character.getName() + " is poisoned");
        character.setCurrentAttackPower(character.getBaseAttackPower() / 2);
    }

    @Override
    public void exit() {
        System.out.println(character.getName() + " is no longer poisoned");
    }

    @Override
    public void update(){
        character.takeDamage(5);
    }

    @Override
    public int handleAttack() {
        return character.getCurrentAttackPower();
    }
}
