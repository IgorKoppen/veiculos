package br.com.fiap;

import java.text.ParseException;

public final class Carro extends Veiculo {
	private int quantidadeDePortas;

	public Carro(String nomeModelo, String marca, String cor, String embreagem, String tipoCombustivel,
			String anoFabricacao, int velocidade, int maxVelocidade, double combustivel, double peso,
			boolean estaLigado, boolean temBateria, boolean estaOnfarol, int quantidadeDePortas, boolean estaAberta, int posicao,
			boolean setaEsqOn, boolean setaDirOn, int numeroDeRodas) throws ParseException {
		super(nomeModelo, marca, cor, embreagem, tipoCombustivel, anoFabricacao, velocidade, maxVelocidade, combustivel,
				peso, estaLigado, temBateria, estaOnfarol, numeroDeRodas);
		this.quantidadeDePortas = quantidadeDePortas;
	}

	@Override
	public void FichaTecnica() {
		System.out.println("Modelo: " + this.nomeModelo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Embreagem tipo: " + this.embreagem);
		System.out.println("Ano de fabriacao: " + this.anoFabricacao);
		System.out.println("Tipo Combustivel: " + this.tipoCombustivel);
		System.out.println("Quantidade de portas: " + this.quantidadeDePortas);
		System.out.println("Peso: " + this.peso + "Kg");
		System.out.println("Numero de rodas: " + this.numeroDeRodas);
		System.out.println();
	}

	@Override
	public void Buzina() {
		System.out.println("Buz Buz");
		System.out.println();
	}

	@Override
	public void Frear() {
		if (TurnOn() == true && this.velocidade > 0) {
			this.velocidade = 0;
			this.InformacoesConsole();
		}
	}
	
	public void abrir() {		// funcao para abrir a janela
		if (this.posicao < 0 || this.posicao > 100) {
			System.out.println("Posicao da janela invalida");
	        System.out.println();
	        }
	     else {
	    	this.aberta = true;
	    	this.posicao += 10;
	    	System.out.println("Janela foi aberta na posição: " + this.posicao + "%");
	    	System.out.println();
	       }
	}

	public void fechar() {		// funcao para fechar a janela
		 if (this.posicao <= 0 || this.posicao > 100) {
			 	System.out.println("Posicao da janela invalida");
			 	System.out.println();
	        }
		 else {
	        this.aberta = false;
	        this.posicao -= 10;
	        System.out.println("Janela foi fechada na posição: " + this.posicao + "%");
	        System.out.println();
		 }
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
}
