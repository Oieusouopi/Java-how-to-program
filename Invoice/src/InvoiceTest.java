public class InvoiceTest {
	
	public static void main(String args[]) {
	
	// Instanciando a classe
	Invoice invoice1 = new Invoice("1", "notebooks", 5, 12.0);
	
	// monstrando os atributos da classe
	System.out.printf("id: %s\ndescription: %s\nquantity: %d\nprice: %.2f\n",
			invoice1.getId(), invoice1.getDescription(), invoice1.getQuantityPurchased(),
			invoice1.getPrice());
	
	System.out.printf("\nthe invoice amount is equal: %.2f", invoice1.getInvoiceAmount());
		
	} // fim do método main
	
} // fim da classe InvoiceTest