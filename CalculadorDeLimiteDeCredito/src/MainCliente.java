import java.util.Scanner;

public class MainCliente {
	public static void main( String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Deseja criar o cliente ?\n1 - Sim\n0 - Não");
		int resposta = input.nextInt();
		while (resposta == 1) {
			System.out.print("\nInserir o número da conta: ");
			int numeroDaConta = input.nextInt();
			System.out.print("\nInserir total de itens cobrados desse cliente: ");
			int totalDeItens = input.nextInt();
			System.out.print("\nInserir creditos aplicados ao mês: ");
			int creditosPorMes = input.nextInt();
			System.out.print("\nInserir limite de creditos: ");
			int limiteDeCreditos = input.nextInt();
			Cliente cliente = new Cliente(numeroDaConta, totalDeItens, creditosPorMes, limiteDeCreditos);
			cliente.setDespesa(100);
			cliente.setSaldo(20);
			cliente.calcularNovoSaldo();
			System.out.print("\nDeseja criar o cliente ?\n1 - Sim\n0 - Não");
			resposta = input.nextInt();
			input.close();
		}
	}
	
}