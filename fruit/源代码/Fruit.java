package fruitManager;

import java.math.BigDecimal;

public class Fruit {
	private int id;
	private String name;
	private String type;
	private BigDecimal price;
	private int quantity;
	public Fruit() {
		super();
	}
	public Fruit(int id, String name, String type, BigDecimal price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Fruit(int id) {
		super();
		this.id = id;
	}
	public Fruit(int id, int quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
