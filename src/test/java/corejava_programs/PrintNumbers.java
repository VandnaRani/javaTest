package corejava_programs;

public class PrintNumbers {

	public static void main(String[] args) {
		// Print 1 to 10 number
		// FOR(initialize the Variable; Condition;increment/decrement){}

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		} // For loop end

		System.out.println("************************");
		// Print a to z alphabets
		// A:65 Z : 90
		for (char abc = 'a'; abc <='z'; abc++) {
			System.out.print(abc);
		}
		System.out.println(" ");

		for (char abc = 'A'; abc <='Z'; abc++) {
			System.out.print(abc);
		}


	}

}
