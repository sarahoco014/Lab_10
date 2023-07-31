package models;

import java.util.ArrayList;

public class Airport {

    private String airportName;
    private ArrayList<Flight> flights;

    public Airport(String airportName) {
        this.airportName = airportName;
        this.flights = new ArrayList<>();
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    public String displayFlightDetails() {
        String flightInfo = "";
        for (Flight flight : this.flights) {
            flightInfo += "Flight " + flight.getFlightId() + " to " + flight.getDestination() + ", ";
        }
        return flightInfo;
    }

    public int getFlightCount() {
        return this.flights.size();
    }

    public void bookPassengerOnToFlight(Flight flight, Passenger passenger) {
        for (int i = 0; i < flights.size(); i++) {
            if (flight.equals(flight.getFlightId()) && passenger.getName().equals(passenger)) {
                flight.addPassenger(passenger);
            } else {
                System.out.println("Please enter a valid Flight ID or name.");
            }
        }
    }

    public void cancelFlight(Flight flight, Passenger passenger) {
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).equals(flight)) {
                if(flights.get(i).getPassList().equals(passenger)) {
                    flight.addPassenger(passenger);
                }
            } else {
                System.out.println("Please enter a valid Flight ID or name.");
            }
        }
    }
}

