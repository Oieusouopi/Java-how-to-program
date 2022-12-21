import javax.swing.JOptionPane;

// Exercicio do livro How to program Java
// Exercicio 2.20, 2.21

public class Exec2_20 {
	
	public static void main( String args[] ) {
		String figura;
		// 4 figuras caixa - oval - seta - losango
		// caixa
		
		figura = "*********" + "  " + "   ***   " + "  " + "  *  " + "  " + "    *    " + "\n" +
				 "*       *" + "  " + " *     * " + "  " + " *** " + "  " + "   * *   " + "\n" +
				 "*       *" + "  " + "*       *" + "  " + "*****" + "  " + "  *   *  " + "\n" +
				 "*       *" + "  " + "*       *" + "  " + "  *  " + "  " + " *     * " + "\n" +
				 "*       *" + "  " + "*       *" + "  " + "  *  " + "  " + "*       *" + "\n" +
				 "*       *" + "  " + "*       *" + "  " + "  *  " + "  " + " *     * " + "\n" +
				 "*       *" + "  " + "*       *" + "  " + "  *  " + "  " + "  *   *  " + "\n" +
				 "*       *" + "  " + " *     * " + "  " + "  *  " + "  " + "   * *   " + "\n" +
				 "*********" + "  " + "   ***   " + "  " + "  *  " + "  " + "    *    ";
		JOptionPane.showMessageDialog(null, figura, "Result", JOptionPane.PLAIN_MESSAGE);
	} // fim método main

} // fim da classe Exec2_19