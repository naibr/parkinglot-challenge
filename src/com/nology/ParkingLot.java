package com.nology;

public abstract class ParkingLot {
    int totalParkingSpots;
    String typeOfSpots;
    String nameOfSpot;
    String nameOfVehicle;

    public ParkingLot(int totalParkingSpots, String typeOfSpots, String nameOfSpot, String nameOfVehicle) {
        this.totalParkingSpots = totalParkingSpots;
        this.typeOfSpots = typeOfSpots;
        this.nameOfSpot = nameOfSpot;
        this.nameOfVehicle = nameOfVehicle;
    }

    public String getNameOfVehicle() {
        return nameOfVehicle;
    }

    public int getTotalParkingSpots() {
        return totalParkingSpots;
    }

    public String getTypeOfSpots() {
        return typeOfSpots;
    }

    public String getNameOfSpot() {
        return nameOfSpot;
    }

    public abstract void park();


}

