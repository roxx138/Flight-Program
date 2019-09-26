package coe528.lab1;

public class nonMember extends passenger
{

	// Constructor
	public nonMember(String name, int age) 
	{
		super(name, age);
	}

	/**
	 * 	Overriding the applyDiscount() method in the passenger class
	 *  Applying a 10% discount if the age of the passenger is greater than 65,
	 *  otherwise no discount will be applied
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
