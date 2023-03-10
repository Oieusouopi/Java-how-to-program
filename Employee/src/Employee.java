// Exercicio do livro How to program Java
// Exercicio 3.13

public class Employee {
	String firstName;
	String surname;
	double monthlySalary;
	
	public Employee(String firstName, String surname, double monthlySalary) {
		this.firstName = firstName;
		this.surname = surname;
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;			
		}
	}
	
	// getters
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public double getMonthlySalary() {
		return this.monthlySalary;
	}
	
	// setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		} else {
			System.out.printf("monthly salary must be greater than %.2f", monthlySalary);
		}
	}
	
	// salario anual
	public double annualSalary() {
		return monthlySalary * 12;
	}
	
	// aumento de salario
	public void salaryIncrease(double increasePorcentage) {
		monthlySalary += increasePorcentage/100 * monthlySalary;
	}

} // fim da classe Employee