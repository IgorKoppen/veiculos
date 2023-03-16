package br.com.fiap;

import java.text.ParseException;

public final class Caminhao extends Veiculo {
	private String tipoDeCabine;
	private String cargaMaxima;

	public Caminhao(String nomeModelo, String marca, String cor, String embreagem, String tipoCombustivel,
			String anoFabricacao, int velocidade, int maxVelocidade, double combustivel, double peso,
			boolean estaLigado, boolean temBateria, boolean estaOnfarol, String tipoDeCabine, String cargaMaxima)
			throws ParseException {
		super(nomeModelo, marca, cor, embreagem, tipoCombustivel, anoFabricacao, velocidade, maxVelocidade, combustivel,
				peso, estaLigado, temBateria, estaOnfarol);
		this.tipoDeCabine = tipoDeCabine;
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public void ShowVeiculosStatus() {
		System.out.println("Modelo:" + this.nomeModelo);
		System.out.println("Marca:" + this.marca);
		System.out.println("Cor:" + this.cor);
		System.out.println("Embreagem:" + this.embreagem);
		System.out.println("Ano de fabriaçao:" + this.anoFabricacao);
		System.out.println("tipo Combustivel:" + this.tipoCombustivel);
		System.out.println("tipo tipo de cabine:" + this.tipoDeCabine);
		System.out.println("Carga Maxima:" + this.cargaMaxima);
		System.out.println();
	}

	@Override
	public void Buzina() {
		if (this.estaLigado) {
			System.out.println("Bez Bez");
		}

	}

}
