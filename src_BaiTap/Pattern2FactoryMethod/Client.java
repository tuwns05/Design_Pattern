package Pattern2FactoryMethod;

import Pattern2FactoryMethod.Candy.Candy;
import Pattern2FactoryMethod.Factory.CandyFactory;
import Pattern2FactoryMethod.Factory.CandyType;

public class Client {
    public static void main(String[] args) {

        CandyFactory factory = new CandyFactory();
        Candy cherryCandy = factory.getCandy(CandyType.CherryCandy);
        cherryCandy.disPlayInfor();
        Candy mangoCandy = factory.getCandy(CandyType.MangoCandy);
        mangoCandy.disPlayInfor();


    }
}
