// COLLABORATORS: <Mr. Tragamila and Ms. Walke class videos>

// DESCRIPTION: <Program to compute the coin equivalent of any given dollar amount, with quarters being maximized>

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
    double quantityOne = 1.68; //First Qunatity $1.68
    double quantityTwo = 3.80; //Second Quantity $3.80

    int quartersQuantityOne, nickelsQuantityOne, dimesQuantityOne, penniesQuantityOne;
    int quartersQuantityTwo, nickelsQuantityTwo, dimesQuantityTwo, penniesQuantityTwo;

    int penniesInQuarter = 25, penniesInDime = 10, penniesInNickel = 5, penny = 1; //Variables represeint amount of Pennies in each coin
    int remainder; //Variable used to store the number of pennies for each quantity before and after each iteration

    //CALCULATION SECTION

    remainder = (int)(quantityOne*100); //Calclulation to convert quantityOne into amount of pennies

    quartersQuantityOne = (remainder/penniesInQuarter);
    remainder %= penniesInQuarter;
    dimesQuantityOne = (remainder/penniesInDime); //Max Dimes is 2
    remainder %= penniesInDime;
    nickelsQuantityOne = (remainder/penniesInNickel); //Max Nickels is 1
    remainder %= penniesInNickel;
    penniesQuantityOne = remainder/penny; //Max Pennies is 4

    remainder = (int)(quantityTwo*100); //Calclulation to convert quantityOne into amount of pennies

    quartersQuantityTwo = (remainder/penniesInQuarter);
    remainder %= penniesInQuarter;
    dimesQuantityTwo = (remainder/penniesInDime); //Max Dimes is 2
    remainder %= penniesInDime;
    nickelsQuantityTwo = (remainder/penniesInNickel); //Max Nickels is 1
    remainder %= penniesInNickel;
    penniesQuantityTwo = remainder/penny; //Max Pennies is 4

    //OUTPUT SECTION

    //System.out.println(); //Clean Output

    System.out.printf("$%3.2f can be converted to %2d quaters, %2d dimes, %2d nickels, and %2d pennies.%n", 
    quantityOne, quartersQuantityOne, dimesQuantityOne, nickelsQuantityOne, penniesQuantityOne);

    System.out.printf("$%3.2f can be converted to %2d quaters, %2d dimes, %2d nickels, and %2d pennies.%n", 
    quantityTwo, quartersQuantityTwo, dimesQuantityTwo, nickelsQuantityTwo, penniesQuantityTwo);

    //System.out.println(); //Clean Output
  }

}
