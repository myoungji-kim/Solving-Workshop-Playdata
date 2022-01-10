package workshop5;

class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRage;
	private double discountBookPrice;
	
	Book(){}
	Book(String bookName, int bookPrice, double bookDiscountRate){
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRage = bookDiscountRate;
		this.discountBookPrice = getDiscountBookPrice();
	}
	
	public double getDiscountBookPrice() {
		discountBookPrice = bookPrice - (bookPrice*(bookDiscountRage*0.01));
		return discountBookPrice;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRage() {
		return bookDiscountRage;
	}
	public void setBookDiscountRage(double bookDiscountRage) {
		this.bookDiscountRage = bookDiscountRage;
	}
}

public class Q_05_02 {
	public static void main(String[] args) {
		Book b1 = new Book("SQL Plus", 50000, 5.0);
		Book b2 = new Book("JAVA 8.0", 40000, 3.0);
		Book b3 = new Book("JSP Servlet", 60000, 6.0);
		
		System.out.println("책 이름     가격   할인율   할인 후 금액");
		System.out.println("-------------------------------------------------");
		System.out.println(b1.getBookName() + "  " + b1.getBookPrice() + "  " + b1.getBookDiscountRage() + "%   " + b1.getDiscountBookPrice()+"원");
		System.out.println(b2.getBookName() + "  " + b2.getBookPrice() + "  " + b2.getBookDiscountRage() + "%   " + b2.getDiscountBookPrice()+"원");
		System.out.println(b3.getBookName() + "  " + b3.getBookPrice() + "  " + b3.getBookDiscountRage() + "%   " + b3.getDiscountBookPrice()+"원");

	}
}
