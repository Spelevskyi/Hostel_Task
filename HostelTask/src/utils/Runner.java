package utils;

import java.util.Scanner;

import housing.Hostel;

public class Runner {
    private Hostel hostel;
    
    public Runner(Hostel hostel) {
        this.hostel = hostel;
    }
    
    public void runHostel() {
        Scanner scanner = new Scanner(System.in);
        boolean isHostelWork = true;
        while(isHostelWork) {
            hostel.hostelSettlement();
            for(int i = 1; i < 12;i++) {
                for(int j = 1; j <= 31; j++) {
                    hostel.hostelMaintenanceActions(j);
                }
            }  
            hostel.hostelEviction();
            hostel.hostelYearConfirmed();
            System.out.println("Year is passed, do you want to continue(yes/no)??");
            String symbol = scanner.next();
            if(symbol.equals("yes")) {
                isHostelWork = true;
            }
            else if(symbol.equals("no")) {
                isHostelWork = false;
            }
        }
    }
}
