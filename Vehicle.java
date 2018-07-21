package com.vechicle.inventory.model;



public class Vehicle {

	private String model;
	private int milege;
	private int makeYear;
	private String vechicleType;
	
	public Vehicle(){
		
	}
	
	/**
	 * @param model
	 * @param milege
	 * @param makeYear
	 */
	public Vehicle(String model, int milege, int makeYear, String vechicleType) {
		super();
		this.model = model;
		this.milege = milege;
		this.makeYear = makeYear;
		this.vechicleType = vechicleType;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMilege() {
		return milege;
	}
	public void setMilege(int milege) {
		this.milege = milege;
	}
	public int getMakeYear() {
		return makeYear;
	}
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


	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + makeYear;
		result = prime * result + milege;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result
				+ ((vechicleType == null) ? 0 : vechicleType.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (makeYear != other.makeYear)
			return false;
		if (milege != other.milege)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (vechicleType == null) {
			if (other.vechicleType != null)
				return false;
		} else if (!vechicleType.equals(other.vechicleType))
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", milege=" + milege + ", makeYear="
				+ makeYear + ", vechicleType=" + vechicleType + "]";
	}

	

	
}
