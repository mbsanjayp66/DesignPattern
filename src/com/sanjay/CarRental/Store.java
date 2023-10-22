package com.sanjay.CarRental;

import java.util.ArrayList;
import java.util.List;

public class Store {
	int storeId;
	VehicleInventoryManagement vehicleInventoryManagement;
	Location storeLocation;
	List<Reservation>reservations = new ArrayList<>();
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public VehicleInventoryManagement getVehicleInventoryManagement() {
		return vehicleInventoryManagement;
	}
	public void setVehicleInventoryManagement(List<Vehicle>vehicles) {
		vehicleInventoryManagement = new VehicleInventoryManagement(vehicles);
	}
	public Location getStoreLocation() {
		return storeLocation;
	}
	public void setStoreLocation(Location storeLocation) {
		this.storeLocation = storeLocation;
	}
	public List<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
}
