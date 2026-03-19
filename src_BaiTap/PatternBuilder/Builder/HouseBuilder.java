package PatternBuilder.Builder;

import PatternBuilder.House;
import PatternBuilder.Room;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {
    private List<Room> rooms = new ArrayList<>();
    private House house = new House();

    public HouseBuilder addRoom(Room room) {
        house.addRoom(room);
        return this;
    }

    public HouseBuilder addRoomBuilder(RoomBuilder roomBuilder) {
        this.rooms.add(roomBuilder.build());
        return this;
    }

    public House build() {
        House house = new House();
        for (Room room : rooms) {
            house.addRoom(room);
        }
        return house;
    }




}
