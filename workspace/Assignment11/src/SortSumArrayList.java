import java.util.ArrayList;
import java.util.Scanner;

public class SortSumArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array1 = new ArrayList<>();
		int[] array = new int[5];

		@SuppressWarnings("resource")
		Scanner entry = new Scanner(System.in);
		int num = 0;
		for (int i = 0; i < array.length; i++) {

			System.out.println("Enter A Number " + (i+1) + ":");
			num = entry.nextInt();
			array1.add(num);
		}
		System.out.println(array1);
		array1.sort(null);
		System.out.println(array1);
		System.out.println(sum(array1));

	}

	public static int sum(@SuppressWarnings("rawtypes") ArrayList sort) {

		int j = 0;
		for (int i = 0; i < sort.size(); i++) {
			j += (int) sort.get(i);
		}
		return j;

	}

}
