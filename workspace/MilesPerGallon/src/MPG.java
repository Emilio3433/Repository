import java.util.Scanner;


public class MPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double milesDriven ;
double gallonsUsed ;
Scanner input = new Scanner(System.in);

System.out.println("Enter the miles driven:");
milesDriven = input.nextDouble();
System.out.println("Enter the gallons of fuel used:");
gallonsUsed = input.nextDouble();

double total = milesDriven / gallonsUsed ;
System.out.println("The miles per gallon is " + total);

	}

}
