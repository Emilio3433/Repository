import java.util.Scanner;


public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, result;
		String choice;
		Scanner input= new Scanner(System.in);
		
		do{
			
			System.out.println("Enter your first number to multiply:");
			num1 = input.nextDouble();
			
			System.out.println("Enter your Second Number to multiply:");
			num2 = input.nextDouble();
			
			
			result= num1*num2;
			System.out.printf(num1 + " times " +num2+ " equals " +result);
			System.out.printf(" To multiply again n (Y/N:)");
			choice = input.next();
			
			if(choice == "n")
			{
				choice= "N";
			}
		
		
		} while (choice !="N"); 
	}
		
			
	

}
