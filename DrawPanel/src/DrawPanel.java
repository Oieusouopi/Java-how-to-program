// Figura 4.18: DrawPanel.java
// Utilizando DrawLine para conectar os cantos de um painel.

import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {
	// desenha um X a partir dos cantos do painel
	public void paintComponent(Graphics g) {
		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);
		
		int width = getWidth(); // largura total
		int height = getHeight(); // altura total
		int inclinacao = 0;
		int tamanho = width;
		
		for (int index = 1; index <= 7; index += 1) {
			 //desenha uma linha a partir do canto superior esquerdo até o inferior direito
			g.drawLine(0, 0, inclinacao, tamanho);
			g.drawLine(0, 0, tamanho, inclinacao);
			inclinacao += 30;
			tamanho -= 30;
		}
	}
} // fim da classe DrawPanel