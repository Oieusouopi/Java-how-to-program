public class HeartRates {
	private String name, surname;
	private int dia, mes, ano;
	
	public HeartRates(String name, String surname, int dia, int mes, int ano) {
		this.name = name;
		this.surname = surname;
		
		if (dia <= 31 && dia >= 0) {
			this.dia = dia;
		}
		
		if (mes <= 12 && dia >= 0) {
			this.mes = mes;
		}
		
		if (ano <= 2022 && ano >= 0) {
			this.ano = ano;
		}
	}
	
	// getters
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setDia(int dia) {
		if (dia <= 31 && dia >= 0) {
			this.dia = dia;
		}
		
	}
	
	public void setMes(int mes) {
		if (mes <= 12 && mes >= 0) {
			this.mes = mes;
		}
		
	}
	
	public void setAno(int ano) {
		if (ano <= 2022 && mes >= 0) {
			this.ano = ano;
		}
	}
	
	public void birthDate() {
		System.out.printf("%d/%d/%d", dia, mes, ano);
	}
	
	public void maximumFrequency() {
		double maxFrequency = 220 - (2022 - ano);
		System.out.printf("A frequência maxima de %s é igual: %.2f\n\n", name, maxFrequency);
	}
	
	public void age() {
		int age = 2022 - ano;
		System.out.printf("A idade de %s é igual: %d\n\n", name, age);
	}
	
	public void targetFrequency() {
		double fiftyTargetFrequency = 0.5 * (220 - (2022 - ano));
		double eightyFiveTargetFrequency = 0.85 * (220 - (2022 - ano));
		System.out.printf("Frequência alvo é entre %.2f e %.2f\n", fiftyTargetFrequency, eightyFiveTargetFrequency);
	}
	
}