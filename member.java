package coe528.lab1;

public class member extends passenger 
{

	// Constructor
	public member(String name, int age) 
	{
		super(name, age);
	}

	// Declaring instance variables 
	int yearsOfMembership;
	
	/**
	 * 	Overriding the applyDiscount() method in the passenger class
	 *  Applying a 50% discount to the price if the passenger has a membership of more than 5 years.
	 *  Applying a 10% discount if the passenger has a membership as follows;  1 year < membership < 5 years.
	 *  If either are the case, no discount is applied 
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
