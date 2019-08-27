package initialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import administration.Administration;
import housing.Floor;
import housing.Hostel;
import housing.Room;
import persons.Commandant;
import persons.Security;
import residents.Resident;
import utils.Parser;
import utils.Random;

public class Initialization {
    
    private Hostel hostel;
    
    public Initialization() {
        Random random = new Random();
        Commandant commandant = new Commandant();
        Security security = new Security(random.generateQualitieValue());
        Administration administration = new Administration(commandant,security);
        hostel = new Hostel(2,"BSUIR",4,administration);
    }
    
    public void initializeHostel() {
        initializeHostelFloors();
        initializeFloorRooms();
    }
    
    public void initializeHostelFloors() {
        for(int i = 0; i < hostel.getFloorsAmount(); i++) {
            hostel.setFloor(new Floor(i+1,4,12));
        }
    }
    
    public void initializeFloorRooms() {
        int number = 0;
        for(int i = 0; i < hostel.getFloorsAmount();i++) {
            for(int j = 0; j < hostel.getFloors().get(i).getRoomsAmount();j++){
                number = (100 * i) + j;
                hostel.getFloors().get(i).setRoom(new Room(100 * i + j));
            }
        }
    }
    
    public Hostel getHostel() {
        return hostel;
    }
    
}
