package coe528.lab1;

public class member extends passenger 
{

	// Declaring instance variables 
		int yearsOfMembership;
		
	/**
	 * Creating a constructor which will initialize the instance variables
	 *
	 * @param  name                		name of the person
	 * @param  age                		age of the person
	 * @param  yearsOfMembership        years of membership		
	 */
	public member(String name, int age, int yearsOfMembership) 
	{
		super(name, age);
		this.yearsOfMembership = yearsOfMembership;
	}
	
	/**
	 * Overriding the applyDiscount() method in the passenger class
	 * Applying a 50% discount to the price if the passenger has a membership of more than 5 years.
	 * Applying a 10% discount if the passenger has a membership between more than 1 year to less than 5 years.
	 * If either are the case, no discount is applied 
	 * 
	 * @param  p				price of the flight
	 * @return   A possible discounted price
	 */
	@Override
	public double applyDiscount(double p)
	{
		
		if(yearsOfMembership > 5) 
		{
			p = p * 0.50;
		}
		else if(yearsOfMembership > 1 && yearsOfMembership < 5) 
		{
			p = p * 0.90;
		}
		else 
		{
			p = p * 1;
		}
		 
		return p;	
	}
}// End of Class
