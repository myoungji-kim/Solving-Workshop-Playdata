package workshop8_7;

public class Mobile {
	String code;
	String name;
	double price;
	
	Mobile(){}
	Mobile(String code, String name, double price){
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	// Mobile 객체 정보 toString 출력
	public String printInfo() {
		return code + "  " + name + "  " + price;
	}
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
