package com.sanjay.CarRental;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<User>users = addUsers();
		List<Vehicle>vehicles = addVehicles();
		List<Store>stores = addStores(vehicles);
		
	}

	private static List<Store> addStores(List<Vehicle> vehicles) {
		List<Store>stores = new ArrayList<>();
		Store store1 = new Store();
		store1.setStoreId(1);
		store1.setVehicleInventoryManagement(vehicles);
		stores.add(store1);
		return stores;
	}

	private static List<Vehicle> addVehicles() {
		List<Vehicle>vehicles = new ArrayList<>();
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleId(0);
		vehicle1.setVehicleType(VehicleType.Car);
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleId(0);
		vehicle2.setVehicleType(VehicleType.Car);
		
		vehicles.add(vehicle1);
		vehicles.add(vehicle2);
		
		
		return vehicles;
	}

	private static List<User> addUsers() {
		List<User>users = new ArrayList<>();
		User user1 = new User(1, "Sanjay", "licensew");
		users.add(user1);
		return users;
	}

}
