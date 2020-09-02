package views;

import dao.NotasDAO;
import model.Nota;

public class Exercicio2 {

	private static ViagemDAO vd = new NotasDAO();
	
	public static void main(String[] args) {
    
		for(Nota v: vd.openEntrada()) {
			System.out.print(v.toString());
		}
		
		vd.saveSaida(vd.openEntrada());
	}

}
