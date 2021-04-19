//Vehicle Class
//Anooshka Pendyal

//The Vehicle class is abstract.
//It has a two attributes, runsOnGas (boolean) and color (String).
//Getter, setter, and constructor methods are defined for the attributes.
//An abstract method named display() is declared. It will be used in the subclasses to display vehicles and their attributes. 

public abstract class Vehicle
{
    //attributes
    private boolean runsOnGas;
    private String color;

    //no argument constructor
    public Vehicle()
    {
        runsOnGas = true;
        color = "white";
    }

    //parameterized constructor
    public Vehicle(boolean newGas, String newColor)
    {
        runsOnGas = newGas;
        color = newColor;
    }

    //getter method for runsOnGas attribute
    public boolean getRunsOnGas()
    {
        return runsOnGas;
    }

    //getter method for color attribute
    public String getColor()
    {
        return color;
    }

    //setter method for runsOnGas attribute
    public void setRunsOnGas(boolean newGas)
    {
        runsOnGas = newGas;
    }

    //setter method for color attribute
    public void setColor(String newColor)
    {
        color = newColor;
    }

    //abstract method that will be defined in subclasses
    public abstract void display();
}