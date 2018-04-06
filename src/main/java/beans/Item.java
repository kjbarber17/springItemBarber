package beans;


public class Item {
	private long id;
	private String itemName;
	private double price;
	private double salePrice;
	private double discount;
	
	
	public Item(long id, String itemName, double price, double discount, double salePrice) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.salePrice = salePrice;
		this.discount = discount;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	
	}
}
	
