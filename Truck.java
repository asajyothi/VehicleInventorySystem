package com.vechicle.inventory.model;

public class Truck extends Vehicle {

	int loadCapacity;

	public Truck(){
		super();
	}
	
	public Truck(String model, int milege, int makeYear, String vechicleType, int loadCapacity) {
		super(model, milege, makeYear, vechicleType);
		this.loadCapacity = loadCapacity;
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
