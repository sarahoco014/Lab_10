package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Passenger passenger = new Passenger("Passenger","Phone Number");
        Flight flight = new Flight("Destination");
        Airport airport = new Airport("Airport");

        Scanner sc = new Scanner(System.in);


        // CLI ------------------------------------------------------------------------

//        if (choice == 1){
//
//            System.out.println("Provide Passenger Name: ");
//            String name = sc.nextLine();
//            passenger.setName(name);
//
//                sc.nextLine(); // this is needed between the two prompts so that the second one isn't skipped
//
//            System.out.println("Provide Passenger Phone Number: ");
//            String phoneNumber = sc.nextLine();
//            passenger.setPhoneNumber(phoneNumber);
//
//        } else if (choice == 2) {
//
//            System.out.println("Provide Flight Destination: ");
//            String destination = sc.nextLine();
//            flight.setDestination(destination);
//
//        } else if (choice == 3) {
//            flight.addPassenger(passenger);
//            System.out.println("Passenger has Been Added to Flight");
//
//        } else if (choice == 4) {
//            System.out.println("Provide Flight ID: ");
//            int flightID = sc.nextInt();
//            airport.cancelFlight(flightID);
//
//        } else if (choice == 5) {
//            airport.displayAllFlights();
//
//        } else if (choice == 6) {
//            // this one could be an exit
//        }



        boolean Open = true;
        while (Open){

            System.out.println("Press 1 to Add Passenger: ");
            System.out.println("Press 2 to Add Flight: ");
            System.out.println("Press 3 to Book Passenger on Flight: ");
            System.out.println("Press 4 to Cancel Flight: ");
            System.out.println("Press 5 to Display All Flights: ");
            System.out.println("Press 6 to Exit: ");

            int choice = sc.nextInt();

            // IF YOU WANT TO TEST USING IF STATEMENT REPLACE BELOW UP TO -- LINE --------------------------------------------------------------------

            switch (choice){ // switch allows us to break out of the initial condition after we have finished and is faster than if else
                case 1:
                    System.out.println("Provide Passenger Name: ");
                    String name = sc.nextLine();

                    sc.nextLine(); // this is needed between the two prompts so that the second one isn't skipped

                    System.out.println("Provide Passenger Phone Number: ");
                    String phoneNumber = sc.nextLine();

                    passenger.setName(name);
                    passenger.setPhoneNumber(phoneNumber);
                    break;
                case 2:
                    System.out.println("Provide Flight Destination: ");
                    String destination = sc.nextLine();
                    flight.setDestination(destination);
                    airport.addFlight(flight);
                    break;
                case 3:
                    flight.addPassenger(passenger);
                    System.out.println("Passenger has Been Added to Flight");
                    break;
                case 4:
                    System.out.println("Provide Flight ID: ");
                    int flightID = sc.nextInt();
                    airport.cancelFlight(flightID);
                    break;
                case 5:
                    airport.displayAllFlights();
                    break;
                case 6:
                    Open = false;
                    break;
            }

        }
// -------------------------------------------------------------------------------------------------------------------


    }
}
