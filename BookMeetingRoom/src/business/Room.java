package business;

public class Room {

    static int id = 0;
    String roomNumber;
    int capacity;

    public Room(String roomNumber, int capacity) {
        id = id++;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }
}
