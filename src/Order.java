import java.time.LocalDateTime;
import java.util.List;

public class Order {

	private long id;
	private String status;
	private LocalDateTime orderDate;
	private LocalDateTime deliveryDate;
	private List<Product> prodotti;
	private Customer clienti;

	public Order(long id, String status, LocalDateTime orderDate, LocalDateTime deliveryDate, List<Product> prodotti, Customer clienti) {
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.prodotti = prodotti;
		this.clienti = clienti;
	}

	public List<Product> getProdotti() {
		return prodotti;
	}

	public long getId() {
		return id;
	}

	public Customer getClienti() {
		return clienti;
	}

	@Override
	public String toString() {
		return "Order{" +
				  "id=" + id +
				  ", status='" + status + '\'' +
				  ", orderDate=" + orderDate +
				  ", deliveryDate=" + deliveryDate +
				  ", prodotti=" + prodotti +
				  ", clienti=" + clienti +
				  '}';
	}
}
