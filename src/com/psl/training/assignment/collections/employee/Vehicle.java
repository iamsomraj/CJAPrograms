package com.psl.training.assignment.collections.employee;

public class Vehicle {
	private String vehicleName;
	private String vehicleRegNumber;

	/**
	 * @return the vehicleName
	 */
	public String getVehicleName() {
		return vehicleName;
	}

	/**
	 * @param vehicleName the vehicleName to set
	 */
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	/**
	 * @return the vehicleRegNumber
	 */
	public String getVehicleRegNumber() {
		return vehicleRegNumber;
	}

	/**
	 * @param vehicleRegNumber the vehicleRegNumber to set
	 */
	public void setVehicleRegNumber(String vehicleRegNumber) {
		this.vehicleRegNumber = vehicleRegNumber;
	}

	public Vehicle(String vehicleName, String vehicleRegNumber) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleRegNumber = vehicleRegNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vehicleName == null) ? 0 : vehicleName.hashCode());
		result = prime * result + ((vehicleRegNumber == null) ? 0 : vehicleRegNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (vehicleName == null) {
			if (other.vehicleName != null)
				return false;
		} else if (!vehicleName.equals(other.vehicleName))
			return false;
		if (vehicleRegNumber == null) {
			if (other.vehicleRegNumber != null)
				return false;
		} else if (!vehicleRegNumber.equals(other.vehicleRegNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + ", vehicleRegNumber=" + vehicleRegNumber + "]";
	}

}
