// Exercicio do livro How to program Java
// Exercicio 2.19

import javax.swing.JOptionPane;

public class Exec2_19 {

	public static void main( String args[]) {
		double pi;
		String inputRadius;
		double radius;
		double diameter, area, circuferemce;
		
		// inserindo o valor do raio que usuário digitou
		inputRadius = JOptionPane.showInputDialog("Enter cicle radius");
		
		// convertendo String em double do raio
		radius = Double.parseDouble(inputRadius);
		
		// definindo a variável pi como o valor de pi
		pi = Math.PI;
		
		// diâmetro
		diameter = 2 * radius;
		
		// circuferência
		circuferemce = 2 * pi * radius;
		
		// área
		area = pi * Math.pow(radius, 2);
		
		// exibindo os resultados
		JOptionPane.showMessageDialog(null, "O diâmetro do circulo é igual: " + diameter + "\n" + 
			"A circuferência do circulo é igual: " + circuferemce + "\n" + 
			"A área do circulo é igual: " + area);

	} // fim do método main

} // fim da class Exec2_19