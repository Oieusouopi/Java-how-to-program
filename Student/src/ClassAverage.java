import java.util.Scanner;

public class ClassAverage {
	public static void main(String[] args) {
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		// fase de inicialização
		int total = 0; // inicializa a soma das notas inseridas pelo usuário
		int gradeCounter = 0; // inicializa nº da nota a ser inserido em seguida
		
		System.out.print("Enter grade or -1 to quit: "); // prompt
		int grade = input.nextInt(); // insere a próxima nota
		
		// fase de processamento utiliza repetição controlada por contador
		while (grade != -1) { // faz o loop 10 vezes
			total = total + grade; // adiciona grade a total
			gradeCounter = gradeCounter + 1; // incrementa o contador por 1
			
			System.out.print("Enter grade or -1 to quit: "); // prompt
			grade = input.nextInt(); // insere a próxima nota
		}
		
		input.close();
		if (gradeCounter != 0) {
			// fase de término
			double average = (double) total / gradeCounter; // divisão de inteiros produz um resultado inteiro
			
			// exibe o total e a média das notas
			System.out.printf("%nTotal of all %d grades is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);		
		} else {
			System.out.print("No grade were entered");
		}
	}
	
} // fim da classe ClassAverag