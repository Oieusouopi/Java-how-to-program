public class Comissao {
	private float salarioConstante;
	private float vendasBrutas;
	private double comissao;
	
	public Comissao(float salarioConstante) {
		this.salarioConstante = salarioConstante;
		this.vendasBrutas = 0;
		this.comissao = salarioConstante + (0.09 * vendasBrutas);
	}
	
	public void setSalarioConstante(int salarioConstante) {
		this.salarioConstante = salarioConstante;
	}
	
	public void setVendasBrutas(float vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}
	
	public float getSalarioConstante() {
		return salarioConstante;
	}
	
	public float getVendasBrutas() {
		return vendasBrutas;
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public void calcularComissao() {
		comissao = salarioConstante + (0.09 * vendasBrutas);
	}
}