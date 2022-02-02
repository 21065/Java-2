
/*
 File Name:Apartment.java
  Author: Younes J
   Date: Apr 11, 2021 1:14:33 AM
Description:   This class inherits from RowHouse
*/
public class Apartment extends RowHouse
{
	private int numLevels;
	private int parkingSpaces;
	
//The7-arg constructor is used to create a Apartment object.
	
	public Apartment(double length, double width , int floors, int unit, int beds, int baths, int level, int parking)
	{
		super("Apartment",length, width, floors, unit, beds, baths);
		this.numLevels= level;
		this.parkingSpaces=level*unit;
		
	}

//accessor and mutator methods
	
	public int getNumLevels()
	{
		return this.numLevels;
	}
	
	public int getParkingSpaces()
	{
		return this.parkingSpaces;
	}

	public void setNumLevels(int level)
	{
		this.numLevels= level;
	}
	
	public void setNumParkingSpaces(int spaces)
	{
		this.parkingSpaces= spaces;
	}
	
	 /**
	 *   Method name:  getBuildingDetails
	 *       Purpose:  to describe the building details
	 *       Accepts:  Nothing
	 *       returns:  Nothing
	 */
	
	public void getBuildingDetails()
	{
		System.out.println("Bulding Type: " + this.getType()+" which has " + this.getNumUnits() + " on one level.");
		System.out.println("Unit Area: " + this.getArea() + " square feet on " + this.getNumFloors() + " floor(s)." );
		System.out.println("Number of bedrooms: " + this.getNumBeds()+"." + "Number of bathrooms: "+ this.getNumBaths()+".");
		System.out.println("This Apartment building has "+ this.numLevels + "for a total number of "+ this.getNumUnits() + ".");
		System.out.println("This complex has " + this.parkingSpaces + " parking spaces available.");
		System.out.println();
	}
}
