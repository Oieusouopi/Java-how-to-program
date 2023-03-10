// Figura 3.1: Account.java
// Classe Account que contém uma variável de instância name
// e métodos para configurar e obter seu valor.

public class Account  {
	private String name; // váriavel da instãncia
	private double balance; // váriavel da instãncia
	
	public Account(String name, double balance) {
		this.name = name;
		
		// valida que o balance é maior que 0.0; se não for,
		// a variável de instância balance mantém seu valor inicial padrão de 0.0
		if (balance > 0.0) {
			this.balance = balance;			
		}
	}
	
	// método que deposita (adiciona) apenas uma quantia válida no saldo
	public void deposit(double depositAmount) {

		if (depositAmount > 0.0) {
			balance += depositAmount;			
		}
		
	}
	
	// método que retira apenas uma quantia valida no saldo
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount <= balance) {
			balance -= withdrawAmount;
		} else {
			System.out.print("Withdrawal amount exceeded account balance\n\n");
		}
	}
	
	// método retorna o saldo da conta
	public double getBalance() {
		return this.balance;
	}
	
	// método para definir o nome no objeto
	public void setName(String name) {
		
		this.name = name; // armazena o nome

	} // fim do método setName

	// método para recuperar o nome do objeto
	public String getName() {
		
		return name; // retorna o valor do nome para o chamador

	} // fim do método getName
	
	public static void displayAccount(Account accountToDisplay) {
		System.out.printf("%s balance: $ %.2f %n",
				accountToDisplay.getName(), accountToDisplay.getBalance());
	}
	
} // fim da classe Account