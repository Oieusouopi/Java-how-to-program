public class Cliente {
	private int numeroDaConta;
	private int totalDeItens;
	private int saldo;
	private int creditosPorMes;
	private int limiteDoCredito;
	private int despesa;
	
	public Cliente(int numeroDaConta, int totalDeItens, int creditosPorMes, int limiteDoCredito) {
		this.numeroDaConta = numeroDaConta;
		this.totalDeItens = totalDeItens;
		this.saldo = 0;
		this.creditosPorMes = creditosPorMes;
		this.limiteDoCredito = limiteDoCredito;
		this.despesa = 0;
	}
	
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public void setTotalDeItens(int totalDeItens) {
		this.totalDeItens = totalDeItens;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void setCreditosPorMes(int creditosPorMes) {
		this.creditosPorMes = creditosPorMes;
	}
	
	public void setLimiteDoCredito(int limiteDoCredito) {
		this.limiteDoCredito = limiteDoCredito;
	}
	
	public void setDespesa(int despesa) {
		this.despesa = despesa;
	}
	
	public int getnumeroDaConta() {
		return numeroDaConta;
	}
	
	public int getTotalDeItens() {
		return totalDeItens;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public int getCreditosPorMes() {
		return creditosPorMes;
	}
	
	public int getLimiteDoCredito() {
		return limiteDoCredito;
	}
	
	public int getDespesa() {
		return despesa;
	}
	
	public void calcularNovoSaldo() {
		int novoSaldo = saldo + limiteDoCredito - despesa;
		if (novoSaldo < 0) {
			System.out.print("Limite do crédito excedito");
		}
	}
}