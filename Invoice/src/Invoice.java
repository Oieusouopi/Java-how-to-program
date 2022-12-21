// Exercicio do livro How to program Java
// Exercicio 3.12

public class Invoice {
	String id;
	String description;
	int quantityPurchased;
	double price;
	
	public Invoice(String id, String description, int quantityPurchased, double price) {
		this.id = id;
		this.description = description;
		if (quantityPurchased > 0) {
			this.quantityPurchased = quantityPurchased;			
		}
		if (price > 0) {
			this.price = price;			
		}
	}
	
	// métodos getters
	public String getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getQuantityPurchased() {
		return quantityPurchased;
	}
	
	public double getPrice() {
		return price;
	}
	
	// métodos setters
	public void setId(String id) {
		this.id = id;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setQuantityPurchased(int quantityPurchased) {
		if (quantityPurchased > 0) {
			this.quantityPurchased = quantityPurchased;			
		}
	}
	
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;			
		}
	}
	
	public double getInvoiceAmount() {
		return quantityPurchased * price;
	}
}