package com.vechicle.inventory.service;

import org.springframework.http.ResponseEntity;

import com.vechicle.inventory.model.Vehicle;



public interface VehicleSerivce {
	
	ResponseEntity<?> getAllVehiclesDetails();
	
	ResponseEntity<?> addVehicle(Vehicle vehicleDetails);
	
	ResponseEntity<?> updateVehicleDetails(int vehicleMilege , int vin);
	
	ResponseEntity<?> deleteLatestVehicle();

}
