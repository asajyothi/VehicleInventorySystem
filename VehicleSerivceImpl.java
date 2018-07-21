package com.vechicle.inventory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vechicle.inventory.DAO.VehicleDAO;
import com.vechicle.inventory.constants.InventoryLookupValues;
import com.vechicle.inventory.model.Car;
import com.vechicle.inventory.model.Truck;
import com.vechicle.inventory.model.Vehicle;
import com.vechicle.inventory.model.VehicleDTO;
import com.vechicle.inventory.response.ResponseInfo;

@Service
public class VehicleSerivceImpl  implements VehicleSerivce{

	@Autowired
	private VehicleDAO vehicleDaoimpl;
	
	@Autowired
	private VehicleDTO vehicleDTO;
	
	@Autowired
	ResponseInfo response;
	
	HttpStatus httpStatus = HttpStatus.OK;
	
	
	@Override
	public ResponseEntity<?> getAllVehiclesDetails() {
		
		try{
			List<VehicleDTO> allVehicles =  vehicleDaoimpl.getAllVehiclesDetails();
			if(allVehicles!=null && allVehicles.size() > 0){
				response.setErrorMsg("");
				response.setIsSuccess(true);
				response.setReturnValues(allVehicles);			
			}else{
				response.setErrorMsg(InventoryLookupValues.NO_VEHICLES);
				response.setIsSuccess(false);
				response.setReturnValues(null);
			}
		}
		catch(Exception e){
			response.setErrorMsg("");
			response.setIsSuccess(false);
			response.setReturnValues(null);
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			
		}
		return new ResponseEntity<ResponseInfo>(response,httpStatus);
	}


	@Override
	public ResponseEntity<?> addVehicle(Vehicle vehicleDetails) {
		
		try{
		
		vehicleDTO.setMakeYear(vehicleDetails.getMakeYear());
		vehicleDTO.setMilege(vehicleDetails.getMilege());
		vehicleDTO.setModel(vehicleDetails.getModel());
		vehicleDTO.setVechicleType(vehicleDetails.getVechicleType());
		if(vehicleDetails.getVechicleType().equalsIgnoreCase("CAR")){
			Car car = (Car)vehicleDetails;
			vehicleDTO.setNumberOfSeats(car.getNumberOfSeats());
		}else if (vehicleDetails.getVechicleType().equalsIgnoreCase("TRUCK")){
			Truck truck = (Truck)vehicleDetails;
			vehicleDTO.setLoadCapacity(truck.getLoadCapacity());
		}
		
		vehicleDaoimpl.addVehicle(vehicleDTO);
		List<String> sucessMessage = new ArrayList<String>();
		sucessMessage.add(InventoryLookupValues.VEHICLE_ADDED_SUCESSFULLY);
		
		response.setErrorMsg("");
		response.setIsSuccess(true);
		response.setReturnValues(sucessMessage);
		
		}
		catch(Exception e){			
			response.setErrorMsg(InventoryLookupValues.GENERAL_DENIAL);
			response.setIsSuccess(false);
			response.setReturnValues(null);
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return new ResponseEntity<ResponseInfo>(response,httpStatus);
		
	}

	@Override
	public ResponseEntity<?> updateVehicleDetails(int vehicleMilege, int vin) {
		
		try{
			vehicleDaoimpl.updateVehicleDetails(vehicleMilege, vin);
			
			List<String> sucessMessage = new ArrayList<String>();
			sucessMessage.add(InventoryLookupValues.VEHICLE_UPDATED_SUCESSFULLY);
			
			response.setErrorMsg("");
			response.setIsSuccess(true);
			response.setReturnValues(sucessMessage);
		}
		catch(Exception e){
			
			response.setErrorMsg(InventoryLookupValues.GENERAL_DENIAL);
			response.setIsSuccess(false);
			response.setReturnValues(null);
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return new ResponseEntity<ResponseInfo>(response,httpStatus);
	}

	@Override
	public ResponseEntity<?> deleteLatestVehicle() {
		
		try{
			vehicleDaoimpl.deleteLatestVehicle();
			List<String> sucessMessage = new ArrayList<String>();
			sucessMessage.add(InventoryLookupValues.VEHICLE_DELETED_SUCESSFULLY);
			
			response.setErrorMsg("");
			response.setIsSuccess(true);
			response.setReturnValues(sucessMessage);
		
		}
		catch(Exception e){
			
			response.setErrorMsg(InventoryLookupValues.GENERAL_DENIAL);
			response.setIsSuccess(false);
			response.setReturnValues(null);
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		
		return new ResponseEntity<ResponseInfo>(response,httpStatus);
	}

}
