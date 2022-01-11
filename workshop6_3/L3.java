package workshop6_3;

public class L3 extends Car implements Temp{
	private int tempGage = 0;
	
	L3(String name, int engineSize, int oilTank, int oilSize, int distance) {
		super(name, engineSize, oilTank, oilSize, distance);
	}
	
	// 10 주행 시 주유량 1 감소
	public void go(int distance) {
		setDistance(getDistance()+distance);
		setOilSize(getOilSize()- (int) distance/10);
		getTempGage();
	}
	
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize);
	}
	
	// 10 주행 시 엔진온도 1 증가
	public int getTempGage() {
		return getDistance() / 10;
	}

	@Override
	public String toString() {
		return super.toString() + "           "+ getTempGage();
	}

}
