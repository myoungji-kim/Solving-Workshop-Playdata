package workshop6_2;

public class Otab extends Mobile {
	Otab(){}
	Otab(String mobileName, int batterySize, String osType){
		super(mobileName, batterySize, osType);
	}
	
	// 사용을 통해 배터리 감소 (1분 사용시 12 감소, 잔여 배터리 return)
	public int operate(int time) {
		setBatterySize(getBatterySize()-(time*12));
		if (getBatterySize()<=0) {
			setBatterySize(0);
		}
		return getBatterySize();
	}
	
	// 충전을 통해 배터리 증가 (1분 충전시 8 증가, 잔여 배터리 return)
	public int charge(int time) {
		setBatterySize(getBatterySize()+(time*8));
		return getBatterySize();
	}
}
