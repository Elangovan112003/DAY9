public class Main {
	static int i = 1;

	static void OUT() {
		System.out.print(i++ + " ");
	}

	static void LEVEL() {
		OUT(); OUT(); OUT(); OUT(); OUT(); OUT(); OUT(); OUT(); OUT(); OUT();
	}

	static void PRINT() {
	
		LEVEL(); LEVEL(); LEVEL(); LEVEL(); LEVEL(); LEVEL(); LEVEL(); LEVEL(); LEVEL(); LEVEL();
	}

	public static void main(String[] args) {
		PRINT();
	}
}
