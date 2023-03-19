package corejava_programs;

public class FindLargeNumber {

	public static void main(String[] args) {
		int a = 500;
		int b = 600;
		int c = 100;

		// Verify two number which one is small/large
		if (a > b) {
			System.out.println("A is the large value");
		} else if (b > a) {
			System.out.println("B is the large value");
		} else {
			System.out.println("All are equal");
		}
		System.out.println("******************");

		// &&
		if (a > b && a > c) {
			System.out.println("A is the large value");
		} else if (b > a && b > c) {
			System.out.println("B is the large value");
		} else if (c > a && c > b) {
			System.out.println("C is the large value");
		} else {
			System.out.println("All are equal");
		}
	}

}
