package models;

import interfaces.IID;

import java.util.Random;

public class Passenger implements IID {

    String name;
    int phoneNumber;
    String passID; // this one is passenger name + geneID

    public Passenger(String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.passID = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassID() {
        return passID;
    }

    public void setPassID(String passID) {
        this.passID = passID;
    }

    @Override
    public int geneID() {
        Random rand = new Random();
        return rand.nextInt(100000,10000000);
    }
}
