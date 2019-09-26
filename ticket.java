package coe528.lab1;

public class ticket {

		// Declaring instance variables
		passenger passenger_a;
		flight flight_a;
		double price;
		static int number = 0;
		
		// Creating a constructor which will initialize our variables 
		public ticket(passenger p, flight f, double price) {
			passenger_a = p;
			flight_a = f;
			this.price = price;
			number ++;
		}

		
		/**
		 *  Creating setters and getters for each instance variable
		 */
		
		// Setters 
		public void setPassenger_a(passenger passenger_a) {
			this.passenger_a = passenger_a;
		}
		public void setFlight_a(flight flight_a) {
			this.flight_a = flight_a;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		// Getters
		public passenger getPassenger_a() {
			return passenger_a;
		}
		public flight getFlight_a() {
			return flight_a;
		}
		public double getPrice() {
			return price;
		}
		
		/*
		 * Return a string representation of the ticket object
		 */
		@Override
		public String toString() {
			return passenger_a + flight_a.toString() + " ticket price: $" + price;
		}
	
}
