package Pattern2FactoryMethod.Factory;

import Pattern2FactoryMethod.Candy.Candy;
import Pattern2FactoryMethod.Candy.CherryCandy;
import Pattern2FactoryMethod.Candy.MangoCandy;

public   class CandyFactory {
//        public abstract Candy CreateCandy();

        public Candy getCandy(CandyType candyType){
                Candy candyCreated = null;
                switch (candyType){
                        case CherryCandy:
                                candyCreated = new CherryCandy();
                                break;
                        case MangoCandy:
                                candyCreated= new MangoCandy();
                                break;
                }
                return candyCreated;
        }
}
