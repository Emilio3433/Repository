public class MyInteger {

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isOdd(int num) {
		if (num % 2 != 0) {
			return true;
		} else
			return false;
	}

	public static boolean isPrime(int num) {
		for (int count = 2; count < num; count++) {
			if (num % count == 0) {
				return false;
			}
		}
		return true;
	}

}
