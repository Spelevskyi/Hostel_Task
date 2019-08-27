package initialization;

import administration.Administration;
import housing.Floor;
import housing.Hostel;
import housing.Room;
import persons.Commandant;
import persons.Security;
import utils.Random;

public class Initialization {
    
    private final static int FLOORS_AMOUNT = 4;
    private final static int ROOMS_AMOUNT = 4;
    private final static int FLOOR_VALUE = 100;
    private Hostel hostel;
    
    public Initialization() {
        Commandant commandant = new Commandant();
        Security security = new Security(Random.generateQualitieValue());
        Administration administration = new Administration(commandant,security);
        hostel = new Hostel(2,"BSUIR",FLOORS_AMOUNT,administration);
    }
    
    public void initializeHostel() {
        initializeHostelFloors();
        initializeFloorRooms();
    }
    
    public void initializeHostelFloors() {
        for(int i = 0; i < hostel.getFloorsAmount(); i++) {
            hostel.setFloor(new Floor(i+1,ROOMS_AMOUNT));
        }
    }
    
    public void initializeFloorRooms() {
        int number = 0;
        for(int i = 0; i < hostel.getFloorsAmount();i++) {
            for(int j = 0; j < hostel.getFloors().get(i).getRoomsAmount();j++){
                number = (FLOOR_VALUE * i) + j;
                hostel.getFloors().get(i).setRoom(new Room(number));
            }
        }
    }
    
    public Hostel getHostel() {
        return hostel;
    }
    
}
