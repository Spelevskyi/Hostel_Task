package administration;

import java.util.ArrayList;

import housing.Floor;
import housing.Hostel;
import housing.Room;
import persons.Commandant;
import persons.Security;
import residents.Headman;
import residents.Resident;
import utils.Random;

public class Administration {
    
    private Security security;
    private ArrayList<Headman> headmans;
    private Commandant commandant;
    
    public Administration() {
        super();
    }
    
    public Administration(Commandant commandant, Security security) {
        super();
        this.commandant = commandant;
        this.security = security;
        this.headmans = new ArrayList<Headman>();
    }
    
    public void administrationSettlement(Hostel hostel) {
        commandant.settleInHostel(hostel);
        chooseHeadmans(hostel);
    }
    
    public void administrationEviction(Hostel hostel) {
        commandant.evictFromHostel(hostel);
    }
    
    public void chooseHeadmans(Hostel hostel) {
        for(Floor floor : hostel.getFloors()) {
            Headman headman = new Headman();
            if(!floor.isHeadmanChoosed()) {
                for(Room room : floor.getRooms()){
                    for(Resident resident : room.getResidents()) {
                        if(resident.getYearsInHostel() >= 1 && headman.getCourseNumber() < resident.getCourseNumber()) {
                           headman = (Headman) resident;
                        }
                    }
                }
           
            ((Headman)headman).setLoyalty(Random.generateQualitieValue());
            ((Headman)headman).setConstancy(Random.generateQualitieValue());
            floor.setHeadman(headman);
            headmans.add(headman);
            }
        }
    }
    
    public void completeRoomsCheck(Hostel hostel, int value) {
        for(Floor floor : hostel.getFloors()) {
            if(floor.getHeadman().roomCheck(value)) {
                for(Room room : floor.getRooms()) {
                    double roomStatus = room.countRoomStatus();
                    double headmanStatus = floor.getHeadman().setHeadmanRoomValue(roomStatus);
                    if(roomStatus < headmanStatus) {
                        room.setProtocols();
                        System.out.println("Protocol was written to the residents in room:" + room.getRoomNumber());
                    }
                }
            }
        }
        return;
    }
    
    public void securityWorking(Hostel hostel) {
        for(Resident resident : hostel.getResidents()){
            if(!security.isPassIntoHostel(resident)) {
                System.out.println("Student was not pass into hostel.");
            }
        }
    }
    
    public void paymentChecking(Hostel hostel) {
        for(Resident resident : hostel.getResidents()){
            if(resident.paymentContribution() <= -4) {
                resident.setPaymentFault();
            }
        }
    }
    
    public Security getSecurity() {
        return security;
    }
    
}
