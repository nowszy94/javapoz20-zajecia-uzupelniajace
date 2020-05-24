package com.sda.factory;

public class Archer extends BaseMonster implements Monster {
    public Archer(Integer attack, Integer defend) {
        super(attack, defend);
    }

    @Override
    public void attack() {
        System.out.println("Attack with bow");
    }

    @Override
    public void defend() {
        System.out.println("Defend with shield");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }
}
