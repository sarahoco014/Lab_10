package models;

import java.util.ArrayList;

public class Airport {

    private String airportName;
    private ArrayList<Flight> flights;

    public Airport(String airportName) {
        this.airportName = airportName;
        this.flights = new ArrayList<>();

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

    public void displayAllFlights() {
        for(int i = 0; i < flights.size(); i++){
            System.out.println(flights.get(i));
        }
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    public void cancelFlight(int FlightID) {
        // loop through the for loop

        for (int i = 0; i < flights.size(); i++) { // loops through all flights
            if(FlightID == flights.get(i).getFlightId()){ // checks if the flight ids match
                flights.remove(flights.get(i)); // removes the flight at the current index
            }
        }
    }

    public void searchFlight(String Destination){
        for (int i = 0; i <flights.size() ; i++) {
            if(Destination.equals(flights.get(i).getDestination())){
                System.out.println( flights.get(i).toString());
            }
        }
    }
}
