package workshop7_3;

import java.util.StringTokenizer;

public class StringTokenTest {
	public static void main(String[] args) {
		int sum = 0;
		String str = "4,2,3,6,7";
		StringTokenizer strTk = new StringTokenizer(str, ",");
		while(strTk.hasMoreTokens()) {
			sum += Integer.parseInt(strTk.nextToken());
		}
		System.out.println(sum);
	}
}
