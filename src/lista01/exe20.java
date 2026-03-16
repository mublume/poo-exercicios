package lista01;

public class exe20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int mdc(int a, int b) {
		if (b == 0) {
			return a;
		}
		return mdc(b, a % b);
	}

}
