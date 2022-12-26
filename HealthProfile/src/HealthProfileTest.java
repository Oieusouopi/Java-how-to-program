import java.util.Scanner;

public class HealthProfileTest {
	
	public static void main( String args[] ) {
		Scanner input = new Scanner(System.in);
		System.out.println("Qual é o seu nome ?");
		String name = input.next();
		System.out.println("Qual é o seu sobrenome ?");
		String surname = input.next();
		System.out.println("Qual é a sua sexualidade ?");
		String sexuality = input.next();
		System.out.println("Que dia você nasceu ?");
		int day = input.nextInt();
		System.out.println("Que mês você nasceu ?");
		int month = input.nextInt();
		System.out.println("Que ano você nasceu ?");
		int year = input.nextInt();
		System.out.println("Qual é a sua altura ?");
		double height = input.nextDouble();
		System.out.println("Qual é o seu peso ?");
		double weight = input.nextDouble();
		input.close();
		
		HealthProfile profile = new HealthProfile(name, surname, sexuality, day, month,
				year, height, weight);
		
		System.out.printf("Seu nome: %s\nSeu sobrenome: %s\nSua sexualidade: %s\n"
				+ "Nasceu em: %d/%d/%d\nAltura: %.2fm\nPeso; %.2fkg\n\n", profile.getName(), profile.getSurname(),
				profile.getSexuality(), profile.getDay(), profile.getMonth(), profile.getYear(),
				profile.getHeight(), profile.getWeight());
		
		profile.maximumFrequency();
		profile.targetFrequency();
		profile.birthDay();
		profile.imc();
	}
} // fim da classe HealthProfileTest