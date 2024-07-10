package projetoPlataformaDeViagens;

public class Voo {
	private String origem;
	private String destino;
	private String data;
	private String hora;
	private int assentos;
	private double valor;
	
	public Voo(String origem, String destino, String data, String hora,int assentos,double valor) {
		this.origem = origem;
		this.destino = destino;
		this.data = data;
		this.hora = hora;
		this.assentos = assentos;
		this.valor = valor;
	}
	
	public String getOrigem() {
		return origem;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public String getData() {
		return data;
	}
	
	public String getHora() {
		return hora;
	}
	
	public int getAssentos() {
		return assentos;
	}
	
	public double getValor() {
		return valor;
	}
	
	public String toString() {
		return String.format("%n%s->%s%n%s - %s%n%d assentos disponíveis%n%.2f",origem,destino,data,hora,assentos,valor);
	}

}
