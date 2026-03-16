package lista01;

public class exe19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Exercise 19
	static boolean ehPalindromo(String palavra) {
		String palavraInvertida = new StringBuilder(palavra).reverse().toString();

		if (palavra.equals(palavraInvertida)) {
			return true;
		} else {
			return false;
		}
	}
	// Exercise 20
}
