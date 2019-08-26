package persons;

import java.util.ArrayList;
import java.util.Iterator;

import housing.Floor;
import housing.Hostel;
import housing.Room;
import residents.Resident;
import utils.Random;

public class Commandant{
    
    public Commandant() {
        super();
    }
    
    public void settleInHostel(Hostel hostel) {
        Random random = new Random();
        for(Floor floor : hostel.getFloors()) {
            for(Room room : floor.getRooms()) {
                Resident resident = new Resident(random.generateCourseValue(),random.generateQualitieValue(),
                        random.generateQualitieValue(),random.generateQualitieValue());
                hostel.setResident(resident);
                while(!room.isRoomFull()) {
                    room.settleResidentInRoom(resident);
                    resident.setRoomNumber(room.getRoomNumber());
                    System.out.println("Student was settled in room: " + room.getRoomNumber());
                }
            }
        }
    }
    
    public void evictFromHostel(Hostel hostel) {
        for(Floor floor : hostel.getFloors()) {
            for(Room room : floor.getRooms()) {
                Iterator<Resident> iterator = room.getResidents().iterator();
                while(iterator.hasNext()) {
                    Resident resident = iterator.next();
                    if(resident.getPaymentFault()) {
                       iterator.remove();
                       System.out.println("Student was evicted from room " + resident.getRoomNumber() + " because"
                               + " of payment fault.");
                    }
                    else if(resident.getProtocolsAmount() >= 2) {
                        iterator.remove();
                        System.out.println("Student was evicted from room " + resident.getRoomNumber() + " because"
                                + " protocols amount graiter than 2.");
                    }
                    else if(resident.getCourseNumber() > 4) {
                        iterator.remove();
                        System.out.println("Student was evicted from room " + resident.getRoomNumber() + " because"
                                + " he was leaving tne university.");
                    }
                 }
            }
        }
    }
    
}
