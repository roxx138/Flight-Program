package coe528.lab1;

public class ticket {

		// Declaring instance variables
		passenger passenger_a;
		flight flight_a;
		double price;
		static int number = 0;
		
		/**
		 * Creating a constructor which will initialize the instance variables
		 *
		 * @param  p                		passenger object
		 * @param  f                		flight object
		 * @param  price             		price of the flight 
		 */
		public ticket(passenger p, flight f, double price) {
			passenger_a = p;
			flight_a = f;
			this.price = price;
			number ++;
		}

		
		/**
		 *  Creating setters and getters for each instance variable
		 */
		
		/**
		 * Setter for the passenger
		 *
		 * @param  passenger_a       the passenger object
		 */
		public void setPassenger_a(passenger passenger_a) {
			this.passenger_a = passenger_a;
		}
		
		/**
		 * Setter for the flight
		 *
		 * @param  flight_a    the flight object
		 */
		public void setFlight_a(flight flight_a) {
			this.flight_a = flight_a;
		}
		
		/**
		 * Setter for the price
		 *
		 * @param  price      the price of the ticket, whether it is discounted or original price
		 */
		public void setPrice(double price) {
			this.price = price;
		}
		
		/**
		 * Getter for the passenger
		 * 
		 * @return   the passenger
		 */
		public passenger getPassenger_a() {
			return passenger_a;
		}
		
		/**
		 * Getter for the flight
		 * 
		 * @return  the flight 
		 */
		public flight getFlight_a() {
			return flight_a;
		}
		
		/**
		 * Getter for the price
		 * 
		 * @return   the price of the flight 
		 */
		public double getPrice() {
			return price;
		}
		
		/*
		 * Return a string representation of the ticket object
		 */
		@Override
		public String toString() {
			return passenger_a.getName() + ", " + flight_a.toString() + " ticket price: $" + price;
		}
	
}
