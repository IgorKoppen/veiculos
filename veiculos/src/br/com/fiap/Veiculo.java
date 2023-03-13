package br.com.fiap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Veiculo {

	protected String nomeModelo;
	protected String marca;
	protected String cor;
	protected String embreagem;
	protected String tipoCombustivel;
	protected Date anoFabricacao;
	protected int velocidade;
	protected int maxVelocidade;
	protected double combustivel;
	protected double peso;
	protected boolean estaLigado;
	protected boolean estaOnfarol;

	public Veiculo(String nomeModelo, String marca, String cor, String embreagem, String tipoCombustivel,
			String anoFabricacao, int velocidade, int maxVelocidade, double combustivel, double peso,
			boolean estaLigado, boolean estaOnfarol) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		this.nomeModelo = nomeModelo;
		this.marca = marca;
		this.cor = cor;
		this.embreagem = embreagem;
		this.tipoCombustivel = tipoCombustivel;
		this.anoFabricacao = formato.parse(anoFabricacao);
		this.velocidade = 0;
		this.maxVelocidade = maxVelocidade;
		this.combustivel = 0;
		this.peso = peso;
		this.estaLigado = false;
		this.estaOnfarol = false;
	}

	public void encherTanque(int quantidade) {
		this.combustivel += quantidade;
	}

	public void Ligar() {
		this.estaLigado = true;
	}

	public void Desligar() {
		this.estaLigado = false;
	}

	public void Acelerar(int valorDaAcelera) {

		if (this.combustivel > 0 && this.estaLigado == true && this.velocidade < this.maxVelocidade) {
			this.velocidade += valorDaAcelera;
		} else {
			throw new ImpossivelAcelerar();
		}

	}

	public void Desacelerar(int valorDaDesacelerar) {

		if (this.combustivel > 0 && this.estaLigado == true && this.velocidade < this.maxVelocidade) {
			this.velocidade += valorDaDesacelerar;
		} else {
			throw new ImpossivelAcelerar();
		}

	}

	public void Frear() {

		if (this.combustivel > 0 && this.estaLigado == true && this.velocidade < this.maxVelocidade) {
			this.velocidade = 0;
		}
		
	}

	public abstract void Buzina();
	
	public abstract void ShowVeiculosStatus();

}
