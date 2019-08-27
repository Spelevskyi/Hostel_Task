package housing;

import java.util.ArrayList;

import persons.Student;
import residents.Headman;
import residents.Resident;

public class Floor {
    
    private int floorNumber;
    private int roomsAmount;
    private ArrayList<Room> rooms;
    private ArrayList<Resident> residents;
    private Headman headman;
    
    public Floor() {
        super();
    }
    
    public Floor(int floorNumber, int roomsAmount) {
        super();
        this.floorNumber = floorNumber;
        this.roomsAmount = roomsAmount;
        this.rooms = new ArrayList<Room>(roomsAmount);
        this.residents = new ArrayList<Resident>();
    }
    
    public int getFloorNumber() {
        return floorNumber;
    }
    
    public int getRoomsAmount() {
        return roomsAmount;
    }
    
    public ArrayList<Room> getRooms(){
        return rooms;
    }
    
    public void setRoom(Room room) {
        rooms.add(room);
    }
    
    public Headman getHeadman() {
        return headman;
    }
    
    public void setHeadman(Headman headman) {
        this.headman = headman;
    }
    
    public Room getRoom(int index) {
        return rooms.get(index);
    }
    
    public ArrayList<Resident> getResidents(){
        return residents;
    }
    
    public boolean isHeadmanChoosed() {
        if(headman == null) {
            return false;
        }
        return true;
    }
}
