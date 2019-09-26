package coe528.lab1;

public class manager {

	flight arr_1[] = new flight[3];
	ticket arr_2[] = new ticket[100];
	
	// Creating a method which will populate the flight array with flight objects
	public void createFlights() {
		
		arr_1[0]= new flight(1030, 100, "Toronto", "Seoul", "03/02/99 7:50", 1310.00);
		arr_1[1]= new flight(1040, 100, "NYC", "Chicago", "13/02/99 9:00", 200.00);
		arr_1[2]= new flight(1050, 100, "Toronto", "Tokyo", "25/06/99 11:00", 1050.00);
		
	}
	
	// Creating a function which will display information about all the flights not fully booked yet
	public void displayAvailableFlights(String origin, String destination) {
		
		// If there is space on the plane, return the flight
		for(int i = 0; i < arr_1.length; i++) {
			if(arr_1[i].getOrigin() == origin && arr_1[i].getDestination() == destination && arr_1[i].bookASeat() == true)  {
				System.out.println(arr_1[i].toString());
			}
		}
	}
	
	// Creating a function which will return the flight object based from the flight number
	public flight getFlight(int flightNumber) {
		
		// Creating a loop which will go through the Flight array and return the flight with the particular flight number
		for(int i = 0; i < arr_1.length; i++) {
			if( arr_1[i].getFlightNumber() == flightNumber ) {
				
				return arr_1[i];
			}
		}
		
		return null;
	}
	
	// Creating a function which will book a flight for a given flight number if it exists
	public void bookSeat(int flightNumber, passenger p) {
		
		// Looking for a specific given the flight number
		for(int i = 0; i < arr_1.length; i++) {
			if( arr_1[i].getFlightNumber() == flightNumber) {
				
			}
		}
		
		
	}
	
	// Main method 
	public static void main(String[] args) {
		
		// Creating an instance of the manager
		manager m1 = new manager();
		
		// Populating the flight array
		m1.createFlights();
		
		// Displaying all the available flights
		System.out.println("The available flights are:\n");
		m1.displayAvailableFlights("Toronto", "Tokyo");
		m1.displayAvailableFlights("Toronto", "NYC");
		m1.displayAvailableFlights("Toronto", "Seoul");
		
		// Getting the flight info
		m1.getFlight(1050);
		
	}
	
	
}
