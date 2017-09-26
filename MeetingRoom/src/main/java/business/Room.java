package business;

import java.util.Arrays;
import java.util.List;

public enum Room {

    ROOM_SMALL(101, 4),
    ROOM_MEDIUM(201, 7),
    ROOM_LARGE(301, 15);

    private  int roomNumber;
    private  int capacity;
    private static List<Room> rooms = Arrays.asList(Room.values());


    Room(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public static Room getByRoomNumber(int number) {
        for(Room room : Room.values()) {
            if(room.getRoomNumber() == number)
                return room;
        }
        return null;
    }

    public String toString() {
        return ("Room :[ roomNumber : " + roomNumber + ", capacity : " + capacity + " ]");
    }
}