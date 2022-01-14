package workshop6_3;

public class L5 extends Car implements Temp {
	private int tempGage = 0;
	
	L5(String name, int engineSize, int oilTank, int oilSize, int distance) {
		super(name, engineSize, oilTank, oilSize, distance);
	}
	
	// 8 주행 시 주유량 1 감소
	public void go (int distance) {
		setDistance(getDistance()+distance);
		setOilSize(getOilSize()-Math.round(distance/8));
		getTempGage();
	}
	
	public void setOil (int oilSize) {
		setOilSize(getOilSize()+oilSize);
	}

	// 5 주행 시 엔진온도 1 증가
	public int getTempGage() {
		return getDistance() / 5;
	}
	
	@Override
	public String toString() {
		return super.toString() + "           "+ getTempGage();
	}

}
