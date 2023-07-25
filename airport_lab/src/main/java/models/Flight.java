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
        this.passList = passList;
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

    public void setFlightId() {
        this.flightId = geneID();
    }

    public ArrayList<Passenger> getPassList() {
        return passList;
    }

    public void setPassList(ArrayList<Passenger> passList) {
        this.passList = passList;
    }

    public void addPassList(Passenger passenger) {
        this.passList.add(passenger);
    }

    public int geneID() {
        Random rand = new Random();
        return rand.nextInt(100_000, 1_000_000);
    }

}
