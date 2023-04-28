package edu.cscc;
//Megan Garcia-Basanez, 2/22/2023, Water Tank content calculator
public class Main {
    public static void main(String[] args) {

        //Set the current amount of water and the maximun capacity of the water tank into the WaterTank class
        WaterTank tank = new WaterTank(350, 300);
        //imported the amount of water in the tank after draining and adding
        tank.getCurrent(); tank.print();
        tank.add(100); tank.drain(180); tank.print();
        tank.add(60); tank.drain(200); tank.print();
        tank.drain(50); tank.add(375); tank.drain(142); tank.print();

    }
}