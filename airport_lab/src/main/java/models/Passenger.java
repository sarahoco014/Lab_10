package models;

import interfaces.IID;

import java.math.BigInteger;
import java.util.Random;

public class Passenger implements IID {

    String name;
    String phoneNumber;
    String passID; // this one is passenger name + geneID

    public Passenger(String name, String phoneNumber){
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassID() {
        return passID;
    }

    public void setPassID() {
        this.passID = this.name + geneID();
    }

    @Override
    public int geneID() {
        Random rand = new Random(); // gives an 4 digit passenger ID number
        return rand.nextInt(1000,10000);
    }
}
