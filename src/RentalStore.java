import java.util.ArrayList;

/**
 Author: Sean Egger, Alec Rulev, Jon Schulberger, Sam LoPiccolo
 Class: CSI-340
 Assignment: Software Specialties Final Assignment: LA Car rental app
 Due Date: 12/7/2017 2:00

 Description:
    A rental store class. Implements the factory method pattern in addCar.

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
public class RentalStore {

    protected CarBuilder carBuilder;
    protected ArrayList<Car> carList;


    public RentalStore() {
        this.carBuilder = new CarBuilder();
    }

    public void addCar(String model)
    {
        if (model.equals("Model A"))
        {
            carBuilder.buildModelA();
        }
        else if (model.equals("Model B"))
        {
            carBuilder.buildModelB();
        }
        else if (model.equals("Model C"))
        {
            carBuilder.buildModelC();
        }
        else {
            System.out.println("Car Model Not found");
        }
    }

    public ArrayList<Car> getCarsList() {
        return carList;
    }

    public Car chooseCar(Car car)
    {
        carList.remove(car);
        return car;
    }
}
