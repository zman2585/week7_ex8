import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner input = new Scanner(System.in);
        ArrayList<Airplane> planes = new ArrayList<Airplane>();
        ArrayList<Flight> flights = new ArrayList<Flight>();
        AirportPanelInterface ui = new AirportPanelInterface(planes, flights, input);
        FlightServiceInterface flightService = new FlightServiceInterface(planes,flights, input);

        ui.start();
        flightService.start();
        System.out.println("this is a test");

    }
}
