// Exercicio do livro How to program Java
// Exercicio 2.17

import javax.swing.JOptionPane;

public class Exec2_17 {
	
	public static void main( String args[] ) {
		String firstNumber, secondNumber;
		int number1, number2;
		
		// Inserindo o primeiro número que o usuário vai digitar
		firstNumber = JOptionPane.showInputDialog("Enter fist number");
		
		// Inserindo o segundo número que o usuário vai digitar
		secondNumber = JOptionPane.showInputDialog("Enter second Number");
		
		// Convertendo String para inteiros
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		
		if (number1 > number2) {
			JOptionPane.showMessageDialog(null, number1 + " is larger");
		}
		
		if (number2 > number1) {
			JOptionPane.showMessageDialog(null, number2 + " is larger");
		}
		
		if (number1 == number2 ) {
			JOptionPane.showMessageDialog(null, "These numbers are equal");			
		}
		
		System.exit( 0 );
	} // fim do método main
	
} // fim da class Exec2_17