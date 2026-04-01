package org.example.states;

public class PoisonedState implements State {
    private Character character;

    @Override
    public String getTitle() {
        System.out.println(" is poisoned");
    }
    void enter();
    void exit();
    void update();
    int handleAttack();
}
