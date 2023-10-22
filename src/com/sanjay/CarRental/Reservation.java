package com.sanjay.CarRental;

import java.util.Date;

public class Reservation {
	int reservationId;
	User user;
	Vehicle vehicle;
	Date bookingDate;
	Date dateBookedFrom;
	Date dateBookedTo;
	Long fromTimeStamp;
	Long toTimeStamp;
	Location pickUpLocation;
	Location dropLocation;
	ReservationStatus reservationStatus;
	Location location;
}
