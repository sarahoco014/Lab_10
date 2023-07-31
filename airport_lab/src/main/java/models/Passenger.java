package models;

import interfaces.IID;

import java.util.Random;

public class Passenger implements IID {

    String name;
    String phoneNumber;
    String passportNumber;

    public Passenger(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.passportNumber = "";
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

    public String getPassportNumber() {
        return passportNumber;
    }

    @Override
    public void generateId() {
        Random rand = new Random();
        passportNumber = name + rand.nextInt(1000,10000);
    }
}
