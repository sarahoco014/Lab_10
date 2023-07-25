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

//    public void cancelFlight(String PassengerID, int FlightID) {
//        // loop through the for loop
//
//        for (int i = 0; i < flights.size(); i++) {
//
//            // check conditions are true
//            if(PassengerID.equals(flights.get(i).getPassList().)){
//
//            }
//
//
//        }
//        // check conditions are true
//    }

    public void searchFlight(String Destination){
        for (int i = 0; i <flights.size() ; i++) {
            if(Destination.equals(flights.get(i).getDestination())){
                System.out.println( flights.get(i).toString());
            }
        }
    }
}
