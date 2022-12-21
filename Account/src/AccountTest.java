// Figura 3.2: AccountTest.Java
// Cria e manipula um objeto Account.
import java.util.Scanner;

public class AccountTest {
	
	public static void main(String args[]) {
		
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);

		// exibe saldo inicial de cada objeto
		Account.displayAccount(account1);
		Account.displayAccount(account2);

		// cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble(); // obtém a entrada do usuário
		System.out.printf("%nadding %.2f to account1 balance%n%n",depositAmount);
		account1.deposit(depositAmount); // adiciona o saldo de account1

		// exibe os saldos
		Account.displayAccount(account1);
		Account.displayAccount(account2);
		System.out.print("Enter deposit amount for account2: "); // prompt
		depositAmount = input.nextDouble(); // obtém a entrada do usuário
		System.out.printf("%nadding %.2f to account2 balance%n%n",
		depositAmount);
		account2.deposit(depositAmount); // adiciona ao saldo de account2
		
		// exibe os saldos
		Account.displayAccount(account1);
		Account.displayAccount(account2);
		
		// utilizando o método para quando houver pagamento de algo com a conta
		System.out.print("Enter pay amount for account1: ");
		double withdrawAmount = input.nextDouble();
		System.out.printf("%nsubtracting %.2f to account1 balance%n%n", withdrawAmount);
		account1.withdraw(withdrawAmount);
		System.out.print("Enter pay amount for account2: ");
		withdrawAmount = input.nextDouble();
		System.out.printf("%nsubtracting %.2f to account2 balance%n%n", withdrawAmount);
		account2.withdraw(withdrawAmount);
		input.close();
		
		// exibe os saldos
		Account.displayAccount(account1);
		Account.displayAccount(account2);
	}
	
}