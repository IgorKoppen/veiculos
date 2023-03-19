package br.com.fiap;

import java.text.ParseException;

public final class Moto extends Veiculo{
	private boolean temArmazenamento;

	public Moto(String nomeModelo, String marca, String cor, String cambio, String tipoCombustivel,
			String anoFabricacao, int velocidade, int maxVelocidade, double combustivel, double peso,
			boolean estaLigado, boolean temBateria, boolean estaOnfarol, boolean setaEsqOn, boolean setaDirOn,
			int numeroDeRodas, boolean temArmazenamento) throws ParseException {
		super(nomeModelo, marca, cor, cambio, tipoCombustivel, anoFabricacao, velocidade, maxVelocidade,
				combustivel, peso, estaLigado, temBateria, estaOnfarol, numeroDeRodas);
		this.temArmazenamento = temArmazenamento;
	}

	@Override
	public void Frear() {
		if (TurnOn() == true && this.velocidade > 0) {
			this.velocidade = 0;
			this.InformacoesConsole();
		}
	}

	@Override
	public void Buzina() {
		System.out.println("Buz Buz");
		System.out.println();
	}

	@Override
	public void FichaTecnica() {
		System.out.println("Modelo: " + this.nomeModelo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tipo do cambio: " + this.cambio);
		System.out.println("Ano de fabriacao: " + this.anoFabricacao);
		System.out.println("Tipo Combustivel: " + this.tipoCombustivel);
		System.out.println("Peso: " + this.peso + "Kg");
		System.out.println("Numero de rodas: " + this.numeroDeRodas);
		System.out.println("Moto tem espaço para armazenamento?: " + (temArmazenamento == true ? "Sim" : "Nao"));
		System.out.println();
	}

	@Override
	public void InformacoesConsole() {
		System.out.println("Combustivel Atual: " + this.combustivel );
		System.out.println("Velocidade atual: " + this.velocidade + "Km/h");
		System.out.println("Estado da seta esquerda: " + (setaEsqOn == true ? "Seta esquerda ligada!" : "Seta esquerda desligada!" ));
		System.out.println("Estado da seta direita: " + (setaDirOn == true ? "Seta direita ligada!" : "Seta direita desligada!" ));
		System.out.println("Estado do Farol: " + (estaOnfarol == true ? "Farol Ligado!" : "Farol Desligado!" ));
		System.out.println();
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		
	}

}
