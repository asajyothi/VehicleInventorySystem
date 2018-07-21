package com.vechicle.inventory.model;

import org.springframework.stereotype.Component;

@Component
public class VehicleDTO {

	int vin;
	private String model;
	private int milege;
	private int makeYear;
	private String vechicleType;
	int numberOfSeats;
	int loadCapacity;
	
	
	
	/**
	 * @return the vin
	 */
	public int getVin() {
		return vin;
	}
	/**
	 * @param vin the vin to set
	 */
	public void setVin(int vin) {
		this.vin = vin;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the milege
	 */
	public int getMilege() {
		return milege;
	}
	/**
	 * @param milege the milege to set
	 */
	public void setMilege(int milege) {
		this.milege = milege;
	}
	/**
	 * @return the makeYear
	 */
	public int getMakeYear() {
		return makeYear;
	}
	/**
	 * @param makeYear the makeYear to set
	 */
	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}
	/**
	 * @return the vechicleType
	 */
	public String getVechicleType() {
		return vechicleType;
	}
	/**
	 * @param vechicleType the vechicleType to set
	 */
	public void setVechicleType(String vechicleType) {
		this.vechicleType = vechicleType;
	}
	/**
	 * @return the numberOfSeats
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	/**
	 * @param numberOfSeats the numberOfSeats to set
	 */
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	/**
	 * @return the loadCapacity
	 */
	public int getLoadCapacity() {
		return loadCapacity;
	}
	/**
	 * @param loadCapacity the loadCapacity to set
	 */
	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
	
}
