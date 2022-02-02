
/*
 File Name:Warehouse.java
  Author: Younes J
   Date: Apr 10, 2021 10:29:01 PM
Description:  This class inherits from Building 
*/
public class Warehouse extends Building
{
	private double percentStorage;
	private int numRooms;
	
//The 5-arg constructor is used when you instantiate a new Warehouse.  
	public Warehouse(double length,double width, int numFloors,double pStorage,int rooms)
	{
		super("Warehouse",length, width,numFloors );
		this.percentStorage=pStorage;
		this.numRooms=rooms;
	}
	
//The 6-arg constructor comes into play when you create a sub class object to the warehouse.	
	public Warehouse(String type,double length, double width, int numFloors,double pStorage, int rooms)
	{
		super(type,length, width,numFloors );
		this.percentStorage=pStorage;
		this.numRooms=rooms;
	}
	
//accessor and mutator methods
	
	public double getPercentStorage()
	{
		return this.percentStorage;
	}
	
	public int getRooms()
	{
		return this.numRooms;
	}
	
	public void setPercentStorage(double pStorage )
	{
		this.percentStorage = pStorage;
	}
	
	public void setNumRooms(int rooms)
	{
		this.numRooms=rooms;
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
		System.out.println("Number of Rooms: " + this.numRooms + " rooms with storage accounting for " + this.percentStorage +" percent of the space.");
		System.out.println();
	}

}
