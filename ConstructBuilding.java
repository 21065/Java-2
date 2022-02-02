
/*
 File Name:ConstructBuilding.java
  Author: Younes J
   Date: Apr 11, 2021 1:30:28 AM
Description:  This class will use inheritance  while we create a number of objects
*/
public class ConstructBuilding
{

	public static void main(String[] args)
	{
		
		Warehouse myWareHouse = new Warehouse(130.3,67.2,3,76.5,5);
		IndustrialPlaza myIndustrialPlaza = new IndustrialPlaza(125.7,50.2,2,82.5,4,16,"This Industrial Plaza is designated for manufacturing only.");
		RowHouse myRowHouse = new RowHouse( 23.5,20.3,3,7,3,2);
		Apartment myApartment= new Apartment(23.0,28.0 ,3,16,2,1,3,19);
		
		Building [] myBuilding = new Building[4];
		myBuilding[0] = myWareHouse;
		myBuilding[1] = myIndustrialPlaza;
		myBuilding[2] = myRowHouse;
		myBuilding[3] = myApartment;
		
		System.out.println("                           My Building Empire");
		System.out.println("                           ******************");
		
		for(int index  = 0; index < myBuilding.length; index ++)
		{
			myBuilding[index].getBuildingDetails();
		}
		
//Mutating the Apartment object
		myApartment.setLength(50);
		myApartment.setWidth(55);
		myApartment.setNumFloors(2);
		myApartment.setNumBaths(1);
		myApartment.setNumBeds(1);
		myApartment.setNumLevels(25);
		myApartment.setNumUnits(18);
		myApartment.setNumParkingSpaces(528);
	//Print details after mutating
		System.out.println("Mutating the Apartment object:");
		System.out.println();
		
		myApartment.getBuildingDetails();
		
		////////////Analyzing each element of each building
		System.out.println();
		System.out.println("Analyzing each element of each building");
		System.out.println();
		

		
		System.out.println("Type of building: " + myWareHouse.getType());
		System.out.println("Unit length: " + myWareHouse.getLength());
		System.out.println("Unit width: " + myWareHouse.getWidth());
		System.out.println("Number of floors: " + myWareHouse.getNumFloors());
		System.out.println("Area of this unit: " + myWareHouse.getArea());
		System.out.println("Number of rooms in this unit:  " + myWareHouse.getRooms());
		System.out.println("Storage space in this unit:  " + myWareHouse.getPercentStorage());
		System.out.println();
		
		System.out.println("Type of building: " + myIndustrialPlaza.getType());
		System.out.println("Unit length: " + myIndustrialPlaza.getLength());
		System.out.println("Unit width: " + myIndustrialPlaza.getWidth());
		System.out.println("Number of floors in each unit: " + myIndustrialPlaza.getNumFloors());
		System.out.println("Area of each unit: " + myIndustrialPlaza.getArea());
		System.out.println("Number of rooms in each unit: " + myIndustrialPlaza.getRooms());
		System.out.println("Storage space in each unit: " + myIndustrialPlaza.getPercentStorage());
		System.out.println("Number of units in this industrial plaza:  " + myIndustrialPlaza.getNumUnits());
		System.out.println(myIndustrialPlaza.getUsage());
		System.out.println();
		
		System.out.println("Type of building: " + myRowHouse.getType());
		System.out.println("Unit length: " + myRowHouse.getLength());
		System.out.println("Unit width: " + myRowHouse.getWidth());
		System.out.println("Number of floors in each unit: " + myRowHouse.getNumFloors());
		System.out.println("Area of each unit: " + myRowHouse.getArea());
		System.out.println("Number of bathrooms in each unit: " + myRowHouse.getNumBaths());
		System.out.println("Number of bedrooms in each unit: " + myRowHouse.getNumBeds());
		System.out.println("Number of units: " + myRowHouse.getNumUnits());
		System.out.println();
		
		System.out.println("Type of building: " + myApartment.getType());
		System.out.println("Unit length: " + myApartment.getLength());
		System.out.println("Unit width: " + myApartment.getWidth());
		System.out.println("Number of floors in each unit: " + myApartment.getNumFloors());
		System.out.println("Area of each unit: " + myApartment.getArea());
		System.out.println("Number of bathrooms in each unit: " + myApartment.getNumBaths());
		System.out.println("Number of bedrooms in each unit: " + myApartment.getNumBeds());
		System.out.println("Number of units on each level " + myApartment.getNumUnits());
		System.out.println("Number of levels in this apartment building: " + myApartment.getNumLevels());
		System.out.println("Number of parking spaces available: " + myApartment.getParkingSpaces());
		System.out.println();


	}

}
