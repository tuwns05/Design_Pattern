package CREATIONALPATTERN.PatternBuilder.Builder;

import CREATIONALPATTERN.PatternBuilder.KitchenRoom;
import CREATIONALPATTERN.PatternBuilder.Room;

public class KitchenRoomBuilder implements RoomBuilder{
    private int size;
    private String color;
    public boolean hasRiceCooker;


    @Override
    public RoomBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    @Override
    public RoomBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public RoomBuilder sethasRiceCooker(boolean hasRiceCooker) {
        this.hasRiceCooker = hasRiceCooker;
        return this;
    }

    @Override
    public Room build() {
        return new KitchenRoom(size,color,hasRiceCooker);
    }
}

