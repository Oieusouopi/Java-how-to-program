public class Viagem {
	private int quilometragem, litros;
	
	public Viagem(int quilometragem, int litros) {
		this.quilometragem = quilometragem;
		this.litros = litros;
	}
	
	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public void setLitros(int litros) {
		this.litros = litros;
	}
	
	public int getQuilometragem() {
		return quilometragem;
	}
	
	public int getLitros() {
		return litros;
	}
	
	public float media() {
		float media;
		media = (float) quilometragem/litros;
		return media;
	}
	
} // fim da classe Viagem