package projetoPlataformaDeViagens;

public class Cliente {
	private String nome;
	private String origem;
	private String destino;
	private int qtdeDias;
	private int estrelasMin;
	private double disponivel;

	public Cliente(String nome, String origem, String destino, int qtdeDias, int estrelasMin,double disponivel) {
		this.nome = nome;
		this.origem = origem;
		this.destino = destino;
		this.qtdeDias = qtdeDias;
		this.estrelasMin = estrelasMin;
		this.disponivel = disponivel;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getOrigem() {
		return origem;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public int getQtdeDias() {
		return qtdeDias;
	}
	
	public int getEstrelasMin() {
		return estrelasMin;
	}
	
	public double getDisponivel() {
		return disponivel;
	}
	
	public String toString() {
		return String.format("%n%s%n%s->%s%n%d dias%n%d estrelas%n", nome,origem,destino,qtdeDias,estrelasMin);
	}

}
