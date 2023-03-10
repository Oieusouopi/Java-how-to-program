// Exercicio do livro How to program Java
// Exercicio 3.14

public class Date {
	int dia, mes, ano;

	public Date(int dia, int mes, int ano) {
		
		if (dia <= 31 && dia >= 0) {
			this.dia = dia;
		}
		
		if (mes <= 12 && mes >= 0) {
			this.mes = mes;
		}
		
		if (ano <= 2022 && ano >= 0) {
			this.ano = ano;
		}
		
	}
	
	// getters
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
	public void setDia(int dia) {
		
		if (dia < 31 && dia > 0) {
			this.dia = dia;
		}
		
	}
	
	public void setMes(int mes) {
		
		if (mes < 12 && mes > 0) {
			this.mes = mes;
		}
	}
	
	public void setAno(int ano) {
		
		if (ano < 2022 && ano > 0) {
			this.ano = ano;
		}
		
	}
	
	public void displayDate() {
		System.out.printf("%d/%d/%d", mes,dia,ano);
	}
	
} // fim da clase Date