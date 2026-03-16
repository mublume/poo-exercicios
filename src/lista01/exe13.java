package lista01;

public class exe13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Exercise 13
	static int contarVogais(String frase) {
		frase = frase.toLowerCase();

		int numVogais = 0;
		String vogais = "aeiou";

		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);

			if (vogais.indexOf(letra) != -1)
				numVogais++;
		}
		return numVogais;
	}

}
