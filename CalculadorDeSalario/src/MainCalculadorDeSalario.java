import java.util.Scanner;

public class MainCalculadorDeSalario {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int contador = 1;
		while (contador <= 3) {
			System.out.print("Inserir o valor de horas trabalhadas por semana do empregado: ");
			int horasTrabalhadas = input.nextInt();
			System.out.print("\nInserir o valor de salario por hora do empregado: ");
			float salarioPorHora = input.nextFloat();
			Funcionario funcionario = new Funcionario(horasTrabalhadas, salarioPorHora);
			System.out.printf("\nO salario bruto do %dº funcionário é igual: %.2f", contador, funcionario.getSalarioBruto());
			
			contador ++;
		}
	}
}