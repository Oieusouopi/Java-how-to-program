import java.util.Scanner;

public class MainViagem {
	
	public static void main(String args[]) {
		
		int somaLitros = 0;
		int somaQuilometragem = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Deseja adicionar uma viagem ?");
		System.out.println("1 - Sim\n0 - Não");
		int resposta = input.nextInt();
		
		while (resposta == 1) {
			System.out.print("quilometragem da viagem: ");
			int quilometragem = input.nextInt();
			System.out.print("\nquanto litros começou: ");
			int litros = input.nextInt();
			Viagem viagem = new Viagem(quilometragem, litros);
			System.out.printf("Quilometragem/litro: %.2fkm/l\n", viagem.media());
			somaLitros += viagem.getLitros();
			somaQuilometragem += viagem.getQuilometragem();
			
			System.out.println("Deseja adicionar uma viagem ?");
			System.out.println("1 - Sim\n0 - Não");
			resposta = input.nextInt();
		}
		
		input.close();
		System.out.printf("Quilometragem total: %d\n", somaQuilometragem);
		System.out.printf("Total de litro consumidos: %d", somaLitros);
		
	}
	
} // fim da classe MainViagem