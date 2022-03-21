package com.nology;

public class Car extends ParkingLot{
    private int numberOfVehicles;
    private int spotsTaken;

    public Car(int numberOfVehicles, int spotsTaken) {
        super(100, "any spot", "any spot", "car");
        this.numberOfVehicles = numberOfVehicles;
        this.spotsTaken = spotsTaken;
    }

    public Car() {
        super(100, "any spot", "any spot", "car");
    }

    @Override
    public void park() {
        int remainingSpots = getTotalParkingSpots() - (this.numberOfVehicles * spotsTaken);
        System.out.println("i am a " + getNameOfVehicle() + " and my remaining spots are " + remainingSpots);
    }

}

