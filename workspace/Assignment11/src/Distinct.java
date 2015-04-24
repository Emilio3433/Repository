import java.util.Scanner;

public class Distinct {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entry = new Scanner(System.in);

		int[] a = new int[10];

		int s = a.length;// set a variable that can modify size

		for (int i = 0; i < a.length; i++) {

			System.out.println("Enter Element " + (i + 1) + ":");// user enters
																	// values
																	// into
																	// elements
			a[i] = entry.nextInt();

		}
		for (int i = 0; i < (s - 1); i++) {
			for (int k = 0; k < s - i - 1; k++) {
				if (a[k] > a[k + 1]) {
					int find = a[k];
					a[k] = a[k + 1];
					a[k + 1] = find;
				}
			}
		}
		System.out.println("Sorted numbers: ");
		for (int k = 0; k < s; k++) {
			System.out.print(a[k] + " "); // printing the values
		}
		System.out.println("\n\n");

		for (int i = 0; i < a.length - 1; i++) {
			for (int k = i + 1; k < a.length; k++) {
				if ((a[i] == (a[k])) && (i != k)) {
					while (i < (s) - 1) {
						a[i] = a[i + 1];// shifting the duplicates
										// to the end
						i++;
					}
					s--;// decrease the size until duplicates at the end do
						// not print

				}

			}
		}
		System.out.println("Distinct numbers: ");

		for (int i = 0; i < s + 1; i++) {
			System.out.print(a[i] + " "); // printing the values
		}
	}
}
