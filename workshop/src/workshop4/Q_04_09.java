package workshop4;

public class Q_04_09 {

	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int sum = 0;
		float avg;		
		
		for (int arr : arr3) {
			arr = (int) (Math.random()*10)+0;
			sum += arr;
		}
		
		avg = sum/arr3.length;
		System.out.println("sum="+sum);
		System.out.println("avg="+String.format("%.1f", avg));
	}

}
