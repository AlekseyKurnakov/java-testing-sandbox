package org.example.states;

public interface State {
    String getTitle();
    void enter();
    void exit();
    void update();
    int handleAttack();
}