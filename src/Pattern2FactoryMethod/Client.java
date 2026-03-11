package Pattern2FactoryMethod;

import Pattern2FactoryMethod.Candy.Candy;
import Pattern2FactoryMethod.Factory.CandyFactory;
import Pattern2FactoryMethod.Factory.CherryCandyFactory;
import Pattern2FactoryMethod.Factory.MangoCandyFactory;

public class Client {
    public static void main(String[] args) {

        CandyFactory factory;

        factory = new MangoCandyFactory();
        Candy candy1 = factory.CreateCandy();
        candy1.disPlayInfor();

        factory = new CherryCandyFactory();
        Candy candy2 = factory.CreateCandy();
        candy2.disPlayInfor();
    }
}
