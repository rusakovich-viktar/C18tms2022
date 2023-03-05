package by.tms.homework;

public class HumanFactory extends CharacterFactory {

    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Mage createMage() {
        return new HumanMage();
    }

    @Override
    public Archer createArcher() {
        return new HumanArcher();
    }
}
