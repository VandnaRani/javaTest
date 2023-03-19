package corejava_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Javalearn {

	public static void main(String[] args) {
		String A = "Hi all how are you how many years of exp you have?";
		Set seen = new HashSet();
		for(int i=0;i<A.length();i++) {
			if(seen.add(A.charAt(i))) {
				System.out.println("test at "+A.charAt(i));
			}
			}
			char[]AcharArray = A.toCharArray();
			Arrays.sort(AcharArray);
			for(int i=1;i<AcharArray.length;i++) {
				if(AcharArray[i]==AcharArray[i-1]) {
					System.out.println("test at "+AcharArray[i]);
				}
					
				}
				
			}
			
			}

	


