import javax.swing.JOptionPane;

// Exercicio do livro How to program Java
// Exercicio 2.26

public class Exec2_26 {
	
	public static void main( String args[]) {
		String firstNumber, secondNumber, thirdNumber, fourthNumber, fifithNumber;
		int number1, number2, number3, number4, number5;
		int biggerNumber, smallNumber;
		
		// Números digitado pelo usuário
		firstNumber = JOptionPane.showInputDialog("Enter first number");
		secondNumber = JOptionPane.showInputDialog("Enter second number");
		thirdNumber = JOptionPane.showInputDialog("Enter third number");
		fourthNumber = JOptionPane.showInputDialog("Enter fourth number");
		fifithNumber = JOptionPane.showInputDialog("Enter fifth number");
		
		// Convertendo números String em Int
		number1 = Integer.parseInt(firstNumber);
		number2 = Integer.parseInt(secondNumber);
		number3 = Integer.parseInt(thirdNumber);
		number4 = Integer.parseInt(fourthNumber);
		number5 = Integer.parseInt(fifithNumber);
		
		// inicializando biggerNumber
		biggerNumber = 0;
		
		// condição de maior número
		// condição se o primeiro número é maior
		if (number1 > number2) {
			if (number1 > number3) {
				if (number1 > number4) {
					if (number1 > number5) {
						number1 = biggerNumber;
					} // fim do quarto if
				} // fim do terceiro if
			} // fim do segundo if
		} // fim do primeiro if
		
		// condição se o segundo número é maior
		if (number2 > number1) {
			if (number2 > number3) {
				if (number2 > number4) {
					if (number2 > number5) {
						biggerNumber = number2;
					} // fim do quarto if
				} // fim do terceiro if
			} // fim do segundo if
		} // fim do primeiro if
		
		// condição se o terceiro número é maior
		if (number3 > number1) {
			if (number3 > number2) {
				if (number3 > number4) {
					if (number3 > number5) {
						biggerNumber = number3;
					} // fim do quarto if
				} // fim do terceiro if
			} // fim do segundo if
		} // fim do primeiro if
		
		// condição se o quarto número é maior
		if (number4 > number1) {
			if (number4 > number2) {
				if (number4 > number3) {
					if (number4 > number5) {
						biggerNumber = number4;
					} // fim do quarto if
				} // fim do terceiro if
			} // fim do segundo if
		} // fim do primeiro if
		
		// condição se o quinto número é maior
		if (number5 > number1) {
			if (number5 > number2) {
				if (number5 > number3) {
					if (number5 > number4) {
						biggerNumber = number5;
					} // fim do quarto if
				} // fim do terceiro if
			} // fim do segundo if
		} // fim do primeiro if
		
		// inicilaizando smallNumber
		smallNumber = 0;

		// Condição de menor número
		// condição se o primeiro número é menor
		if (number1 < number2) {
			if (number1 < number3) {
				if (number1 < number4) {
					if (number1 < number5) {
						smallNumber = number1;
					} // fim do quarto if
				} // fim do terceiro if
			} // fim do segundo if
		} // fim do primeiro if

		// condição se o segundo número é menor
		if (number2 < number1) {
			if (number2 < number3) {
				if (number2 < number4) {
					if (number2 < number5) {
						smallNumber = number2;
					} // fim do quarto if
				} // fim do terceiro if
			} // fim do segundo if
		} // fim do primeiro if
		
		// condição se o terceiro número é menor
		if (number3 < number1) {
			if (number3 < number2) {
				if (number3 < number4) {
					if (number4 < number5) {
						smallNumber = number3;
					} // fim do quarto if
				} // fim do terceiro if
			} // fim do segundo if
		} // fim do primeiro if
		
		// condição se o quarto número é menor
		if (number4 < number1) {
			if (number4 < number2) {
				if (number4 < number3) {
					if (number4 < number5) {
						smallNumber = number4;
					} // fim do primeiro if
				} // fim do segundo if
			} // fim do terceiro if
		} // fim do quarto if
		
		// condição se o quinto número é menor
		if (number5 < number1) {
			if (number5 < number2) {
				if (number5 < number3) {
					if (number5 < number4) {
						smallNumber = number5;
					} // fim do primeiro if
				} // fim do segundo if
			} // fim do terceiro if
		} // fim do quarto if
		
		// resultado do menor número e maior número
		JOptionPane.showMessageDialog(null, "Maior número é igual: " + biggerNumber +
				"\n" + "Menor número é igual: " + smallNumber);

		// fim do processo
		System.exit( 0 );
		
	} // fim do método main

} // fim da classe Exec2_25