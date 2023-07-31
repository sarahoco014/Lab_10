package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    String userInput;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Airport airport = new Airport("Luton");
        Flight flight = new Flight("London", 123456);
        Passenger passenger = new Passenger("Sarah", "07462836431");

        ArrayList<Passenger> passengersFreeToAdd = new ArrayList<>();

        passengersFreeToAdd.add(new Passenger("abc", "123456789"));
        passengersFreeToAdd.add(new Passenger("def", "123456789"));
        passengersFreeToAdd.add(new Passenger("ghi", "123456789"));
        passengersFreeToAdd.add(new Passenger("jkl", "123456789"));

        airport.addFlight(new Flight("Paris", 111111));
        airport.addFlight(new Flight("Madrid", 222222));
        airport.addFlight(new Flight("Edinburgh", 333333));
        airport.addFlight(new Flight("Glasgow", 444444));
        airport.addFlight(new Flight("Brussels", 555555));

        flight.addPassenger(new Passenger("Margaret", "07748598697"));
        flight.addPassenger(new Passenger("Sandra", "07234543455"));
        flight.addPassenger(new Passenger("Jim", "07654567564"));
        flight.addPassenger(new Passenger("Gary", "07564323456"));
        flight.addPassenger(new Passenger("Philip", "07898765678"));

        System.out.println("Welcome to Luton Airport! Please select from the following options: ");

        boolean isSystemRunning = true;

        while(isSystemRunning) {
            System.out.println("1 - Add a new flight");
            System.out.println("2 - Display all available flights");
            System.out.println("3 - Add a new passenger");
            System.out.println("4 - Book a passenger onto a flight");
            System.out.println("5 - Cancel a flight");

            String userInput = scanner.nextLine();

            if (Integer.parseInt(userInput) == 1) {
                System.out.println("Please enter flight destination");
                String enterFlightDest = scanner.nextLine();

                System.out.println("Please enter the flight ID (6 digit number)");
                String enterFlightId = scanner.nextLine();

                Flight flight2 = new Flight(enterFlightDest, Integer.parseInt(enterFlightId));
                airport.addFlight(flight2);

                System.out.println("Thank you, your flight has been added");

                isSystemRunning = false;

            } else if(Integer.parseInt(userInput) == 2) {

                System.out.println(airport.displayFlightDetails());

                isSystemRunning = false;

            } else if(Integer.parseInt(userInput) == 3) {

                System.out.println("Please enter the passenger's name: ");
                String enterName = scanner.nextLine();

                System.out.println("Please enter the passenger's contact number: ");
                String enterContact = scanner.nextLine();

                Passenger newPassenger = new Passenger(enterName, enterContact);
                passengersFreeToAdd.add(newPassenger); //correct?

                System.out.println("Thank you, passenger added to passenger list!");

                isSystemRunning = false;

            } else if(Integer.parseInt(userInput) == 4) {
                System.out.println("Please choose a passenger you would like to book onto the flight.");

                for (int i = 0; i < passengersFreeToAdd.size(); i++) {
                    System.out.println(i + " - " + passengersFreeToAdd.get(i).getName() + " " + passengersFreeToAdd.get(i).getPassportNumber());
                }

                String enterPassName = scanner.nextLine();

                System.out.println("What flight would you like to book the passenger to?");

                for (int i = 0; i < airport.getFlightCount(); i++) {
                    System.out.println(i + " - " + airport.getFlights().get(i).getFlightId() + " travelling to " + airport.getFlights().get(i).getDestination());
                }

                String enterFlightId = scanner.nextLine();

                airport.bookPassengerOnToFlight(airport.getFlights()453836.get(Integer.parseInt(enterFlightId)), passengersFreeToAdd.get(Integer.parseInt(enterPassName)));

                System.out.println("Thank you for booking with us. Your booking was successful!");

                isSystemRunning = false;

            } else if(Integer.parseInt(userInput) == 5) {

                System.out.println("What flight would you like to cancel?");

                for (int i = 0; i < airport.getFlightCount(); i++) {
                    System.out.println(i + " - " + airport.getFlights().get(i).getFlightId() + " travelling to " + airport.getFlights().get(i).getDestination());
                }

                String enterFlightId2 = scanner.nextLine();

                System.out.println("What passenger would like to cancel this flight.");

                for (int i = 0; i < flight.getPassList().size(); i++) {
                    System.out.println(i + " - " + flight.getPassList().get(i).getName());
                }

                String enterPassName2 = scanner.nextLine();

                airport.cancelFlight(airport.getFlights().get(Integer.parseInt(enterFlightId2)), passengersFreeToAdd.get(Integer.parseInt(enterPassName2)));

                System.out.println("Your flight has been successfully cancelled.");

                isSystemRunning = false;

            } else {
                System.out.println("Booking system does not recognise input. Please try again.");
            }
        }
        System.out.println("Thanks for using Luton Airport!");
    }
}
