package corejava_programs;

public class Assignment_1 {

	public static void main(String[] args) {
		checkage();
	}

	public static void checkage() {
		int age = 10;
		if (age > 59 && age <= 100) {
			System.out.println("senior citizen");
		} else if (age > 0 && age <= 2) {
			System.out.println("infant");
		} else if (age > 2 && age <= 12) {
			System.out.println("child");
		} else if (age > 12 && age <= 25) {
			System.out.println("youth");
		} else if (age > 25 && age <= 59) {
			System.out.println("adult");
		} else {
			System.out.println("Please enter Age in b/w 1 to 100 only");
		}
	}

}
