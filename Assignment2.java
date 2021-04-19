//Assignment 2
//Anooshka Pendyal

//First an array the size indicated by the user is created. It is full of vehicles.
//Then, a loop is used to set the attributes of each object in the vehicle array.
//Finally, another loop is used to display all of the attributes using the display() method.

public class Assignment2
{
    public static void main(String [] args)
    {

        //user input on size of vehicleArray
        int numOfVehicles = Input.getInt("How many vehicles would you like to have?");

        //creating vehicle array
        Vehicle [] vehicleArray = new Vehicle[numOfVehicles];

        //loop to set attributes for each object in array
        for (int i = 0; i < numOfVehicles; i++)
        {
            //user input on if the vehicle runs on gas and its color
            Boolean runsOnGas = Input.getBoolean("Does the vehicle run on gasoline? Enter 'true' if it does or 'false' if it doesn't.");
            String color = Input.getString("What is the vehicle's color?");

            //boolean to control loop
            boolean correctTypeInput = false;
            
            //loop to set different vehicle types and verify them
            while (correctTypeInput == false)
            {
                //input on type of vehicle
                char vehicleType = Input.getChar("Enter 'B' if the vehicle is a boat or 'C' if it is a car.");
                //if vehicle is boat
                if (vehicleType == 'B')
                {
                    //input for boat attributes
                    double length = Input.getDouble("What is the boat's length?");
                    double draft = Input.getDouble("What is the boat's draft?");
                    //create boat object in vehicleArray using parameterized constructor
                    vehicleArray[i] = new Boat(runsOnGas, color, length, draft);
                    //break out of loop
                    correctTypeInput = true;
                }
                //if vehicle is car
                else if (vehicleType == 'C')
                {
                    //input for car attributes
                    String make = Input.getString("What is the car's make?");
                    int year = Input.getInt("What is the car's year?");
                    //create car object in vehicleArray using parameterized constructor
                    vehicleArray[i] = new Car(runsOnGas, color, make, year);
                    //break loop
                    correctTypeInput = true;
                }
                else
                {
                    //continue loop
                    System.out.println("Please enter only 'B' or 'C'.");
                }
            }
        }

        //loop to display attributes
        for (int i = 0; i < numOfVehicles; i++)
        {
            vehicleArray[i].display();
            System.out.println();
        }
    }
}