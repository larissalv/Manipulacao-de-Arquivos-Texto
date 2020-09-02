package model;

public class Viagem {
	
	private String origem;
	private int distancia;
	private String destino;
	private String velocidade;
	
	public String getOrigem() {
		return origem;
	}


	public void setOrigem(String origem) {
		this.origem = origem;
	}


	public int getDistancia() {
		return distancia;
	}


	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}


	public String toTXT() {
		
		return "Origem: "+origem+" Destino: "+destino+" tempo: "+ "(distancia/velocidade)"+ "\r\n";
	}
	
	
}