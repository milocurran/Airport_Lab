package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Passenger {

    int id;
    String name;
    long passportNumber;
    String nationality;
    String email;
    long contactNumber;

    public Passenger(String passengerName, long passportNumber, String nationality, String email, long contactNumber) {
        this.name = passengerName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    //GETTERS AND SETTERS

    public String getPassengerName() {
        return this.name;
    }

    public void setPassengerName(String passengerName) {
        this.name = passengerName;
    }

    public long getPassportNumber() {
        return this.passportNumber;
    }

    public void setPassportNumber(long passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void displayPassengerDetails(){
        System.out.println("-------   Passenger Name: " + name);
        System.out.println("-------   Passport Number: " + passportNumber);
        System.out.println("-------   Nationality: " + nationality);
        System.out.println("-------   Email: " + email);
        System.out.println("-------   Contact Number:   " + contactNumber);
        }



}
