package workshop5;	
	
class Cafe {	
	private Coffee[] coffeeList = new Coffee[3];	
	private int index = 0;	
	
	public Cafe(){
		this.coffeeList = coffeeList;
	}	
	
	public int totalPrice() {	
		int sum = 0;
		for (int i=0; i<coffeeList.length; i++) {
			sum += coffeeList[i].getPrice();
		}
		return sum;	
	}	
	
	public void setCoffee(Coffee coffee) {	
		if (index == coffeeList.length) {
			System.out.println("더 이상 저장할 수 없습니다.");
		} else {
			coffeeList[index] = coffee;	
			index ++;	
		}
	} 
	
	public Coffee[] getCoffeeList() {	
		return coffeeList;	
	}	
		
	public String toString() {	
		return "";	
	}	
}	

class Coffee {	
	private String name;	
	private int price;	
	
	public Coffee(){}
	public Coffee(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return name+"   "+price;
	}
}

public class Q_05_08 {
	public static void main(String[] args) {
		Cafe cafe = new Cafe();

		cafe.setCoffee(new Coffee("Americano" , 4000));
		cafe.setCoffee(new Coffee("Caffelatte", 5000));
		cafe.setCoffee(new Coffee("Macchiato" , 6000));
		
		Coffee[] coffeeList = cafe.getCoffeeList();
		
		for (int i=0; i<3; i++) {
			System.out.println(coffeeList[i].toString());
		}
		
		System.out.println(cafe.totalPrice()+" 원");
	}
}
