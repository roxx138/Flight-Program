package coe528.lab1;
/**
* The manager program implements a flight for passengers
*
* @author  Giordan Dela Cruz
* @version 1.0
* @since   2019-09-7 
*/
public class manager {

	flight arr_1[] = new flight[3];
	ticket arr_2[] = new ticket[100];
	
	static ticket t1 = null;
	
	// Creating a method which will populate the flight array with flight objects
	public void createFlights() {
		
		arr_1[0]= new flight(1030, 2, "Toronto", "Seoul", "03/02/99 7:50", 1310.00);
		arr_1[1]= new flight(1040, 100, "NYC", "Chicago", "13/02/99 9:00", 200.00);
		arr_1[2]= new flight(1050, 100, "Toronto", "Tokyo", "25/06/99 11:00", 1050.00);
		
	}
	
	// Creating a function which will display information about all the flights not fully booked yet
	public void displayAvailableFlights(String origin, String destination) {
		
		// If there is space on the plane, return the flight
		for(int i = 0; i < arr_1.length; i++) {
			if(arr_1[i].getOrigin() == origin && arr_1[i].getDestination() == destination && arr_1[i].getNumOfSeatsLeft() > 0)  {
				System.out.println(arr_1[i].toString());
			}
		}
	}
	
	// Creating a function which will return the flight object based from the flight number
	public flight getFlight(int flightNumber) {
		
		// Creating a loop which will go through the Flight array and return the flight with the particular flight number
		for(int i = 0; i < arr_1.length; i++) {
			if( arr_1[i].getFlightNumber() == flightNumber )
			{		
				return arr_1[i];
			}
		}
		return null;
	}
	
	// Creating a function which will book a flight for a given flight number if it exists
	public void bookSeat(int flightNumber, passenger p) {
		
		// Looking for a specific given the flight number
		for(int i = 0; i < arr_1.length; i++) {
			
			if( arr_1[i].getFlightNumber() == flightNumber && arr_1[i].bookASeat() == true) 
			{
				t1 = new ticket(p, arr_1[i], p.applyDiscount( arr_1[i].getOriginalPrice() ) );
				System.out.println(t1.toString());
			}
		}
		
		
	}
	
	// Main method 
	public static void main(String[] args) {
		
		// Creating an instance of the manager
		manager m1 = new manager();
		
		// Creating an array of passenger objects
		passenger arr_3[] = new passenger[5];
		arr_3[0] = new member("Giordan", 19, 1); 
		arr_3[1] = new nonMember("AJ", 70); 
		arr_3[2] = new member("Fjorm", 24, 4); 
		arr_3[3] = new member("Cate", 17, 6); 
		arr_3[4] = new member("Ken", 22, 8); 
		
		// Populating the flight array
		m1.createFlights();
		
		// Displaying all the available flights
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("\nUsing the displayAvailableFlights() method, The available flights are:\n");
		m1.displayAvailableFlights("Toronto", "Tokyo");
		m1.displayAvailableFlights("Toronto", "NYC");
		m1.displayAvailableFlights("Toronto", "Seoul");
		
		// Getting the flight info
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("\nUsing the getFlight() method with flight number 1050 as the parameter:\n" + m1.getFlight(1050));
		System.out.println("\nUsing the getFlight() method with flight number 1030 as the parameter:\n" + m1.getFlight(1030));
		System.out.println("\nUsing the getFlight() method with flight number 1060 as the parameter:\n" + m1.getFlight(1060));
		
		System.out.println("\n*Null was expected and is correct since there is no flight with a flight number of 1060*");
		// Booking the flights
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("\nUsing the bookSeat() method with flight number and passenger as the parameters, we return the tickets:\n");
		// Booking the same flight #1030, however there is only 2 tickets left!! Therefore one of the customers will not get a ticket!!
		m1.bookSeat(1030, arr_3[0]);
		m1.bookSeat(1030, arr_3[3]);
		m1.bookSeat(1030, arr_3[4]);
		
		// Booking the other flights, where the same person who could not book a flight #1030 will book a flight on flight #1040 instead
		m1.bookSeat(1040, arr_3[1]);
		m1.bookSeat(1050, arr_3[2]);
		m1.bookSeat(1040, arr_3[4]);
		
		
	
		
		
		
	}
	
	
}
