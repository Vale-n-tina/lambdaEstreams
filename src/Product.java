public class Product {

	private long id;
	private String name;
	private String categoria;
	private double price;

	public Product(long id, String name, String categoria, double price) {
		this.id = id;
		this.name = name;
		this.categoria = categoria;
		this.price = price;

	}


	@Override
	public String toString() {
		return "Product{" +
				  "id=" + id +
				  ", name='" + name + '\'' +
				  ", categoria='" + categoria + '\'' +
				  ", price=" + price +
				  '}';
	}

	public String getCategoria() {
		return categoria;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
