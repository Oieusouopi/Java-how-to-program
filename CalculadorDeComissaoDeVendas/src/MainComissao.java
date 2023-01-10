import java.util.Scanner;

public class MainComissao {
	
	public static void main( String args[] ) {
		Scanner input = new Scanner(System.in);
		System.out.print("Adicione o valor Constante do vendedor: ");
		float salarioConstante = input.nextFloat();
		System.out.print("\nDeseja adicionar itens vendidos pelo vendedor ?");
		System.out.println("\n1 - Sim\n0 - Não");
		int resposta = input.nextInt();
		float valorBruto = 0;
		while (resposta == 1) {
			
			System.out.print("Valor do item: ");
			float valor = input.nextFloat();
			Item item = new Item(valor);
			valorBruto += item.getValor();
			
			System.out.print("\nDeseja adicionar itens vendidos pelo vendedor ?");
			System.out.print("\n1 - Sim\n0 - Não");
			resposta = input.nextInt();
		}
		input.close();
		Comissao comissao = new Comissao(salarioConstante);
		comissao.setVendasBrutas(valorBruto);
		comissao.calcularComissao();
		System.out.printf("\nA comissao do vendedor é de: %.2f", comissao.getComissao());
	}
	
} // fim da classe MainComissao