package lista01;

public class exe08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Exercise 8
	static int potencia(int base, int expoente) {
		int resultado = 1;

		for (int i = 0; i < expoente; i++) {
			resultado = resultado * base;
		}
		return resultado;
	}

}
