import java.util.Scanner;

public class LocalizarMaiorNumero {
	public static void main(String args[] ) {
		Scanner input = new Scanner(System.in);
		int number,counter,largest;
		counter = 0;
		largest = Integer.MIN_VALUE;
		
		while (counter < 10) {
			System.out.print("Digite o número: ");
			number = input.nextInt();
			if (number > largest) {
				largest = number;
			}
			counter++;
		}
		input.close();
		System.out.printf("\nO maior número é igual a: %d", largest);
	}
}