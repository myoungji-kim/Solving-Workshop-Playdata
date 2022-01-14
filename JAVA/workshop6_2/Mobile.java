package workshop6_2;

public abstract class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	// 사용을 통해 배터리 감소 (분단위로 입력)
	public abstract int operate(int time);
	// 충전을 통한 배터리 증가 (분단위로 입력)
	public abstract int charge(int time);
	
	Mobile(){}
	Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	@Override
	public String toString() {
		return mobileName + "        " + batterySize + "     " + osType;
	}
}
