package residents;

import utils.Random;

public class Headman extends Resident{
    
    private int constancy;
    private int loyalty;
    
    public Headman() {
        super();
    }
    
    public Headman(int courseNumber,int accuracy,int loathing,int responsibility,int constancy,int loyalty) {
        super(courseNumber,accuracy,loathing,responsibility);
        this.constancy = constancy;
        this.loyalty = loyalty;
    }
    
    public int getConstancy() {
        return constancy;
    }
    
    public int getLoyalty() {
        return loyalty;
    }
    
    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    
    public void setConstancy(int constancy) {
        this.constancy = constancy;
    }
    
    public double setHeadmanRoomValue(double room_status) {
        Random random = new Random();
        return loyalty + (room_status/2) + random.generateHeadmanRoomStatusValue();
    }
    
    public boolean roomCheck(int date) {
        if(date % constancy == 3) {
            return true;
        }
        return false;
    }
}
