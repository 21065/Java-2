
/*
 File Name:Building.java
  Author: Younes J
   Date: Apr 10, 2021 8:23:46 PM
Description:  This will be our parent class
*/
public abstract class Building
{
	private String type;
	private double length;
	private double width;
	private int numFloors;
	
// contructor
	public Building (String type, double length, double width, int numFloors)
	{
		this.type=type;
		this.width=width;
		this.length=length;
		this.numFloors=numFloors;
	}
	
//accessor and mutator methods
	
	public String getType()
	{
		return this.type;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public int getNumFloors()
	{
		return this.numFloors;
	}
	
	public void setWidth(double w)
	{
		this.width = w;
	}
	
	public void setLength(double l)
	{
		this.length = l;
	}
	
	public void setNumFloors(int n)
	{
		this.numFloors = n;
	}
	
	
	/**
	 *   Method name:  getArea
	 *       Purpose:  to describe the area of a building
	 *       Accepts:  Nothing
	 *       returns:  double;
	 */
	
	public  double getArea()
	{
		double area =  (width * length) * numFloors;
		return Math.round(area * 10.0) / 10.0; // round to one decimal place
	}
	
	/**
	 *   Method name:  getBuildingDetails
	 *       Purpose:  to describe the building details
	 *       Accepts:  Nothing
	 *       returns:  Nothing
	 */
	
	public abstract void getBuildingDetails();
	
		
	

}
