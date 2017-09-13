import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by John on 9/6/2017.
 */
public class FlightServiceInterface {
    private ArrayList<Airplane> planes;
    private ArrayList<Flight> flights;
    private Scanner input;

    public FlightServiceInterface(ArrayList<Airplane> planes, ArrayList<Flight> flights, Scanner input){
        this.planes = planes;
        this.flights = flights;
        this.input = input;

    }

    public void start(){
        System.out.println("Flight service\n" +
                "------------");


        while(true){
            System.out.println("");
            System.out.print("Choose operation:\n" +
                    "[1] Print planes\n" +
                    "[2] Print flights\n" +
                    "[3] Print plane info\n" +
                    "[x] Quit\n" +
                    ">");

            String userInput = input.nextLine();
            if(userInput.equals("x")){
                break;
            }
            handleInput(userInput);

        }
    }

    public void handleInput(String userInput){
        if(userInput.equals("1")){
            printPlanes();
        }
        if(userInput.equals("2")){
            printFlights();
        }
        if(userInput.equals("3")){
            printPlaneInfo();
        }


    }

    public void printPlanes(){
        for (Airplane plane: planes){
            System.out.println(plane);
        }
    }

    public void printFlights(){
       for(Airplane plane: planes){
           for(Flight flight: flights){
               if(flight.getPlaneID().equals(plane.getPlaneID())){
                   System.out.println(plane +""+ flight);
               }
           }
       }
    }

    public void printPlaneInfo(){
        System.out.print("Give plane ID: ");
        String id = input.nextLine();

        for(Airplane plane: planes){
            if (id.equals(plane.getPlaneID())){
                System.out.println(plane);
            }
        }
    }

}
