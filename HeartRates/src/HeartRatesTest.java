import java.util.Scanner;

public class HeartRatesTest {
	
	public static void main( String args[] ) {
	
	Scanner input = new Scanner(System.in);
	System.out.print("Qual é o seu nome ?\n");
	String name = input.next(); // obtem a entrada do usuário
	System.out.print("Qual é o seu sobrenome ?\n");
	String surname = input.next(); // obtem a entrada do usuário
	System.out.print("Qual é o dia do seu nascimento ?\n");
	int dia = input.nextInt(); // obtem a entrada do usuário
	System.out.print("Qual é o mês do seu nascimento ?\n");
	int mes = input.nextInt(); // obtem a entrada do usuário
	System.out.print("Qual é o ano do seu nascimento ?\n");
	int ano = input.nextInt(); // obtem a entrada do usuário
	input.close();
	
	// instanciando classe
	HeartRates client1 = new HeartRates(name, surname, dia, mes, ano);
	
	client1.age();
	client1.maximumFrequency();
	client1.targetFrequency();
		
	} // fim do método main
	
} // fim do método HeartRatesTest