package data;

import java.util.ArrayList;
import java.util.Scanner;

public class Flight {

    int id;
    String flightNumber;
    String from;
    String to;
    double departureTime;
    double arrivalTime;
    double price;
    int numberOfPassengers;    //list size

    public Flight(String flightNumber, String from, String to, double departureTime, double arrivalTime,
                  int numberOfPassengers, double price){
        this.flightNumber = flightNumber;
        this.from = from.toUpperCase();
        this.to = to.toUpperCase();
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.numberOfPassengers = numberOfPassengers;
        this.price = price;
    }

    //GETTERS AND SETTERS

    public int getId(){ return id;}

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getDepartureTime() {
        return this.departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public double getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void displayFlightDetail() {
        //int averageFlightCapacity = 220;

        System.out.println("-------   Flight:   #" + flightNumber);
        System.out.println("-------   From:      " + from + "    -------");
        System.out.println("-------   To:        " + to + "      -------");
        System.out.println("-------   Departure: " + departureTime);

        System.out.println("-------   Arrival:   " + arrivalTime);
        System.out.println("-------   Price:    £" + price);
        System.out.println("------    Capacity:  " + numberOfPassengers);
    }

}



