package com.nology;

public class Van extends ParkingLot{
    private int numberOfVehicles;
    private int spotsTaken;

    public Van(int numberOfVehicles, int spotsTaken) {
        super(100, "any spot", "any spot", "van");
        this.numberOfVehicles = numberOfVehicles;
        this.spotsTaken = spotsTaken;
    }

    public Van() {
        super(100, "any spot", "any spot", "van");
    }


    @Override
    public void park() {
        int remainingSpots = getTotalParkingSpots() - (this.numberOfVehicles * spotsTaken);
        System.out.println("i am a " + getNameOfVehicle() + " and my remaining spots are " + remainingSpots);
    }

}
