package com.nology;

public class Motorcycle extends ParkingLot{
    private int numberOfVehicles;
    private int spotsTaken;

    public Motorcycle(int numberOfVehicles, int spotsTaken) {
        super(100, "any spot", "any spot", "motorcycle");
        this.numberOfVehicles = numberOfVehicles;
        this.spotsTaken = spotsTaken;
    }

    public Motorcycle() {
        super(100, "any spot", "any spot", "motorcycle");
    }


    @Override
    public void park() {
        int remainingSpots = getTotalParkingSpots() - (this.numberOfVehicles * spotsTaken);
        System.out.println("i am a " + getNameOfVehicle() + " and my remaining spots are " + remainingSpots);
    }

}
