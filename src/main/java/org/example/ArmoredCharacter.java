package org.example;

public class ArmoredCharacter extends GameCharacter {
    @Override
    public void takeDamage(int amount) {
        int currentHp = getHealthPoints();
        amount /= 2; // Armored character takes half damage
        currentHp -= amount;
        setHealthPoints(currentHp); // Update the health points of the character
        System.out.println("Armored character takes " + amount + " damage. New health: " + getHealthPoints());
    }
}