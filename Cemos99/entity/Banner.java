package entity;

public class Banner {
	private int id;
	private String name;
	public Banner() {}
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
	public Banner(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Banner [id=" + id + ", name=" + name + "]";
	}
}
