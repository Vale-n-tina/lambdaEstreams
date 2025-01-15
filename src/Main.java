import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


public class Main {
	public static void main(String[] args) {

		Customer cliente=new Customer(123467774, "valentina", 2);
		Customer cliente2=new Customer(3467774, "Giulia", 3);
		Customer cliente3=new Customer(3467774, "gianmarco", 2);

		Product prodotto1=new Product(123242432, "telefono", "elettronica", 500.99);
		Product prodotto2=new Product(124899932, "biberon", "baby", 9.99);
		Product prodotto3=new Product(129788972, "lavandino", "casa", 109.99);
		Product prodotto4=new Product(129756652, "harryPotters", "books", 9.99);
		Product prodotto5=new Product(129788972, "gioco cane", "animali", 3.99);
		Product prodotto6=new Product(129788972, "le 8 montagne", "books", 101.99);
		Product prodotto7=new Product(129788972, "ciuccio", "baby", 1.99);
		Product prodotto8=new Product(1297972, "maglietta", "boys", 9.99);
		Product prodotto9=new Product(788675697, "playstation", "boys", 400.99);


		List<Product> prodotti= Arrays.asList(prodotto1, prodotto2, prodotto3, prodotto4, prodotto5, prodotto6, prodotto7, prodotto8, prodotto9);
		List<Product> prodotti2= Arrays.asList(prodotto1, prodotto2, prodotto4, prodotto6, prodotto7);
		List<Product> prodotti3= Arrays.asList(prodotto1, prodotto4, prodotto6);


		Order ordine1 = new Order(23434467, "in elaborazione",LocalDateTime.now(), LocalDateTime.now().plusDays(3), prodotti, cliente);
		System.out.println(ordine1);
		Order ordine2= new Order(2142343423, "spedito", LocalDateTime.now(), LocalDateTime.now().plusDays(1), prodotti2, cliente2 );
		Order ordine3= new Order(21423423, "spedito", LocalDateTime.now(), LocalDateTime.now().plusDays(1), prodotti3, cliente3 );



		List<Product> prodittiLibriFiltrati=prodotti.stream().filter(p-> "books".equals(p.getCategoria())).filter(p->p.getPrice()<100).toList();
		System.out.println("Prodotti che appartengono alla categoria Books e costano meno di 100 euro");
		prodittiLibriFiltrati.forEach(p-> System.out.println(p.getName() + " - " + p.getPrice()));

		List<Order> ordiniConBaby=Arrays.asList(ordine1, ordine2, ordine3).stream().filter(o -> o.getProdotti().stream().anyMatch(p->"baby".equals(p.getCategoria()))).toList();
		System.out.println("ecco la lista degli ordini che hanno all'interno almeno una categoria baby");
		ordiniConBaby.forEach(o-> System.out.println("id " + o.getId() + " - " + o.getClienti()));

		List<Product> protottiBoysSconto=prodotti.stream().filter(p-> "boys".equals(p.getCategoria())).map(p-> { double nuovoprezzo=p.getPrice()*0.9; p.setPrice(nuovoprezzo); return p ;}).toList();
		protottiBoysSconto.forEach(p-> System.out.println("prezzo nuovo " + String.format("%.2f", p.getPrice()))
		);


	}
}