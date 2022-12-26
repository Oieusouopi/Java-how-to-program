public class HealthProfile {
	private String name, surname, sexuality;
	private int day, month, year;
	private double height, weight;
	
	public HealthProfile(String name, String surname, String sexuality, int day, int month, int year, double height, double weight) {
		this.name = name;
		this.surname = surname;
		this.sexuality = sexuality;
		this.height = height;
		this.weight = weight;
		if (day <= 31 && day >= 0) {
			this.day = day;
		}
		
		if (month <= 12 && month >= 0) {
			this.month = month;			
		}
		
		if (year <= 2022 && year >= 0) {
			this.year = year;			
		}		
	}
	
	// getters
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getSexuality() {
		return sexuality;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	// setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setSexuality(String sexuality) {
		this.sexuality = sexuality;
	}
	
	public void setDay(int day) {
		if (day <= 31 && day >= 0) {
			this.day = day;
		}
	}
	
	public void setMonth(int month) {
		if (month <= 12 && month >= 0) {
			this.month = month;
		}
	}
	
	public void setYear(int year) {
		if (year <= 2022 && year >= 0) {
			this.year = year;
		}
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	// métodos
	public void birthDay() {
		int age = 2022 - year;
		System.out.printf("A idade do %s é igual a %d anos\n\n", name, age);
	}
	
	public void maximumFrequency() {
		double maxFrequency = 220 - (2022 - year);
		System.out.printf("A frequência maxima de %s é igual: %.2f\n\n", name, maxFrequency);
	}
	
	public void targetFrequency() {
		double fiftyTargetFrequency = 0.5 * (220 - (2022 - year));
		double eightyFiveTargetFrequency = 0.85 * (220 - (2022 - year));
		System.out.printf("Frequência alvo é entre %.2f e %.2f\n\n", fiftyTargetFrequency, eightyFiveTargetFrequency);
	}
	
	public void imc() {
		double imc = weight / (height * height);
		System.out.printf("O IMC de %s %s é igual a %.2f Kg/m2\n", name, surname, imc);
	}
	
} // final da classe HealthProfile