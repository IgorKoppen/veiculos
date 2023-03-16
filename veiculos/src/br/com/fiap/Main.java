package br.com.fiap;

import java.text.ParseException;

public class Main {

	public static void main(String[] args) {
		try {

			Carro carro1 = new Carro("C40", "volvo", "cinza fosco", "automatico", "eletrico", "20/10/2019", 0, 300, 0.2,
					50.1, false, true, false);
			Caminhao caminhao1 = new Caminhao("FH", "volvo", "rosa", "automatico", "Gasolina", "20/10/2018", 0, 300,
					0.2, 50.1, false, true, false, "s", "s");

			carro1.encherTanque(100);
			
			carro1.Desacelerar(300);
			carro1.ShowVeiculosStatus();

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
