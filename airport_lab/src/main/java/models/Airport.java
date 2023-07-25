package models;

import java.util.ArrayList;

public class Airport {

    private String airportName;
    private ArrayList<Flight> flights;

    public Airport(String airportName, ArrayList<Flight> flights) {
        this.airportName = airportName;
        this.flights = flights;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public void displayAllFlights() {
        for(int i = 0; i < flights.size(); i++){
            System.out.println(flights.get(i));
        }
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    public void cancelFlight(String ) {

    }

}
