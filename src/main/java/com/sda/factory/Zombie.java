package com.sda.factory;

public class Zombie extends BaseMonster implements Monster {
    public Zombie(Integer attack, Integer defend) {
        super(attack, defend);
    }

    @Override
    public void attack() {
        System.out.println("Attack with hand");
    }

    @Override
    public void defend() {
        System.out.println("Defend with body");
    }

    @Override
    public void walk() {
        System.out.println("Crawling");
    }
}
