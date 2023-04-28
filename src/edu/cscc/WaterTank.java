package edu.cscc;
import java.util.Scanner;

public class WaterTank {
    //set my main variables
    private int current;
    private int maxCapacity;

    //Added the constructor to get information from Main
    public WaterTank(int current, int maxCapacity) {
        this.current = current;
        this.maxCapacity = maxCapacity;
    }

    //got the information from main for the current tank water amount
    public int getCurrent() {
        //created an if statement so that when we get current in Main we are able to have less or equal the maximun capacity
        if (current > maxCapacity){
            current = maxCapacity;
        }
        return current;
    }

    //got the information from the main for tank's maximun capacity
    public int getMaxCapacity() {
        return maxCapacity;
    }

    //created a method for adding
    public void add(int addGallons){
        current = current + addGallons;
        if (current > maxCapacity){
            current = maxCapacity;
        }
    }

    //created a method for draining water
    public void drain(int removeGallons){
        current = current - removeGallons;
        if (current < 0){
            current = 0;
        }
    }

    //finally, created a method for outputting the current water amount in the tank
    public void print() {
        System.out.println("The tank volume is " + current + " gallons");
    }


}
