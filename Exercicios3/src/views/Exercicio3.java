package views;

import dao.DadosDAO;
import model.Dados;

public class Exercicio3 {


	
	private static DadosDAO dd = new DadosDAO();
	
	public static void main(String[] args) {
	
		
		
		for(Dados d: dd.openEntrada()) {
			
			System.out.println(d.toString());
			
		}
		
		dd.saveSaida(dd.openEntrada());
	}

}