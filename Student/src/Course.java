import java.util.Scanner;

public class Course {
	
	public static void main( String args[] ) {
		Scanner input = new Scanner(System.in);
		int approvedCounter, reprovedCounter, studentCounter;
		
		approvedCounter = 0;
		reprovedCounter = 0;
		studentCounter = 1;
		
		while (studentCounter <= 10) {
			System.out.print("Enter 1 se o aluno passou e 2 se o aluno reprovou: ");
			int grade = input.nextInt();
			if (grade == 1) {
				approvedCounter += 1;
			} else {
				reprovedCounter += 1;
			}
			studentCounter += 1;			
		}
		input.close();
		
		System.out.printf("O número de alunos aprovados é igual a %d\n", approvedCounter);
		System.out.printf("O número de alunos reprovados é igual a %d\n", reprovedCounter);
		
		if (approvedCounter > 8) {
			System.out.print("Bonus to instructor!");
		}
		
	}
	
} // fim da classe Course