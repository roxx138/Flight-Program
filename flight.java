package coe528.lab1;

public class flight {

	// Declaring instance variables 
	private int flightNumber, capacity, numOfSeatsLeft;
	private String origin, destination, departureTime;
	private double originalPrice;
	
	/**
	 * Creating a constructor which will initialize the instance variables
	 *
	 * @param  flightNumber                 the flight number
	 * @param  capacity                		the number of seats on the plane
	 * @param  origin              		    the origin 
	 * @param  destination                  the destination 
	 * @param  departureTime                the departure time
	 * @param  originalPrice                the original price             			   
	 * @throws IllegalArgumentException     if origin == destination 
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
				this.numOfSeatsLeft = capacity - ticket.number;
				this.departureTime = departureTime;
				this.origin = origin;
				this.destination = destination;
				this.originalPrice = originalPrice;
			}	
			
		}catch(IllegalArgumentException a){
			System.out.println("The origin and destination cannot be the same!");
		}
		
	}// End of Constructor
	
	/**
	 *  Creating setters and getters for each instance variable
	 */
	
	/**
	 * Setter for the flight number
	 *
	 * @param  a                 the flight number
	 */
	public void setFlightNumber(int a) 
	{
		flightNumber = a;	
	}
	
	/**
	 * Setter for the capacity of the flight 
	 *
	 * @param  a                 the number of seats a plane may hold
	 */
	public void setCapacity(int a) 
	{
		capacity = a;
	}
	
	/**
	 * Setter for the number of available seats left
	 *
	 * @param  a                 the number of seats left on a plane
	 */
	public void setNumOfSeatsLeft(int a) 
	{
		numOfSeatsLeft = a;
	}
	
	/**
	 * Setter for the origin 
	 *
	 * @param  a                 the starting point of a flight
	 */
	public void setOrigin(String a) {
		origin = a;
	}
	
	/**
	 * Setter for the destination 
	 *
	 * @param  a                 the end point of a flight 
	 */
	public void setDestination(String a) 
	{
		destination = a;
	}
	
	/**
	 * Setter for the departure time 
	 *
	 * @param  a                 the departure time of a flight
	 */
	public void setDepartureTime(String a) 
	{
		departureTime = a;
	}
	
	/**
	 * Setter for the original price of the flight 
	 *
	 * @param  a                 the original price of a flight
	 */
	public void setOriginalPrice(double a) 
	{
		originalPrice = a;
	}
	
	/**
	 * Getter for the flight number
	 *  
	 * @return   flight number of the flight 
	 */
	public int getFlightNumber() 
	{
		return flightNumber;
	}
	
	/**
	 * Getter for the capacity
	 *  
	 * @return   capacity of the flight 
	 */
	public int getCapacity() 
	{
		return capacity;
	}
	
	/**
	 * Getter for the numOfSeatsLeft
	 *  
	 * @return    number seats left on the flight 
	 */
	public int getNumOfSeatsLeft() 
	{
		return numOfSeatsLeft;
	}
	
	/**
	 * Getter for the origin
	 *  
	 * @return   origin of the flight 
	 */
	public String getOrigin() 
	{
		return origin;
	}
	
	/**
	 * Getter for the destination 
	 *  
	 * @return   destination of the flight 
	 */
	public String getDestination() 
	{
		return destination;
	}
	
	/**
	 * Getter for the departure time
	 *  
	 * @return   departure time of the flight 
	 */
	public String getDepartureTime() 
	{
		return departureTime;
	}
	
	/**
	 * Getter for the original price 
	 *  
	 * @return   original price of the flight 
	 */
	public double getOriginalPrice() 
	{
		return originalPrice;
	}
	
	/**
	 * Creating a method which returns true if a customer may book a seat, else returns false
	 *
	 * @return   true or false depending on numOfSeatsLeft
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
	
}// End of Class
