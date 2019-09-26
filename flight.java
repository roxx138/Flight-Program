package coe528.lab1;

public class flight {

	// Declaring instance variables 
	private int flightNumber, capacity, numOfSeatsLeft;
	private String origin, destination, departureTime;
	private double originalPrice;
	
	// Initializing the numOfSeatsLeft
	
	/**
	 *  Creating a constructor which will initialize the instance variables
	 */
	public flight(int flightNumber, int capacity, String origin, String destination, String departureTime, double originalPrice) 
	{
		// Throwing an illegal argument exception if the origin and destination are the same
		try {
			
			if( origin.equals(destination) ) 
			{
				 throw new IllegalArgumentException("The origin and destination cannot be the same!");
			}
			else if(flightNumber < 0 || capacity < 0 || originalPrice < 0)
			{
				throw new IllegalArgumentException("The flight number, capacity, or original price cannot be negative!");
			}
			else
			{
				this.flightNumber = flightNumber;
				this.capacity = capacity;
				this.departureTime = departureTime;
				this.origin = origin;
				this.destination = destination;
			}	
			
		}catch(IllegalArgumentException a){
			System.out.println("The origin and destination cannot be the same!");
		}
		
	}// End of Constructor
	
	/**
	 *  Creating setters and getters for each instance variable
	 */
	// Setters 
	public void setFlightNumber(int a) 
	{
		flightNumber = a;	
	}
	public void setCapacity(int a) 
	{
		capacity = a;
	}
	public void setNumOfSeatsLeft(int a) 
	{
		numOfSeatsLeft = a;
	}
	public void setOrigin(String a) {
		origin = a;
	}
	public void setDestination(String a) 
	{
		destination = a;
	}
	public void setDepartureTime(String a) 
	{
		departureTime = a;
	}
	public void setOriginalPrice(double a) 
	{
		originalPrice = a;
	}
	
	// Getters
	public int getFlightNumber() 
	{
		return flightNumber;
	}
	public int getCapacity() 
	{
		return capacity;
	}
	public int getNumOfSeatsLeft() 
	{
		return numOfSeatsLeft;
	}
	public String getOrigin() 
	{
		return origin;
	}public String getDestination() 
	{
		return destination;
	}
	public String getDepartureTime() 
	{
		return departureTime;
	}
	public double getOriginalPrice() 
	{
		return originalPrice;
	}
	
	/*
	 *  Creating a method which returns true if a customer may book a seat, else returns false
	 */
	public boolean bookASeat() 
	{
		if( numOfSeatsLeft > 0 ) 
		{
			numOfSeatsLeft -= 1;
			return true;
		}else
		{
			return false;
		}
	}
	
	/*
	 * Return a string representation of the flight object
	 */
	@Override
	public String toString() {
		return "Flight " + flightNumber + ", " + origin + " to " + destination + ", " + departureTime + ", original price: " + originalPrice + "$";
		
	}
	
	
	// Testing
//	public static void main(String[] args) {
//		flight validFlight = new flight(1030, 300, "Toronto", "Seoul", "03/02/99 7:50", 1310.00);
//		flight invalidFlight = new flight(1030, 300, "Toronto", "Toronto", "15/09/2019 8:00AM", 1310.00);
//
//		System.out.println(validFlight);
//		System.out.println(invalidFlight);
//		
//	}
	
}// End of Class
