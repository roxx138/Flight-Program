package coe528.lab1;

public class nonMember extends passenger
{

	/**
	 * Creating a constructor which will initialize the instance variables
	 *
	 * @param  name                		name of the person
	 * @param  age                		age of the person
	 */
	public nonMember(String name, int age) 
	{
		super(name, age);
	}

	
	/**
	 * Overriding the applyDiscount() method in the passenger class
	 * Applying a 10% discount if the age of the passenger is greater than 65,
	 * otherwise no discount will be applied
	 *
	 * @param  p				price of the flight
	 * @return   A possible discounted price
	 */
	@Override
	public double applyDiscount(double p)
	{
		if(super.getAge() > 65) 
		{
			p = p * 0.90;
		}
		else 
		{
			p = p * 1;
		}
		 
		return p;	
	}
}
