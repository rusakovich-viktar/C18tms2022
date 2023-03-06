package by.tms.homework;

public class ElfFactory extends CharacterFactory {

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Mage createMage() {
        return new ElfMage();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }
}
