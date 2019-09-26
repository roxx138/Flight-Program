package coe528.lab1;

public abstract class passenger 
{

	// Declaring instance variables
	String name;
	int age;
	
	// Creating a constructor
	public passenger(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}

	/**
	 *  Creating setters and getters for each instance variable
	 */
	
	// Setters 
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	// Getters
	public String getName() 
	{
		return name;
	}
	public int getAge() 
	{
		return age;
	}

	// Creating a applyDiscount() method which will be overridden in the sub classes
	public abstract double applyDiscount(double p);
	
}// End of Class
