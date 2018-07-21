package com.vechicle.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vechicle.inventory.model.Vehicle;
import com.vechicle.inventory.model.VehicleType;
import com.vechicle.inventory.service.VehicleFactoryImpl;
import com.vechicle.inventory.service.VehicleSerivce;


@RestController
@RequestMapping("/")
@ResponseBody
public class VehicleInventoryController {

	@Autowired
	private VehicleSerivce serviceImpl;

	@Autowired
	private VehicleFactoryImpl vehicleFactory;

	/**
	 * Method to retrive all vehicles details
	 * 
	 * @return
	 */
	@RequestMapping(value = "/allVehicleDetails", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> getVehicleDetails() {
		
		return serviceImpl.getAllVehiclesDetails();
	}

	/**
	 * Method to add vehicle to the inventory
	 * 
	 * @param type
	 */
	@RequestMapping(value = "/addVehicle", method = RequestMethod.POST)
	public  ResponseEntity<?> addVehicle(@RequestParam String vehicletype,@RequestParam String model,@RequestParam int milege,
			@RequestParam int makeYear, @RequestParam(required=false,defaultValue="0") int numberOfSeats, @RequestParam(required=false, defaultValue="0") int loadCapacity) {


		Vehicle newVehicle = vehicleFactory.createVehicle(vehicletype,model,milege,makeYear,numberOfSeats,loadCapacity);
		return serviceImpl.addVehicle(newVehicle);

	}

	/**
	 * Method to update vehicle details to the inventory
	 * 
	 * @param type
	 */
	@RequestMapping(value = "/updateVehicle", method = RequestMethod.PUT)
	public  ResponseEntity<?> updateVehicleDetails(@RequestParam int milege,
			@RequestParam int vin) {

		return serviceImpl.updateVehicleDetails(milege, vin);

	}

	/**
	 * Method to delete vehicle details to the inventory
	 * 
	 * @param type
	 */
	@RequestMapping(value = "/deleteVehicle", method = RequestMethod.DELETE)
	public  ResponseEntity<?>  deleteRecentVehicle() {

		return serviceImpl.deleteLatestVehicle();

	}

}
