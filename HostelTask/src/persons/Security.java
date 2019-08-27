package persons;

import residents.Resident;
import utils.Random;

public class Security{
    
    private int loyalty;
        
    public Security(int loyalty) {
        this.loyalty = loyalty;
    }
    
    public int getLoyalty() {
        return loyalty;
    }
    
    public boolean isPassIntoHostel(Resident resident) {
        if(!resident.hostelPassContribution() && (Random.generateSecurityLoyaltyValue() < loyalty)) {
            resident.decreaseLoathing();
            return false;
        }
        return true;
    }
    
    public void helpEvictResident(String cause) {
        System.out.println(cause);
    }
}
