import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {

		int a, b, c;
		int sum, product, average;
		
		System.out.println(" Enter first integer: ");
		Scanner input = new Scanner(System.in);

		a = input.nextInt();

		System.out.println(" Enter second integer:");

		b = input.nextInt();

		System.out.println(" Enter third integer");

		c = input.nextInt();

		System.out.printf("For the numbers " + a + ", " + b + " and " + c
				+ "\n");
		if ((a > b) && (a > c)) {
			System.out.println(" Largest is " + a);
		} else if ((b > a) && (b > c)) {
			System.out.println("Largest is " + b);
		} else if ((c > a) && (c > b)) {
			System.out.println("Largest is " + c);
		}
		if ((a < b) && (a < c)){
			System.out.println("Smallest is " +a);
		} else if ((b < a) && (b < c)) {
			System.out.println("Smallest is " + b);
		} else if ((c < a) && (c < b)) {
			System.out.println("Smallest is " + c + "\n");
		}
		
		sum = a + b + c;
		System.out.println("Sum is " +sum);
		
		product = a * b * c; 
		System.out.println("Product is " +product);
		
		average = (a + b + c) / 3 ;
		System.out.println("Average is " +average);
	}

}
