package models;

import interfaces.IID;

import java.util.ArrayList;
import java.util.Random;

public class Flight implements IID {

    private String destination;
    private int flightId;
    private ArrayList<Passenger> passList;

    public Flight(String destination, int flightId) {
        this.destination = destination;
        this.flightId = flightId;
        passList = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightId() {
        return flightId;
    }

    public ArrayList<Passenger> getPassList() {
        return passList;
    }

    public void addPassenger(Passenger passenger) {
        this.passList.add(passenger);
    }

    @Override
    public void generateId() {
        Random rand = new Random();
        flightId = rand.nextInt(1000,10000);
    }
}
