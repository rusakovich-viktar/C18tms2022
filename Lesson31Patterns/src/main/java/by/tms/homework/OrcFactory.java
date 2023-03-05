package by.tms.homework;

public class OrcFactory extends CharacterFactory {

    @Override
    public Warrior createWarrior() {
        return new OrcWarrior();
    }

    @Override
    public Mage createMage() {
        return new OrcMage();
    }

    @Override
    public Archer createArcher() {
        return new OrcArcher();
    }


}
