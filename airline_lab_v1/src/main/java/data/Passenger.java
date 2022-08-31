package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Passenger {

    int id;
    String name;
    int passportNumber;
    String nationality;
    String email;
    int contactNumber;

    public Passenger(String passengerName, int passportNumber, String nationality, String email, int contactNumber) {
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

    public int getPassportNumber() {
        return this.passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(int contactNumber) {
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
