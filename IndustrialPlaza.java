
/*
 File Name:IndustrialPlaza.java
  Author: Younes J
   Date: Apr 10, 2021 11:02:04 PM
Description:  This class inherits from Warehouse
*/
public class IndustrialPlaza extends Warehouse
{
	private int numUnits;
	private String usage;
	
// Constructor
	
	public IndustrialPlaza(double length, double width, int numFloors , double pStorage, int rooms, int units, String usage)
	{
		super("IndustrialPlaza", length,  width,  numFloors, pStorage,  rooms);
		this.numUnits = units;
		this.usage = usage;
	}
	
//accessor and mutator methods
	
	public int getNumUnits()
	{
		return this.numUnits;
	}
	
	public String getUsage()
	{
		return this.usage;
	}
	
	public void setNumUnits(int units)
	{
		this.numUnits = units;
	}
	
	public void setUsage( String usage)
	{
		this.usage = usage;
	}
	
	/**
	 *   Method name:  getBuildingDetails
	 *       Purpose:  to describe the building details
	 *       Accepts:  Nothing
	 *       returns:  Nothing
	 */
	
	public void getBuildingDetails()
	{
		System.out.println("Bulding Type: " + this.getType()+".");
		System.out.println("Unit Area: " + this.getArea() + " square feet on " + this.getNumFloors() + " floor(s)." );
		System.out.println("Number of Rooms in each unit: " + this.getRooms() + " rooms with storage accounting for" + this.getPercentStorage() + " percent of the space.");
		System.out.println("We have "+ this.numUnits + " units with a combined total area of " +this.getArea()*this.numUnits+ " square feet." );
		System.out.println(this.usage);
		System.out.println();
		
	}
}
