
import java.util.ArrayList;
import java.util.Scanner;

import Administration.Administration;
import housing.Hostel;
import housing.Room;
import initialization.Initialization;
import persons.Commandant;
import persons.Security;
import residents.Resident;

public class HostelTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isHostelWork = true;
        Initialization data = new Initialization();
        data.initializeHostel();
        Hostel hostel = data.getHostel();
        while(isHostelWork) {
            for(int i = 1; i < 12;i++) {
                hostel.hostelSettlement();
                for(int j = 1; j <= 31; j++) {
                    hostel.hostelMaintenanceActions(j);
                }
            }  
            hostel.hostelYearConfirmed();
            hostel.hostelEviction();
            System.out.println("Year is passed, do you want to continue(yes/no)??");
            String symbol = scanner.next();
            if(symbol.equals("yes")) {
                isHostelWork = true;
            }
            if(symbol.equals("no")) {
                isHostelWork = false;
            }
        }
    }
}
