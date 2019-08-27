import housing.Hostel;
import initialization.Initialization;
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
