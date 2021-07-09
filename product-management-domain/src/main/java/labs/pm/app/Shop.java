package labs.pm.app;

import java.math.BigDecimal;

import labs.pm.model.Product;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p = new Product();
		p.setId(101);
		p.setName("Tea");
		p.setPrice(BigDecimal.valueOf(1.99));
		
		System.out.printf("%d %s %.2f %.2f %n", 
				p.getId(), p.getName(), p.getPrice(), p.getDiscount());

	}

}
