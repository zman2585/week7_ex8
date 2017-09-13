import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by John on 9/6/2017.
 */
public class AirportPanelInterface {
    private ArrayList<Airplane> planes;
    private ArrayList<Flight> flights;
    private Scanner input;
    //private FlightServiceInterface flightService = new FlightServiceInterface(planes,flights, input);


    public AirportPanelInterface(ArrayList<Airplane> planes, ArrayList<Flight> flights,Scanner input){
        this.planes = planes;
        this.flights = flights;
        this.input = input;

    }

    public void start(){
        System.out.print("Airport panel\n" +
                "--------------------\n" );


        while(true) {
            System.out.println("");
            System.out.print(   "Choose operation:\n" +
                    "[1] Add airplane\n" +
                    "[2] Add flight\n" +
                    "[x] Exit\n" +
                    "> ");
            String userInput = input.nextLine();
            if(userInput.equals("x")){
                break;
            }
            handleInput(userInput);
        }


    }

    public void handleInput(String userInput){
        if(userInput.equals("1")){
            addAirplane();
        }
        if(userInput.equals("2")){
            addFlight();
        }


    }

    public void addAirplane(){
        System.out.print("Give plane ID: ");
        String id = input.nextLine();
        System.out.print("Give plane capacity: ");
        int cap = Integer.parseInt(input.nextLine());
        planes.add(new Airplane(id,cap));
    }

    public void addFlight(){
        System.out.print("Give plane ID: ");
        String id = input.nextLine();
        System.out.print("Give departure airport code: ");
        String depart = input.nextLine();
        System.out.print("Give destination airport code: ");
        String destin = input.nextLine();
        flights.add(new Flight(id,depart,destin));

    }


}
