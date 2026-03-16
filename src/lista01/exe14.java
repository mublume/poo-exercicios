package lista01;

public class exe14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Exercise 14
	static boolean ehPrimo(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i < (num - 1); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
