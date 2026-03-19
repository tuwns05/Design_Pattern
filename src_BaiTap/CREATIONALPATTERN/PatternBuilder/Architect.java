package CREATIONALPATTERN.PatternBuilder;

import CREATIONALPATTERN.PatternBuilder.Builder.BedroomBuilder;
import CREATIONALPATTERN.PatternBuilder.Builder.HouseBuilder;
import CREATIONALPATTERN.PatternBuilder.Builder.KitchenRoomBuilder;

public class Architect {
    public static void main(String[] args) {
        //Simple Builder Pattern
        Bedroom bedroom = new BedroomBuilder()
                .setBedType("King")
                .setSize(30)
                .setHasTV(true)
                .setHasAC(true)
                .setColor("White")
                .build();
        System.out.println(bedroom);

        //Xây house

        House house = new HouseBuilder().addRoomBuilder(new KitchenRoomBuilder().sethasRiceCooker(true).setSize(1).setColor("Cam")).build();

        System.out.println(house);
    }
}
