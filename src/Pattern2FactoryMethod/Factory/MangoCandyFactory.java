package Pattern2FactoryMethod.Factory;

import Pattern2FactoryMethod.Candy.Candy;
import Pattern2FactoryMethod.Candy.MangoCandy;

public class MangoCandyFactory extends CandyFactory{
    @Override
    public Candy CreateCandy() {
        return new MangoCandy();
    }
}
