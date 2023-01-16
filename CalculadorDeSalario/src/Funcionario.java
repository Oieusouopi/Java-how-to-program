public class Funcionario {
	
	private float salarioBruto;
	private int horasTrabalhadas;
	private float salarioPorHora;
	
	public Funcionario(int horasTrabalhadas, float salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
		this.horasTrabalhadas = horasTrabalhadas;
		calculadorDeSalarioBruto();
	}
	
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
		calculadorDeSalarioBruto();
	}
	
	public void setSalarioPorHora(float salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
		calculadorDeSalarioBruto();
	}
	
	public float getSalarioBruto() {
		return this.salarioBruto;
	}
	
	public float getSalarioPorHora() {
		return this.salarioPorHora;
	}
	
	public int getHorasTrabalhadas() {
		return this.horasTrabalhadas;
	}
	
	public void calculadorDeSalarioBruto() {
		if (horasTrabalhadas > 40) {
			salarioBruto = (float) ((40 * salarioPorHora) * ((horasTrabalhadas - 40) * (
					0.05 * salarioPorHora + salarioPorHora)));
		} else {
			salarioBruto = horasTrabalhadas * salarioPorHora;
		}
	}
}