//Boat Class
//Anooshka Pendyal

//The Car class is a subclass of Vehicle.
//It has a make attribute (String) and a year (int) attribute,
//Along with having getter, setter, and constructor methods, the class also defines the display() method from the abstract Vehicle class.

public class Car extends Vehicle
{
    //attributes
    private String make;
    private int year;

    //no argument constructor
    public Car()
    {
        super();
        make = "";
        year = 0;
    }

    //parameterized constructor
    public Car(boolean newGas, String newColor, String newMake, int newYear)
    {
        super(newGas, newColor);
        make = newMake;
        year = newYear;
    }

    //getter method for make
    public String getMake()
    {
        return make;
    }

    //getter method for year
    public int getYear()
    {
        return year;
    }

    //setter method for make
    public void setMake(String newMake)
    {
        make = newMake;
    }

    //setter method for year
    public void setYear(int newYear)
    {
        year = newYear;
    }

    //display method prints out what type of vehicle the object is, its color, whether it uses gas, its make, and the year it was made
    public void display()
    {
        System.out.println("The vehicle is a car.");
        System.out.println("The color is " + getColor() + ".");
        //if-else statement in order to clearly output what runsOnGas means
        if (getRunsOnGas() == true)
        {
            System.out.println("The car runs on gas.");
        }
        else
        {
            System.out.println("The car does not run on gas.");
        }
        System.out.println("The make of the car is " + make + ".");
        System.out.println("The year the car was made is " + year + ".");
    }
}