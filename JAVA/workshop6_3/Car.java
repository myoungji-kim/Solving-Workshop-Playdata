package workshop6_3;

public abstract class Car {
	private String name;
	private int engineSize;
	private int oilTank;
	private int oilSize;
	private int distance;
	
	Car(String name, int engineSize, int oilTank, int oilSize, int distance){
		this.name = name;
		this.engineSize = engineSize;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	
	public abstract void go(int distance);
	public abstract void setOil(int oilSize);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engine) {
		this.engineSize = engineSize;
	}

	public int getOilTank() {
		return oilTank;
	}

	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}

	public int getOilSize() {
		return oilSize;
	}

	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return name + "   " + engineSize + "    " + oilTank + "     " + oilSize
				 + "        " + distance;
	}
	
}
