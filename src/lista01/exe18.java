package lista01;

public class exe18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Exercise 18
	static int segundoMaior(int[] numeros) {

		int maior = numeros[0];
		int segundoMaior = numeros[0];

		for (int num : numeros) {
			if (num > maior) {
				segundoMaior = maior;
				maior = num;

			} else if (num > segundoMaior && num != maior) {
				segundoMaior = num;
			}
		}

		return segundoMaior;
	}

}
