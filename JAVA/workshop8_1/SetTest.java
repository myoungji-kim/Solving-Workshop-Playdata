package workshop8_1;

import java.util.Arrays;
import java.util.HashSet;

public class SetTest {
	public static void main(String args[]) {
		String str = args[0];
		char chars[] = str.toCharArray();
		HashSet <Character> set1 = new HashSet<Character>();
		
		for (char i : chars) {
			set1.add(i);
		}
		
		System.out.println(set1);
	}
}
