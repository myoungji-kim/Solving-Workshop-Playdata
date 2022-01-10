package workshop2;

public class Q_02_14 {
	public static void main(String[] args) {
		String mesg = "100/200";
		String[] mesgList = mesg.split("/");
		int sumMesg = 0;
		
		for (int i = 0; i < mesgList.length; i++) {
			sumMesg +=  Integer.parseInt(mesgList[i]);
		}
		int averMesg = sumMesg / mesgList.length;
		
		System.out.println("정수값 합계:"+sumMesg);
		System.out.println("정수값 평균:"+averMesg);
	}
}
