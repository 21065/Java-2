
/*
 File Name:RowHouse.java
  Author: Younes J
   Date: Apr 11, 2021 12:56:23 AM
Description:  This class inherits from Building
*/
public class RowHouse extends Building
{
	private int numUnits;
	private int numBeds;
	private int numBaths;
	
	//The 6-arg constructor  is used to create a RowHouse object.
	public RowHouse(double length,double width, int floors, int unit, int beds, int baths )
	{
		super("RowHouse", length, width, floors);
		this.numUnits= unit;
		this.numBeds = beds;
		this.numBaths= baths;		
	}
	
//The 7-arg constructor is called by the RowHouse’s direct subclass.
	public RowHouse(String type,double length,double width, int floors, int unit, int beds, int baths)
	{
		super(type, length, width, floors);
		this.numUnits= unit;
		this.numBeds = beds;
		this.numBaths= baths;	
	}
	
//accessor and mutator methods
	 public int getNumUnits()
	 {
		 return this.numUnits;
	 }
	 
	 public int getNumBeds()
	 {
		 return this.numBeds;
	 }
	 
	 public int getNumBaths()
	 {
		 return this.numBaths;
	 }
	 
	 public void setNumUnits(int units)
	 {
		 this.numUnits = units;
	 }
	 
	 public void setNumBeds(int beds)
	 {
		 this.numBeds=beds;
	 }
	 
	 public void setNumBaths(int baths)
	 {
		 this.numBaths=baths;
	 }
	 
	 /**
		 *   Method name:  getBuildingDetails
		 *       Purpose:  to describe the building details
		 *       Accepts:  Nothing
		 *       returns:  Nothing
		 */
		
		public void getBuildingDetails()
		{
			System.out.println("Bulding Type: " + this.getType()+" which has " + this.numUnits + " on one level.");
			System.out.println("Unit Area: " + this.getArea() + " square feet on " + this.getNumFloors() + " floor(s)." );
			System.out.println("Total area of all units on one floor is "+ " square feet.");
			System.out.println("Number of bedrooms: "+ this.numBeds +"."+ "Number of bathrooms: "+ this.numBaths + ".");
			System.out.println();
		}

}
