package corejava_programs;

public class Assignment_2 {

	public static void main(String[] args) {
		findEvenOdd();
	}

	public static void findEvenOdd() {
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
		}
	}
}
