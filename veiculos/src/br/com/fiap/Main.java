package br.com.fiap;

import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws Exception {
		try {

			Carro C40 = new Carro("C40 Recharge", "volvo", "cinza fosco", "automatico", "eletrico", "20/10/2019", 0,
					180, 0, 2207, false, true, false, 4, false, 0, false, false);
			Carro SUVEX90 = new Carro("SUV EX90", "volvo", "preto", "automatico", "eletrico", "14/04/2022", 0, 180, 0,
					2584, false, true, false, 4, false, 0, false, false);
			Carro XC60 = new Carro("XC60", "volvo", "branco", "automatico", "hibrido", "17/08/2021", 0, 180, 0, 2150,
					false, true, false, 4, false, 0, false, false);
			Caminhao FH4x2R = new Caminhao("FH 4x2R", "volvo", "Prata", "automatico", "Diesel", "20/10/2018", 0, 260, 0,
					5100, false, true, false, "Cabine Leito Teto Alto", 13.0, false, 0, false, false);
			Caminhao FM6x2T = new Caminhao("FM 6x2T", "volvo", "azul marinho", "manual", "Diesel", "15/10/2020", 0, 200,
					0, 8565, false, true, false, "Cabine Leito Teto Alto", 27.5, false, 0, false, false);
			Caminhao FMX8x4R = new Caminhao("FMX 8x4 R", "volvo", "amarelo", "automatico", "Eletrico", "15/10/2023", 0,
					245, 0.2, 11808, false, true, false, "Cabine estendida", 52.0, false, 0, false, false);
			FH4x2R.EncherTanque(29);
			FH4x2R.Acelerar(200);
			FH4x2R.Acelerar(50);
			FH4x2R.LigarFarol();
			FH4x2R.LigarSetaDir();
			FH4x2R.Desacelerar(20);
			FH4x2R.DesligarSetaDir();
			FH4x2R.Buzina();
			FH4x2R.abrir();
			FH4x2R.abrir();
			FH4x2R.abrir();
			FH4x2R.fechar();
			
			FH4x2R.InformacoesConsole();

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
