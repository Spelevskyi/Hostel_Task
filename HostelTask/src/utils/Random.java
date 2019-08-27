package utils;

public class Random {
    public static int generateQualitieValue() {
        return (int) (1 + Math.random()*5);
    }
    
    public static int generateCourseValue() {
        return (int) (1 + Math.random()*4);
    }
    
    public static int generateHeadmanRoomStatusValue() {
        return (int) (-5 + Math.random()*5);
    }
    
    public static int generateSecurityLoyaltyValue() {
        return (int) (1 + Math.random()*20);
    }
    
    public static int generateResidentRoomStatusValue() {
        return (int) (-1 + Math.random()*1);
    }
    
    public static int generatePaymentFaultValue() {
        return (int) (-5 + Math.random()*4);
    }
    
    public static int generateHostelPassValue() {
        return (int) (-4 + Math.random()*10);
    }    
}
