import java.util.Scanner;
import static java.util.concurrent.TimeUnit.NANOSECONDS;
import java.math.BigDecimal;

public class FindPI {

	public static void main(String[] args) {
		double a = 0;
		double iterations;
		double userIterations;
		long start;
		long end;
		
		BigDecimal.valueOf(a);

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount of iterations to find PI:");
		userIterations = input.nextDouble();

		start = System.nanoTime();
		for (iterations = 0; iterations < userIterations; iterations++) {
			a += Math.pow(-1, iterations) / ((2 * iterations) + 1);
		}

		a = a * 4;
		end = System.nanoTime();

		long totalTime = end - start;

		System.out.println(BigDecimal.valueOf(a) + " " + "\nIt took "
				+ (double) NANOSECONDS.toMillis(totalTime) / 1000
				+ " seconds to complete this operation.");

	}

}
