package PatternBuilder.Builder;

import PatternBuilder.Room;

public interface RoomBuilder  {
    RoomBuilder setSize(int size);
    RoomBuilder setColor(String color);
    Room build();


}
