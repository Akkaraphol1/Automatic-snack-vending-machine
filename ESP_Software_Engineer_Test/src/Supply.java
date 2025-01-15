/**
 * 
 * Create by ESP Asian Center Co., Ltd.
 *
 */

public class Supply {
	
	private String title;
	private double price;
	private int amount;
	
	public Supply(String title, int price, int amount) {		
		this.title = title;
		this.price = price;
		this.amount = amount;
	}
	
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	public int getAmount() {
		return amount;
	}
	public void addAmount(int amount) {
		this.amount += amount;
	}
	public void sold() {
		this.amount--;
	}
}
