package housing;

import java.util.ArrayList;

import Administration.Administration;
import residents.Resident;

public class Hostel {
    
    private int Id;
    private String universityName;
    private int floorsAmount;
    private ArrayList<Floor> floors;
    private ArrayList<Resident> residents;
    private Administration administration;
    
    public Hostel() {
        super();
    }
    
    public Hostel(int Id, String universityName, int floorAmount,Administration administration) {
        super();
        this.Id = Id;
        this.universityName = universityName;
        this.floorsAmount = floorAmount;
        this.floors = new ArrayList<Floor>(floorsAmount);
        this.residents = new ArrayList<Resident>();
        this.administration = administration;
    }
    
    public void hostelSettlement() {
        administration.administrationSettlement(this);
    }
    
    public void hostelEviction() {
        administration.administrationEviction(this);
    }
    
    public void hostelMaintenanceActions(int date) {
        administration.completeRoomsCheck(this, date);
        administration.paymentChecking(this);
        administration.securityWorking(this);
    }
    
    public void hostelYearConfirmed() {
        for(Resident resident : residents) {
            int years = resident.getYearsInHostel();
            resident.setYearsInHostel(years + 1);
            resident.newCourse();
        }
    }
    
    public int getId() {
        return Id;
    }
    
    public ArrayList<Floor> getFloors(){
        return floors;
    }
    
    public ArrayList<Resident> getResidents(){
        return residents;
    }
    
    public void setFloor(Floor floor) {
        floors.add(floor);
    }
    
    public void setResident(Resident resident) {
        residents.add(resident);
    }
    
    public void removeResident(Resident resident) {
        residents.remove(resident);
    }
    
    public int getFloorsAmount() {
        return floorsAmount;
    }
    
    public String getUniversityName() {
        return universityName;
    }
    
    public Floor getFloor(int index) {
        return floors.get(index);
    }
}
