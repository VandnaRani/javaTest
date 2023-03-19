package corejava_programs;

public class VaraibleSample {
	// Global variable
	public static int a = 100;
	public static int b = 55;

	public static void add() {
		// Local variable
	//	int a = 90;
		int b = 80;
		int c = a + b;
		System.out.println("Add results is: " + c);
	}

	public static void sub() {
		// Local variable
		//int a = 60;
		//int b = 40;
		System.out.println("Sub results =" + (a - b));
	}

	public static void main(String[] args) {
		add();
		sub();
	}

}
