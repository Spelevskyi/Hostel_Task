package housing;

import java.util.ArrayList;

import persons.Student;
import residents.Headman;
import residents.Resident;

public class Floor {
    
    private int floorNumber;
    private int roomsAmount;
    private int studentsAmount;
    private ArrayList<Room> rooms;
    private ArrayList<Resident> students;
    private Headman headman;
    
    public Floor() {
        super();
    }
    
    public Floor(int floorNumber, int roomsAmount, int studentsAmount) {
        super();
        this.floorNumber = floorNumber;
        this.roomsAmount = roomsAmount;
        this.studentsAmount = studentsAmount;
        this.rooms = new ArrayList<Room>(roomsAmount);
        this.students = new ArrayList<Resident>(studentsAmount);
    }
    
    public int getFloorNumber() {
        return floorNumber;
    }
    
    public int getRoomsAmount() {
        return roomsAmount;
    }
    
    public int getStudentsAmount() {
        return studentsAmount;
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
    
    public ArrayList<Resident> getStudents(){
        return students;
    }
    
    public boolean isHeadmanChoosed() {
        if(headman == null) {
            return false;
        }
        return true;
    }
}
