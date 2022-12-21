import javax.swing.JOptionPane;

// Exercicio do livro How to program Java
// Exercicio 2.27

public class Exec2_27 {
	
	public static void main( String args[]) {
		String firstNumber;
		int number;
		
		firstNumber = JOptionPane.showInputDialog("Enter a number");
		
		number = Integer.parseInt(firstNumber);
		
		// condição se é par ou impar respectivamente
		if (number % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + number + " é par");
			
			// fim do processo
			System.exit( 0 );
		} else {
			JOptionPane.showMessageDialog(null, "O número " + number + " é impar");
			
			// fim do processo
			System.exit( 0 );
		}

	} // fim do método main

} // fim da classe Exec2_27