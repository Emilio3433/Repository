import java.util.Scanner;

public class Lottery {
	static int c = 0;

	public static void main(String[] args) {

		int[] lottery = new int[5];
		int[] user = new int[5];
		int rand;
		System.out
				.println("Welcome To The Lottery Game I Have Created, Good Luck !");
		System.out.println("ONLY RULE: Number Must Be Between 0 & 9!!!!!!!");
		System.out.println("[Enter a series of 5 numbers ]\n");
		getValues(user);

		for (int i = 0; i < 5; i++) {
			rand = (int) (Math.random() * 9); // Random Number Generator (0-9)
			for (int x = 0; x < i; x++) {
				if (lottery[i] == rand) {
					rand = (int) (Math.random() * 9);
				}

			}
			lottery[i] = rand;
		}

		System.out.println("The Winning Lottery Numbers Were:");
		System.out.println("-----------------------------------");
		for (int i = 0; i < lottery.length; i++)
			System.out.print(lottery[i] + " ");

		System.out.println("\nThe Numbers You Entered Were:");
		System.out.println("-----------------------------------");
		for (int i = 0; i < user.length; i++) {
			System.out.print(user[i] + " ");
		}

		System.out.println("\nThe Numbers You Matched Were:");
		System.out.println("-----------------------------------");
		compareNumbers(user, lottery);
		if (c == 5) {
			System.out.println("YOU WIN");
		}
		System.out.println("\nYou Matched " + c + " Numbers");

	}

	public static void getValues(int[] user) {// obtain numbers from user
		for (int i = 0; i < user.length; i++) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.print("Enter number " + (i + 1) + ":");

			user[i] = input.nextInt();
			if (user[i] > 9 || user[i] < 0) {
				System.out.println("Stay Inside The Limit! BETWEEN 0-9"); // Warn
																			// the
																			// user
																			// to
																			// stay
																			// inside
																			// the
																			// number
																			// limit
				i--;
			}
		}
	}

	public static void compareNumbers(int[] user, int[] lotteryNums) {// compare
																		// user's
																		// to
																		// the
																		// lottery
																		// numbers

		int i = 0, j = 0;

		while (i < user.length && j < user.length) {

			if (lotteryNums[j] == user[i]) {

				c++;
				System.out.print(user[i] + " ");

			}

			i++;
			j++;

		}
	}

}