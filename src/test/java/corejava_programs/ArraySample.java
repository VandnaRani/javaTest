package corejava_programs;

public class ArraySample {

	public static void main(String[] args) {
		int a = 90;
		double b = 45654.56;
		char c = 'r';
		boolean d = false;
		String e = "Hi All, My Mobile Num: +-9728908819";

		int[] g = { 3243, 432, 985, 4, 324, 23, 545, 232453, 9 };
		System.out.println(g.length);

		String f[] = { "Hi", "How", "are", "you" };
		System.out.println("Array Lenth is: " + f.length);
		// f[index]
		System.out.println(f[0]);
		System.out.println("*******************************");
		// Print all array values using FOR loop / ForEach loop
		for (int i = 0; i < g.length; i++) {
			System.out.println(g[i]);
		}
		System.out.println("##############################");

		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);

		}
		
		
	}

}
