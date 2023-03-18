package br.com.fiap;

import java.text.ParseException;

public final class Carro extends Veiculo {
	private int quantidadeDePortas;

	public Carro(String nomeModelo, String marca, String cor, String embreagem, String tipoCombustivel,
			String anoFabricacao, int velocidade, int maxVelocidade, double combustivel, double peso,
			boolean estaLigado, boolean temBateria, boolean estaOnfarol, int quantidadeDePortas) throws ParseException {
		super(nomeModelo, marca, cor, embreagem, tipoCombustivel, anoFabricacao, velocidade, maxVelocidade, combustivel,
				peso, estaLigado, temBateria, estaOnfarol);
		this.quantidadeDePortas = quantidadeDePortas;
	}

	@Override
	public void FichaTecnica() {
		System.out.println("Modelo: " + this.nomeModelo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Embreagem tipo: " + this.embreagem);
		System.out.println("Ano de fabriaçao: " + this.anoFabricacao);
		System.out.println("Tipo Combustivel: " + this.tipoCombustivel);
		System.out.println("Quantidade de portas: " + this.quantidadeDePortas);
		System.out.println("Peso: " + this.peso + "Kg");
		System.out.println();
	}

	@Override
	public void Buzina() {
		System.out.println("Buz Buz");
	}

	@Override
	public void Frear() {
		if (TurnOn() == true && this.velocidade > 0) {
			this.velocidade = 0;
		}
	}

	@Override
	public void InformaçõesConsole() {
		System.out.println("Combustivel Atual: " + this.combustivel );
		System.out.println("Velocidade atual: " + this.velocidade + "Km/h");
		System.out.println("Estado do Farol: " + (estaOnfarol == true ? "Farol Ligado!" : "Farol Desligado!" ));
	}

	

}
