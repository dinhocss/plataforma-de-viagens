package projetoPlataformaDeViagens;


public class Hotel {
	private String cidade;
	private String nomeHotel;
	private int qtdeVagas;
	private double diaria;
	private int numEstrelas;
	
	public Hotel(String cidade, String nomeHotel, int qtdeVagas, double diaria, int numEstrelas) {
		this.cidade = cidade;
		this.nomeHotel = nomeHotel;
		this.qtdeVagas = qtdeVagas;
		this.diaria = diaria;
		this.numEstrelas = numEstrelas;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getNomeHotel() {
		return nomeHotel;
	}
	
	public int getQtdeVagas() {
		return qtdeVagas;
	}
	
	public double getDiaria() {
		return diaria;
	}
	
	public int getNumEstrelas() {
		return numEstrelas;
	}
	
	public String toString() {
		return String.format("%n%s(%d estrelas)%n%s%nDiaria:R$%.2f%n%d vagas",nomeHotel,numEstrelas,cidade,diaria,qtdeVagas);
	}

}
