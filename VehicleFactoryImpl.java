package com.vechicle.inventory.service;

import org.springframework.stereotype.Service;

import com.vechicle.inventory.model.Car;
import com.vechicle.inventory.model.Truck;
import com.vechicle.inventory.model.Vehicle;
import com.vechicle.inventory.model.VehicleFactory;
import com.vechicle.inventory.model.VehicleType;

@Service
public class VehicleFactoryImpl implements VehicleFactory {
	
	
	public Vehicle createVehicle(String type,String model, int milege,int makeYear,int numberOfSeats,int loadCapacity){

		VehicleType vehType= VehicleType.valueOf(type);
		
		if(vehType == null){
			return null;
		}
		
		else if ( vehType == VehicleType.CAR ){
			return new Car(model, milege, makeYear, type.toString() ,numberOfSeats );
		}else if ( vehType == VehicleType.TRUCK){
			return new Truck(model, milege, makeYear, type.toString(),loadCapacity );
		}
			
		return null;
				
		}

}
