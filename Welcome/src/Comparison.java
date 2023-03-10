// Fig 2.20 Comparison.java
// Compara inteiros utilizando instrções if, operadores
// relacionais e operadores de igualdade

// Pacotes de extensão de Java
import javax.swing.JOptionPane;

public class Comparison {
	
	// método main inicia a execução do aplicativo Java
	public static void main( String args[] ) {
		String firstNumber; // primeiro string digitado pelo usuário
		String secondNumber; // segunda string digitado pelo usuário
		String result; // um string contendo a saída
		int number1; // primeiro número a comparar
		int number2; // segundo número a comparar
		
		// lê o primeiro número do usuário como uma string
		firstNumber = JOptionPane.showInputDialog("Enter first integer");
		
		// lê o segundo número do usuário como uma string
		secondNumber = JOptionPane.showInputDialog("Enter second integer");
		
		// converte os números do tipo String em int
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		
		// inicializa o resultado com a string vazio
		result = "";
		
		if (number1 == number2) {
			result = result + number1 + " == " + number2; 
		}

		if (number1 != number2) {
			result = result + "\n" + number1 + " != " + number2;
		}
		
		if (number1 < number2) {
			result = result + "\n" + number1 + " < " + number2;
		}
		
		if (number1 > number2) {
			result = result + "\n" + number1 + " > " + number2;
		}
		
		if (number1 <= number2) {
			result = result + "\n" + number1 + " <= " + number2;
		}
		
		if (number1 >= number2) {
			result = result + "\n" + number1 + " >= " + number2;
		}
		
		// exibe os resultados
		JOptionPane.showMessageDialog(null, result,
			"Comparison Results", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit( 0 ); // termina o aplicativo
	} // termina o método main

} // termina a classe Comparison