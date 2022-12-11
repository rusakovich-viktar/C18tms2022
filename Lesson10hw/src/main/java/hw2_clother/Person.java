package hw2_clother;

import hw2_clother.jacket.IJacket;
import hw2_clother.shoes.IShoes;
import hw2_clother.trousers.ITrousers;

public class Person extends AbstractPerson implements IPerson {

    public Person(String name, IJacket jacket, IShoes shoes, ITrousers trousers) {
        super(name, jacket, shoes, trousers);
    }

    @Override
    public void putOnAll() {
        jacket.putOn();
        shoes.putOn();
        trousers.putOn();
    }

    @Override
    public void pullOffAll() {
        jacket.pullOff();
        shoes.pullOff();
        trousers.pullOff();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", jacket=" + jacket +
                ", shoes=" + shoes +
                ", trousers=" + trousers +
                '}';
    }
}