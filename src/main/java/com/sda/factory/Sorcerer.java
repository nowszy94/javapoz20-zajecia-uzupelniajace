package com.sda.factory;

public class Sorcerer extends BaseMonster implements Monster {
    public Sorcerer(Integer attack, Integer defend) {
        super(attack, defend);
    }

    @Override
    public void attack() {
        System.out.println("Attack with magic");
    }

    @Override
    public void defend() {
        System.out.println("Defend with magic");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }
}
