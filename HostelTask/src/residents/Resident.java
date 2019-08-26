package residents;

import persons.Student;
import utils.Random;

public class Resident extends Student{
    private int roomNumber;
    private int accuracy;
    private int loathing;
    private int responsibility;
    private int protocolsAmount;
    private int yearsInHostel;
    private boolean paymentFault;
    
    public Resident() {
        super();
    }
    
    public Resident(int courseNumber,int accuracy,int loathing,int responsibility) {
        super(courseNumber);
        this.roomNumber = 0;
        this.accuracy = accuracy;
        this.loathing = loathing;
        this.responsibility = responsibility;
        this.protocolsAmount = 0;
        this.paymentFault = false;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }
    
    public void setRoomNumber(int value) {
        roomNumber = value;
    }
    
    public int getAccuracy() {
        return accuracy;
    }
    
    public void setAccuracy(int value) {
        accuracy = value;
    }
    
    public int getLoathing() {
        return loathing;
    }
    
    public void setLoathing(int value) {
        loathing = value;
    }
    
    public void decreaseLoathing() {
         loathing -= 1;
    }
    
    public int getResponsibility() {
        return responsibility;
    }
    
    public void setResponsibility(int value) {
        responsibility = value;
    }
    
    public int getProtocolsAmount() {
        return protocolsAmount;
    }
    
    public void setProtocolsAmount(int value) {
        protocolsAmount = value;
    }
    
    public boolean getPaymentFault() {
        return paymentFault;
    }
    
    public void setPaymentFault(boolean value) {
        paymentFault = value;
    }
    
    public void increaseProtocolsAmount() {
        protocolsAmount += 1;
    }
    
    public int getYearsInHostel() {
        return yearsInHostel;
    }
    
    public void setYearsInHostel(int value) {
        yearsInHostel = value;
    }
    
    public void setPaymentFault() {
        paymentFault = true;
    }
    
    public double roomStatusContribution() {
        return (((accuracy + responsibility) - loathing) + Random.generateResidentRoomStatusValue());
    }
    
    public double paymentContribution() {
        return responsibility + Random.generatePaymentFaultValue();
    } 
    
    public boolean hostelPassContribution() {
        return responsibility + Random.generateHostelPassValue() <= 2 ? false : true;
    }
}
