import javax.swing.JOptionPane;

// Exercicio do livro How to program Java
// Exercicio 2.34

public class Exec2_34 {
	
	public static void main( String args[]) {
	String name, surname, fullName;
	
	name = JOptionPane.showInputDialog("Enter your name");
	surname = JOptionPane.showInputDialog("Enter your surname");
	
	fullName = name + " " + surname;
	
	JOptionPane.showMessageDialog(null, "Seu nome com sobrenome é " + fullName);
	
	// final do processo
	System.exit(0);

	} // fim do método main

} // fim da classe Exec2_34