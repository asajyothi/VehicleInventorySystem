package com.vechicle.inventory.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.vechicle.inventory.model.Vehicle;
import com.vechicle.inventory.model.VehicleDTO;


@Repository
public interface VehicleDAO {
	
	List<VehicleDTO> getAllVehiclesDetails();
	
	void addVehicle(VehicleDTO vehicleDetails);
	
	void updateVehicleDetails(int vehicleMilege , int vin);
	
	void deleteLatestVehicle();
	

}
