package CREATIONALPATTERN.PatternBuilder.Builder;

import CREATIONALPATTERN.PatternBuilder.Room;

public interface RoomBuilder  {
    RoomBuilder setSize(int size);
    RoomBuilder setColor(String color);
    Room build();


}
