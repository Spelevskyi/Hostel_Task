package housing;

import java.util.ArrayList;
import java.util.Iterator;

import residents.Resident;

public class Room {
    
    private int roomNumber;
    private int residentsAmount;
    private double roomStatus;
    private ArrayList<Resident> residents;
    private ArrayList<Double> marks;
    
    public Room() {
        super();
    }
    
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.residentsAmount = 0;
        this.roomStatus = 5.0;
        this.residents = new ArrayList<Resident>(residentsAmount);
        this.marks = new ArrayList<Double>();
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }
    
    public int getStudentsAmount() {
        return residentsAmount;
    }
    
    public double getRoomStatus() {
        return roomStatus;
    }
    
    public ArrayList<Resident> getResidents(){
        return residents;
    }
    
    public Resident getResident(int index) {
        return residents.get(index);
    }
    
    public void setProtocols() {
        for(Resident resident : getResidents()) {
            resident.increaseProtocolsAmount();
        }
    }
    
    public void removeResident() {
        residentsAmount--;
    }
    
    public void settleResidentInRoom(Resident resident) {
        residents.add(resident);
        residentsAmount++;
    }
    
    public boolean isRoomFull() {
        if(residentsAmount < 3) {
            return false;
        }
        return true;
    }
    
    public double countRoomStatus() {
        double summaryStatus = 0.0;
        for(Resident resident : this.residents) {
            summaryStatus += resident.roomStatusContribution();
        }
        summaryStatus /= 3;
        return summaryStatus;
    }
    
    public void setRoomStatus(double status) {
        roomStatus = status;
        marks.add(roomStatus);
    }
    
    public void setRoomResidents(Resident resident) {
        residents.add(resident);
    }
}
