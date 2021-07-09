/**
 * 
 */
package labs.pm.model;

import java.math.BigDecimal;
import static java.math.RoundingMode.HALF_UP;

/**
 * @author enwud
 *
 */
public class Product {
	
	private int id;
	private String name;
	private BigDecimal price = BigDecimal.ZERO;
	public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * @return the discountRate
	 */
	public BigDecimal getDiscount() {
		return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
	}
	
	
	
	

}
