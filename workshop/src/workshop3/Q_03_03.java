package workshop3;

public class Q_03_03 {
	public static void main(String[] args) {
//		[ 아래 for문을 while문으로 변경 ]
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		} 
		
		int i = 0;
//		while (i <= 10) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			i++;
//		}
		
		while (i <= 10) {
			int j = 0;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
