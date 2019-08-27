
import java.util.ArrayList;
import java.util.Scanner;

import administration.Administration;
import housing.Hostel;
import housing.Room;
import initialization.Initialization;
import persons.Commandant;
import persons.Security;
import residents.Resident;
import utils.Runner;

public class HostelTask {
    public static void main(String[] args) {
        Initialization data = new Initialization();
        data.initializeHostel();
        Hostel hostel = data.getHostel();
        Runner runner = new Runner(hostel);
        runner.runHostel();
    }
}
