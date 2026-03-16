package lista01;

public class exe12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Exercise 12
	static int inverterNumero(int num) {
		int invertido = 0;
		while (num != 0) {
			int algarismo = num % 10;
			invertido = invertido * 10 + algarismo;
			num = num / 10;
		}
		return invertido;
	}

}
