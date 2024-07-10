package projetoPlataformaDeViagens;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Leitura {
	public List<String[]> lerArquivoCSV(String caminhoArquivo) throws IOException{
		List<String[]> dados = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){
			String linha;
			while((linha = br.readLine())!=null) {
				String[] valores = linha.split(";");
				dados.add(valores);
			}
		}
		return dados;
	}
	
	public List<Cliente> lerClientes(String caminhoArquivo) throws IOException{
		List<Cliente> clientes = new ArrayList<>();
		List<String[]> dados = lerArquivoCSV(caminhoArquivo);
		for(String[] valores:dados) {
			Cliente cliente = new Cliente(valores[0],valores[1],valores[2],Integer.parseInt(valores[3].replaceAll("[^0-9.,]", "").replace(",", ".")),Integer.parseInt(valores[4].replaceAll("[^0-9,.]", "").replace(",", ".")),Double.parseDouble(valores[5].replaceAll("[^0-9,.]", "").replace(",", ".")));
			clientes.add(cliente);
		}
		return clientes;
	}
	
	public List<Hotel> lerHoteis(String caminhoArquivo) throws IOException{
		List<Hotel> hoteis = new ArrayList<>();
		List<String[]> dados = lerArquivoCSV(caminhoArquivo);
		for(String[] valores:dados) {
			Hotel hotel = new Hotel(valores[0],valores[1],Integer.parseInt(valores[2].replaceAll("[^0-9,.]","")),Double.parseDouble(valores[3].replaceAll("[^0-9,.]","").replace(",",".")),Integer.parseInt(valores[4].replaceAll("[^0-9,.]","")));
			hoteis.add(hotel);
		}
		return hoteis;
	}
	
	public List<Voo> lerVoos(String caminhoArquivo) throws IOException{
		List<Voo> voos = new ArrayList<>();
		List<String[]> dados = lerArquivoCSV(caminhoArquivo);
		for(String[] valores:dados) {
			Voo voo = new Voo(valores[0],valores[1],valores[2],valores[3],Integer.parseInt(valores[4].replaceAll("[^0-9,.]", "")),Double.parseDouble(valores[5].replaceAll("[^0-9,.]","").replace(",",".")));
			voos.add(voo);
		}
		return voos;
	}

}
