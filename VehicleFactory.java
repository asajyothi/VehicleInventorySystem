package com.vechicle.inventory.model;

public interface VehicleFactory {
	
	Vehicle createVehicle(String type,String model, int milege,int makeYear,int numberOfSeats,int loadCapacity);

}
