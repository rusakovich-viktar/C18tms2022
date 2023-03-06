package by.tms.homework;

public class Main {

    public static void main(String[] args) {
        Game orcGame = new Game(new OrcFactory());
        orcGame.play();

        Game elfGame = new Game(new ElfFactory());
        elfGame.play();

        Game humanGame = new Game(new HumanFactory());
        humanGame.play();
    }
}