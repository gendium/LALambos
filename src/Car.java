/**
 Author: Sean Egger, Alec Rulev, Jon Schulberger, Sam LoPiccolo
 Class: CSI-340
 Assignment: Software Specialties Final Assignment: LA Car rental app
 Due Date: 12/7/2017 2:00

 Description:
 A concrete car class

 Certification of Authenticity:
 I certify that this is entirely my own work, except where I have given
 fully-documented references to the work of others. I understand the definition
 and consequences of plagiarism and acknowledge that the assessor of this
 assignment may, for the purpose of assessing this assignment:
 - Reproduce this assignment and provide a copy to another member of academic
 - staff; and/or Communicate a copy of this assignment to a plagiarism checking
 - service (which may then retain a copy of this assignment on its database for
 - the purpose of future plagiarism checking)
 */
public class Car implements CarDecorator {
	   boolean hubCaps;
	   float priceMult;
	   float dailyPrice = 1500.00f;
	   float addedPrice = 0;
	@Override
	public void getPrice() {
		System.out.println("Provided Car Price is: " + (dailyPrice*priceMult) + "added price: " + addedPrice);
	}
}
