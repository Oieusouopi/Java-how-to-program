// Exercicio do livro How to program Java
// Exercicio 2.16

import javax.swing.JOptionPane;

public class Exec2_16 {
	
	public static void main( String args[]) {
		String firstNumber, secondNumber; // declarando as duas variáveis do tipo String
		int resultSum;
		int resultDiv;
		int resultProd;
		int resultDif;
		int number1, number2; // declarando as duas váraveis do tipo int
		
		// Primeiro número que o usuário irá digitar
		firstNumber = JOptionPane.showInputDialog("Enter first Number");
		
		// Segundo número que o usuário irá digitar
		secondNumber = JOptionPane.showInputDialog("Enter second Numnber");
		
		// converte os números de String para int
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		
		// resultado das operações
		resultSum = number1 + number2;
		resultDiv = number1 / number2;
		resultProd = number1 * number2;
		resultDif = number1 - number2;
		
		JOptionPane.showMessageDialog(null, "A soma desses números é igual: " + resultSum + "\n" +
			"O produto desses números é igual: " + resultProd + "\n" +
			"A divisão desses números é igual: " + resultDiv + "\n" +
			"A diferença desses números é igual: " + resultDif);
		
		System.exit( 0 );
	} // fim do método main

} // fim da classe Exec2_16