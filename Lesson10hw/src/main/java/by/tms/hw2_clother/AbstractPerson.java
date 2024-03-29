package by.tms.hw2_clother;

import by.tms.hw2_clother.jacket.IJacket;
import by.tms.hw2_clother.shoes.IShoes;
import by.tms.hw2_clother.trousers.ITrousers;

public abstract class AbstractPerson {
    public final String name;
    public IJacket jacket;
    public IShoes shoes;
    public ITrousers trousers;

    public AbstractPerson(String name, IJacket jacket, IShoes shoes, ITrousers trousers) {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
    }

    public abstract void putOnAll();

    public abstract void pullOffAll();
}
