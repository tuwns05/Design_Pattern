package PatternBuilder;

import PatternBuilder.Builder.BedroomBuilder;
import PatternBuilder.Builder.HouseBuilder;
import PatternBuilder.Builder.KitchenRoomBuilder;
import PatternBuilder.Builder.RoomBuilder;

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
