package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        // TEST--------------------------------------------------------------------

//        Passenger passenger = new Passenger("Bob", "07773836472");
//        Flight flight = new Flight("Paris");
//        Airport airport = new Airport("Heathrow");
//
//        flight.addPassenger(passenger);
//        airport.addFlight(flight);
//
//        airport.displayAllFlights();

        System.out.println("Press 1 to Add Passenger: ");
        System.out.println("Press 2 to Add Flight: ");
        System.out.println("Press 3 to Book Passenger on Flight: ");
        System.out.println("Press 4 to Cancel Flight: ");
        System.out.println("Press 5 to Display All Flights: ");

        Passenger passenger;
        Flight flight;
        Airport airport;

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();


        // CLI ------------------------------------------------------------------------

        if (choice == 1){

            System.out.println("Provide Passenger Name: ");
            String name = sc.nextLine();

            System.out.println("Provide Passenger Name: ");
            String phoneNumber = sc.nextLine();

            passenger = new Passenger(name,phoneNumber);
            flight.addPassenger(passenger);

        } else if (choice == 2) {

            System.out.println("Provide Flight Destination: ");
            String destination = sc.nextLine();
            flight = new Flight(destination);





        } else if (choice == 3) {



        } else if (choice == 4) {



        } else if (choice == 5) {



        } else if (choice == 6) {
            // this one could be an exit

        }


        switch (choice){ // could use a switch would run faster
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }

    }
}
