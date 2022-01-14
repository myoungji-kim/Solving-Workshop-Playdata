package workshop6_2;

public class Ltab extends Mobile {
	Ltab(){}
	Ltab(String mobileName, int batterySize, String osType){
		super(mobileName, batterySize, osType);
	}
	
	// 사용을 통해 배터리 감소 (1분 사용시 10 감소, 잔여 배터리 return)
	public int operate(int time) {
		setBatterySize(getBatterySize()-(time*10));
		if (getBatterySize()<=0) {
			setBatterySize(0);
		}
		return getBatterySize();
	}
	
	// 충전을 통해 배터리 증가 (1분 충전시 10 증가, 잔여 배터리 return)
	public int charge(int time) {
		setBatterySize(getBatterySize()+(time*10));
		return getBatterySize();
	}
}
