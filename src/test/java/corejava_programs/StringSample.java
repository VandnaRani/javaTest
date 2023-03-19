package corejava_programs;

public class StringSample {

	public static void main(String[] args) {
		int a = 90;
		double b = 45654.56;
		char c = 'r';
		boolean d = true;
		String f = "Hi All, My Mobile Num: +-9728908819";
		System.out.println(f);

		String e = "Welcome to CoreJAVA";
		System.out.println(e);

		// Uppercase
		System.out.println(e.toUpperCase());
		System.out.println(e.toLowerCase());
		// Length
		String h = "Hi All";
		System.out.println(h.length());

		// Index: Get the 3rd index character
		// to get char from String, will use charAt(index)
		System.out.println(h.charAt(0));

		String i = "Apple";
		String j = "appLe";
		// String j = "Mango";
		// Check two Strings are equal or not?
		if (i.equals(j)) {
			System.out.println("Both are matching");
		} else {
			System.out.println("Both are not matching");
		}
		// equalsIgnoreCase(): While compare two strings, it will ignoring case
		// considerations
		if (i.equalsIgnoreCase(j)) {
			System.out.println("Both are matching**");
		} else {
			System.out.println("Both are not matching**");
		}
		// Contains()
		// Check the given word/ statement /char is available in a String or not?
		String k = "Swapnika is living in USA";
		// Find USA word is there?
		if (k.contains("Swapnika is living in USA")) {
			System.out.println("Given word is available in a String ");
		} else {
			System.out.println("Given word is NOT available in a String ");
		}
		
		

	}

}
