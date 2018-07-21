package com.vechicle.inventory.model;



public class Car extends Vehicle {
	

	int numberOfSeats;
	
	public Car() {
		 super();
	    
	}
	
	public Car(String model, int milege, int makeYear, String type, int numberOfSeats) {
		super(model, milege, makeYear,type);
		this.numberOfSeats = numberOfSeats;
		
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

	

	


	

}
