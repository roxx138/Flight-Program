package coe528.lab1;

public abstract class passenger 
{

	// Declaring instance variables
	String name;
	int age;
	
	/**
	 * Creating a constructor which will initialize the instance variables
	 *
	 * @param  name                		name of the person
	 * @param  age                		age of the person
	 */
	public passenger(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}

	/**
	 *  Creating setters and getters for each instance variable
	 */
	
	/**
	 * Setter for the name
	 *
	 * @param   name        Name of the person
	 */
	public void setName(String name) 
	{
		this.name = name;
	}
	
	/**
	 * Setter for the age
	 *
	 * @param  age       age of the person
	 */
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	/**
	 * Getter for the name
	 * 
	 * @return   name of the person
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * Getter for the age
	 * 
	 * @return   age of the person
	 */
	public int getAge() 
	{
		return age;
	}

	/**
	 * Creating a applyDiscount() method which will be overridden in the sub classes
	 *
	 * @param   p      Original Price of the flight 
	 * @return  the discounted price of a flight if particular requirements are met
	 */
	public abstract double applyDiscount(double p);
	
}// End of Class
