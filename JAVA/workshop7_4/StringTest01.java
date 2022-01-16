package workshop7_4;

import java.util.StringTokenizer;

public class StringTest01 {
	public static void main(String[] args) {
		int countStr = 0;
		String str = "I am second to none";
		StringTokenizer strTk = new StringTokenizer(str, " ");
		char charArr[] = str.toCharArray();
		
		for (int i=0; i<charArr.length; i++) {
			if (charArr[i] != ' ') {
				System.out.print(charArr[i] + " ");
				countStr++;
			}
		}
		
		System.out.println("문자개수 : " + countStr);
		
		int countWord = 0;
		
		while (strTk.hasMoreTokens()) {
			countWord ++;
			System.out.print(strTk.nextToken()+" ");
		}
		
		System.out.println("단어개수 : " + countWord);
	}
}
