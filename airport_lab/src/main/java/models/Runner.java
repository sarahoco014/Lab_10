package models;

public class Runner {
    public static void main(String[] args) {

        Passenger passenger = new Passenger("Bob", "07773836472");
        Flight flight = new Flight("Paris", 234567);
        Airport airport = new Airport("Heathrow");

        flight.addPassenger(passenger);
        airport.addFlight(flight);

        airport.displayAllFlights();

        

    }
}
