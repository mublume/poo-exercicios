package lista01;

public class exe16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Exercise 16
	static int[] ordenarArray(int[] numeros) {
		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = 0; j < numeros.length - 1 - i; j++) {
				if (numeros[j] > numeros[j + 1]) {
					int temporario = numeros[j];

					numeros[j] = numeros[j + 1];
					numeros[j + 1] = temporario;
				}
			}
		}
		return numeros;
	}

}
