package entity;

public class Product {
	private int id;
	private String name;
	private String img;
	private String title;
	private double price;
	public Product() {}
	public Product(int id, String name, String img, String title, double price) {
		super();
		this.id = id;
		this.name = name;
		this.img = img;
		this.title = title;
		this.price = price;
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
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", img=" + img + ", title=" + title + ", price=" + price + "]";
	}
		
}
