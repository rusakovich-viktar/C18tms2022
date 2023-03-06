package by.tms.homework;

public class Game {

    private CharacterFactory factory;

    public Game(CharacterFactory factory) {
        this.factory = factory;
    }

    public void play() {
        Warrior warrior = factory.createWarrior();
        Mage mage = factory.createMage();
        Archer archer = factory.createArcher();

        warrior.attack();
        mage.castSpell();
        archer.shoot();
    }
}
