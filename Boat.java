//Boat Class
//Anooshka Pendyal

//The Boat class is a subclass of Vehicle.
//It has a length attribute and a draft attribute (how far below the surface the bottom of the boat is), which are both type double
//Along with having getter, setter, and constructor methods, the class also defines the display() method from the abstract Vehicle class.

public class Boat extends Vehicle
{
    //attributes
    private double length;
    private double draft;

    //no argument constructor
    public Boat()
    {
        super();
        length = 0;
        draft = 0;
    }

    //parameterized constructor
    public Boat(boolean newGas, String newColor, double newLength, double newDraft)
    {
        super(newGas, newColor);
        length = newLength;
        draft = newDraft;
    }

    //getter method for length
    public double getLength()
    {
        return length;
    }

    //getter method for draft
    public double getDraft()
    {
        return draft;
    }

    //setter method for length
    public void setLength(double newLength)
    {
        length = newLength;
    }

    //setter method for draft
    public void setDraft(double newDraft)
    {
        draft = newDraft;
    }

    //display method prints out what type of vehicle the object is, its color, whether ir runs on gas, its length, and its draft
    public void display()
    {
        System.out.println("The vehicle is a boat.");
        System.out.println("The color is " + getColor() + ".");
        //if-else statement in order to clearly output what runsOnGas means
        if (getRunsOnGas() == true)
        {
            System.out.println("The boat runs on gas.");
        }
        else
        {
            System.out.println("The boat does not run on gas.");
        }
        System.out.println("The length of the boat is " + length + " feet.");
        System.out.println("The draft of the boat is " + draft + " feet.");
    }
}