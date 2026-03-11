package Pattern2FactoryMethod.Factory;

import Pattern2FactoryMethod.Candy.Candy;
import Pattern2FactoryMethod.Candy.CherryCandy;

public class CherryCandyFactory extends CandyFactory{
    @Override
    public Candy CreateCandy() {
        return new CherryCandy();
    }
}
