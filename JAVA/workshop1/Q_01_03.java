package workshop1;

public class Q_01_03 {
	public static void main(String[] args) {
		int n = 10;
		int n2 = 20;
		int temp;
		
		temp = n2;
		n2 = n;
		n = temp;
		
		System.out.println("nę°ė " + n);
		System.out.println("n2ę°ė " + n2);
	}
}
