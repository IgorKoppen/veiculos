package br.com.fiap;

import java.text.ParseException;

public final class Carro extends Veiculo {

	public Carro(String nomeModelo, String marca, String cor, String embreagem, String tipoCombustivel,
			String anoFabricacao, int velocidade, int maxVelocidade, double combustivel, double peso,
			boolean estaLigado, boolean temBateria, boolean estaOnfarol) throws ParseException {
		super(nomeModelo, marca, cor, embreagem, tipoCombustivel, anoFabricacao, velocidade, maxVelocidade, combustivel,
				peso, estaLigado, temBateria, estaOnfarol);

	}

	@Override
	public void ShowVeiculosStatus() {
		System.out.println("Modelo:" + this.nomeModelo);
		System.out.println("Marca:" + this.marca);
		System.out.println("Cor:" + this.cor);
		System.out.println("Embreagem:" + this.embreagem);
		System.out.println("Ano de fabriaçao:" + this.anoFabricacao);
		System.out.println("tipo Combustivel:" + this.tipoCombustivel);
		System.out.println("Velocidade atual:" + this.velocidade);
		System.out.println();
	}

	@Override
	public void Buzina() {
		System.out.println("Buz Buz");
	}

}
