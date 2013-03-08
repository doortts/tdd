package main.ishop;


public class Item {

	private String itemName;
	private String category;
	private int price;
	
	public Item(String itemName, String category, int price) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public String getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}
}
