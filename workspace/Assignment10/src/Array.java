import java.util.Scanner;

public class Array {
	static int highest;
	static int lowest;
	static int avg;
	static int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out
				.println("This Program Will Find The Highest,Lowest,Average And The Sum Of The Numbers That You Will Enter.\n");
		System.out.println("How Many Numbers Do You Want To Enter?");
		int sizeOfArray = input.nextInt();
		int k[] = new int[sizeOfArray];

		Array.getValues(k);
		System.out.println("The Highest Number In The Array Is:"
				+ Array.showHighest(k));
		System.out.println("The Lowest Number In The Array Is:"
				+ Array.showLowest(k));
		System.out.println("The Sum Of The Numbers In The Array Is:"
				+ Array.showSum(k));
		System.out.println("The Average Of The Numbers In The Array Is:"
				+ Array.showAverage(k));
	}

	@SuppressWarnings("resource")
	public static void getValues(int Array[]) {
		for (int i = 0; i < Array.length; i++) {
			System.out.print("Enter the value of number " + (i + 1) + " :");
			Scanner input = new Scanner(System.in);
			Array[i] = input.nextInt();
		}
	}

	public static int showHighest(int Array[]) {

		for (int i = 0; i < Array.length; i++) {

			if (highest < Array[i]) {
				highest = Array[i];
			}
		}
		return highest;
	}

	public static int showLowest(int Array[]) {
		lowest = Array[0];
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] < lowest) {
				lowest = Array[i];
			}

		}
		return lowest;
	}

	public static int showSum(int Array[]) {
		for (int i = 0; i < Array.length; i++) {
			sum += Array[i];
		}
		return sum;
	}

	public static int showAverage(int Array[]) {
		avg = sum / Array.length;
		return avg;
	}
}
