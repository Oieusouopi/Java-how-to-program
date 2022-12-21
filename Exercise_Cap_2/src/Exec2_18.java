// Exercicio do livro How to program Java
// Exercicio 2.18

import javax.swing.JOptionPane;

public class Exec2_18 {
	
	public static void main( String argas[]) {
	  String firstNumber, secondNumber, thirdNumber;
	  int number1, number2, number3;
	  int sumResult, medResult, prodResult;
	  int biggerNumber, smallNumber;
	  
	  // digitando primeiro número pelo usuário
	  firstNumber = JOptionPane.showInputDialog("Enter first number");
	  
	  // digitando primeiro número pelo usuário
	  secondNumber = JOptionPane.showInputDialog("Enter second number");
	  
	  // digitando primeiro número pelo usuário
	  thirdNumber = JOptionPane.showInputDialog("Enter third number");
	  
	  // Convertendo as String em int
	  number1 = Integer.parseInt(firstNumber);
	  number2 = Integer.parseInt(secondNumber);
	  number3 = Integer.parseInt(thirdNumber);

	  // Resultado da soma,media e produto desses números
	  sumResult = number1 + number2 + number3;
	  medResult = (number1 + number2 + number3) / 3;
	  prodResult = number1 * number2 *number3;
	  
	  // Maior número
	  biggerNumber = 0; // iniciando biggerNumber
	  
	  if (number1 > number2 && number1 > number3) {
		  biggerNumber = number1;
	  } // fim do if
	  
	  if (number2 > number1 && number2 > number3) {
		  biggerNumber = number2;
	  } // fim do if
	  
	  if (number3 > number1 && number3 > number1) {
		  biggerNumber = number3;
	  } // fim do if
	  
	  // Menor número
	  smallNumber = 0; // iniciando smallNumber
	  
	  if (number1 < number2 && number1 < number3) {
		  smallNumber = number1;
	  } // fim do if
	  
	  if (number2 < number1 && number2 < number3) {
		  smallNumber = number2;
	  } // fim do if
	  
	  if (number3 < number1 && number3 < number2) {
		  smallNumber = number3;
	  } // fim do if
	  
	  // exibição do resultado
	  JOptionPane.showMessageDialog(null, "A soma desses números é igual: " + sumResult + "\n" +
		"O produto desses números é igual: " + prodResult + "\n" +
		"A média desses números é igual: " + medResult + "\n" +
		"O maior número desses números é igual: " + biggerNumber + "\n" +
		"O menor número desses números é igual: " + smallNumber);
	} // fim do método main
	
} // fim da classe Exec2_18