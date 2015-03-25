import java.util.Scanner;

public class TestInteger {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;

		Scanner userNum = new Scanner(System.in);
		System.out.println("please enter an integer:");
		num = userNum.nextInt();

		System.out.println("isEven: " + MyInteger.isEven(num));
		System.out.println("isOdd: " + MyInteger.isOdd(num));
		System.out.println("isPrime: " + MyInteger.isPrime(num));

	}

}
