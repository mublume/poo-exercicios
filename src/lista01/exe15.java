package lista01;

public class exe15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Exercise 15
	static long[] fibonacci(int num) {
		if (num <= 0)
			return new long[0];

		long[] sequencia = new long[num];

		if (num >= 1)
			sequencia[0] = 0;
		if (num >= 2)
			sequencia[1] = 1;

		for (int i = 2; i < num; i++) {
			sequencia[i] = (sequencia[i - 1] + (sequencia[i - 2]));
		}
		return sequencia;
	}

}
