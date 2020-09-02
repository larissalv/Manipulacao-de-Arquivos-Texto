package views;

import dao.NotasDAO;
import model.Nota;

public class Exercicio1 {

	private static NotasDAO nd = new NotasDAO();
	
	public static void main(String[] args) {
    
		for(Nota n: nd.openEntrada()) {
			System.out.print(n.toString());
		}
		
		nd.saveSaida(nd.openEntrada());
	}

}
