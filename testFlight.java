package coe528.lab1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFlight {

	// Creating a object of type Flight with default values and a reference variable named test
		flight test = new flight(0, 0, "a", "b", "c", 0.0);
			
		
	/**
	 *  Creating 2 methods which will test the constructor of the Flight class with valid and invalid arguments
	 */
	@Test
	public void testConstructor() {
		
		// Creating a object of type Flight and a reference variable named validFlight
		flight validFlight = new flight(1030, 300, "Toronto", "Seoul", "03/02/99 7:50", 1310.00);
	}
	
	@Test
	public void testInvalidConstructor() {
			
		// Creating a object of type Flight and a reference variable named invalidFlight
		flight invalidFlight = new flight(1030, 300, "Toronto", "Toronto", "15/09/2019 8:00AM", 1310.00);
	}

	
	/**
	 *  Testing all the setters and getters in the Flight class
	 */
	@Test
	public void testSettersAndGetters() 
	{
		// Initializing values using setters in the Flight class 
		test.setFlightNumber(1013);
		test.setCapacity(300);
		test.setNumOfSeatsLeft(3);
		test.setOrigin("Tokyo");
		test.setDestination("New York");
		test.setDepartureTime("27/09/2019 11:00AM");
		test.setOriginalPrice(450.00);
		
		// Retrieving the values we initialize 
		int output_1 = test.getFlightNumber();
		int output_2 = test.getCapacity();
		int output_3 = test.getNumOfSeatsLeft();
		String output_4 = test.getOrigin();
		String output_5 = test.getDestination();
		String output_6 = test.getDepartureTime();
		double output_7 = test.getOriginalPrice();
		 
		// Testing if we receive the output we expect for each variable
		assertEquals(1013, output_1);
		assertEquals(300, output_2);
		assertEquals(3, output_3);
		assertEquals("Tokyo", output_4);
		assertEquals("New York", output_5);
		assertEquals("27/09/2019 11:00AM", output_6);
		assertEquals(450.00, output_7);
	}
	
	
}// End of Class
