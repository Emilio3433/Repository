import java.util.Random;
import java.util.Scanner;

public class PaperRockScissors {

	public static void main(String[] args) {

		int player1;
		int player2;

		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("scissors (0), rock (1), paper (2):");

		player2 = generator.nextInt(3) + 1;
		player1 = input.nextInt();

		if (player1 == 0) {
			switch (player2) {

			case 0:
				System.out.println("Tie");
				break;
			case 1:
				System.out.println("You Lost:rock beats scissors");
				break;
			case 2:
				System.out.println("You Won: scissors beats paper");
				break;

			}// end switch
		} else if (player1 == 1) {
			switch (player2) {
			case 0:
				System.out.println("You Won: rock beats scissors");
				break;
			case 1:
				System.out.println("tie");
				break;
			case 2:
				System.out.println("You Lost: paper beats rock");
				break;

			}// end switch
		} else if (player1 == 2) {
			switch (player2) {
			case 0:
				System.out.println("You Lost: scissors beats paper");
				break;
			case 1:
				System.out.println("You Won: scissors beats paper");
				break;
			case 2:
				System.out.println("Tie");
				break;
			}// end switch

		}
	}
}
