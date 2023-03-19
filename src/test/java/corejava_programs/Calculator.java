package corejava_programs;

public class Calculator {
	// Method: add() method implementation
	public static void add() {
		int a = 90;
		int b = 80;
		int c = a + b;
		System.out.println("Add results is: " + c);
	}
	public static void add(int a, int b) {	
		int c = a + b;
		System.out.println("Add results is: " + c);
	}

	public static void sub() {
		int a = 232;
		int b = 45;
		System.out.println("Sub results =" + (a - b));
	}

	public static void main(String[] args) {
		System.out.println("I am Main Method");
		//Call outside method into Main method
		add();
		sub();	
		add(45,20);
		add(30,69);
		add(98,02);
	}

}
