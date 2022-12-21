// Fig 2.9 Addition.Java
// Um programa de adição

// Pacotes de extensão de Java
import javax.swing.JOptionPane; // importa a classe JOPtionPane

public class Addition {
	
	// método main inicia a execução do aplicativo Java
	public static void main( String args[] ) {
		String firstNumber; // primeiro stirng inserido pelo usuário
		String secondNumber; // segundo string inserido pelo usuário
		int number1; // primeiro número a somar
		int number2; // segundo número a somar
		int sum; // soma de number1 e number2
		
		// lê o primeiro número do usuário como um string
		firstNumber = JOptionPane.showInputDialog( "Enter first integer" );
		
		// lê o segundo número do usuário como um string
		secondNumber = JOptionPane.showInputDialog(  "Enter second integer" );
		
		// converte os números do tipo String para o tipo int
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		
		// adiciona os números
		sum = number1 + number2;
		
		//exibe os resultados
		JOptionPane.showMessageDialog(
			null, "the sum is " + sum, "Reults",
			JOptionPane.PLAIN_MESSAGE);
		
		System.exit(0); // termina o aplicativo
	}
}