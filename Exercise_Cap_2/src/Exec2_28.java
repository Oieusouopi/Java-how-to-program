import javax.swing.JOptionPane;

// Exercicio do livro How to program Java
// Exercicio 2.28

public class Exec2_28 {
	
	public static void main( String args[]) {
		String firstNumber, secondNumber;
		int number1, number2;
		
		// números digitado pelo usuário
		firstNumber = JOptionPane.showInputDialog("Enter first number");
		secondNumber = JOptionPane.showInputDialog("Enter second number");
		
		// convertendo números String em int
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		
		// condição se é o pirmeiro é multiplo do segundo
		if (number1 % number2 == 0) {
			JOptionPane.showMessageDialog(null, "O primeiro número é multiplo do segundo");
			
			// fim do processo
			 System.exit( 0 );
			 
		} else {
			JOptionPane.showMessageDialog(null, "O primeiro número não é multiplo do segundo");
			
			// fim do processo
			System.exit( 0 );
		}
		
	}
}