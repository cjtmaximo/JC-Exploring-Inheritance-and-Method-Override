package org.example;

public class GameCharacter {
    private int healthPoints;

    public GameCharacter() {
        this.healthPoints = 100;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void takeDamage(int amount) {
        int currentHp = getHealthPoints();
        currentHp -= amount;
        setHealthPoints(currentHp); // Update the health points of the character
        System.out.println("Regular character takes " + amount + " damage. New health: " + getHealthPoints());
    }
}