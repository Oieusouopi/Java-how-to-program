public class EmployeeTest {
	public static void main( String args[] ) {
		
		// instanciado classes
		Employee employee1 = new Employee("Rafael", "Santos", 1200.00);
		Employee employee2 = new Employee("Gabriel", "Santos", 2200.00);
		
		// mostrando os atributos da classe
		System.out.printf("Employee 1\nprimeiro nome: %s\nsegundo nome: %s\nsalario mensal: %.2f\n",
				employee1.getFirstName(), employee1.getSurname(), employee1.getMonthlySalary());
		System.out.printf("\nEmployee 2\nprimeiro nome: %s\nsegundo nome: %s\nsalario mensal: %.2f\n",
				employee2.getFirstName(), employee2.getSurname(), employee2.getMonthlySalary());
		
		// salario anual
		System.out.printf("\nSalario anual do employee1: %.2f", employee1.annualSalary());
		System.out.printf("\nSalario anual do employee2: %.2f\n", employee2.annualSalary());
		
		// aumento salarial de 10%
		employee1.salaryIncrease(10);
		employee2.salaryIncrease(10);
		
		// salario anual
		System.out.printf("\nSalario anual do employee1: %.2f", employee1.annualSalary());
		System.out.printf("\nSalario anual do employee2: %.2f", employee2.annualSalary());
		
	} // fim do método main
	
} // fim da classe EmployeeTest