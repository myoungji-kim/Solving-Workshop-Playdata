package workshop5_2;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	Book(){}
	Book(String bookName, int bookPrice, double bookDiscountRate){
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getDiscountBookPrice() {
		return bookPrice - (bookPrice*bookDiscountRate*0.01);
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
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	@Override
	public String toString() {
		return bookName + "  " + bookPrice + "원  " + bookDiscountRate+ " %   " + getDiscountBookPrice() + " 원";
	}  
	
	
}
