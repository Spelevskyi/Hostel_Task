package persons;

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
        for(Floor floor : hostel.getFloors()) {
            for(Room room : floor.getRooms()) {
               while(!room.isRoomFull()) {
                   Resident resident = new Resident(Random.generateCourseValue(),Random.generateQualitieValue(),
                          Random.generateQualitieValue(),Random.generateQualitieValue());
                   room.settleResidentInRoom(resident);
                   resident.setRoomNumber(room.getRoomNumber());
                   hostel.setResident(resident);
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
                       hostel.getAdministration().getSecurity().helpEvictResident("Student was evicted from room "
                       + resident.getRoomNumber() + " because of payment fault.");
                       iterator.remove();
                       hostel.removeResident(resident);
                    }
                    else if(resident.getProtocolsAmount() >= 2) {
                        hostel.getAdministration().getSecurity().helpEvictResident("Student was evicted from room "
                        + resident.getRoomNumber() + " because protocols amount graiter than 2.");
                        iterator.remove();
                        hostel.removeResident(resident);
                    }
                    else if(resident.getCourseNumber() > 4) {
                        hostel.getAdministration().getSecurity().helpEvictResident("Student was evicted from room " 
                        + resident.getRoomNumber() + " because he ended studying in university.");
                        iterator.remove();
                        hostel.removeResident(resident);
                    }
                    else if(resident.universityExpulsion()) {
                        hostel.getAdministration().getSecurity().helpEvictResident("Student was evicted from room " 
                        + resident.getRoomNumber() + " because of university expulsion.");
                        iterator.remove();
                        hostel.removeResident(resident);
                    }
                 }
            }
        }
        return;
    }
    
}
