// COLLABORATORS: <tutors, instructor, or anyone else who helped you>

// DESCRIPTION: <a sentence about what the purpose of this program is>

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
    dimesQuantityOne = (remainder/penniesInDime);
    remainder %= penniesInDime;
    nickelsQuantityOne = (remainder/penniesInNickel);
    remainder %= penniesInNickel;
    penniesQuantityOne = remainder/penny;

    remainder = (int)(quantityTwo*100); //Calclulation to convert quantityOne into amount of pennies

    quartersQuantityTwo = (remainder/penniesInQuarter);
    remainder %= penniesInQuarter;
    dimesQuantityTwo = (remainder/penniesInDime);
    remainder %= penniesInDime;
    nickelsQuantityTwo = (remainder/penniesInNickel);
    remainder %= penniesInNickel;
    penniesQuantityTwo = remainder/penny;

    //OUTPUT SECTION

    System.out.println(); //Clean Output

    System.out.printf("$%3.2f can be converted to %d quaters, %d dimes, %d nickels, and %d pennies.%n", 
    quantityOne, quartersQuantityOne, dimesQuantityOne, nickelsQuantityOne, penniesQuantityOne);

    System.out.printf("$%3.2f can be converted to %d quaters, %d dimes, %d nickels, and %d pennies.%n", 
    quantityTwo, quartersQuantityTwo, dimesQuantityTwo, nickelsQuantityTwo, penniesQuantityTwo);

    System.out.println(); //Clean Output
  }

}
