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
	protected boolean temBateria;
	protected boolean estaOnfarol;

	public Veiculo(String nomeModelo, String marca, String cor, String embreagem, String tipoCombustivel,
			String anoFabricacao, int velocidade, int maxVelocidade, double combustivel, double peso,
			boolean estaLigado, boolean temBateria, boolean estaOnfarol) throws ParseException {

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
		this.temBateria = true;
		this.estaOnfarol = false;
	}

	public void encherTanque(int quantidade) {
		this.combustivel += quantidade;
	}

	public boolean TurnOn() {
		if (this.estaLigado == false && this.temBateria == true) {
			this.estaLigado = true;
			return true;
		} else {
			return false;
		}
	}

	public boolean TurnOff() {
		if (this.estaLigado == true && this.temBateria == true) {
			this.estaLigado = false;
			return true;
		} else {
			return false;
		}
	}

	public int Velocidade(int velocidadeNova) {
		if (TurnOn() == true) {
			return Velocidade(velocidadeNova);
		}

		if (this.maxVelocidade > this.velocidade) {
			this.velocidade = this.velocidade + velocidadeNova;
			return Velocidade(velocidadeNova);
		} else {
			if (this.maxVelocidade < this.velocidade) {
				
				return this.velocidade = this.maxVelocidade;
			}
			return this.velocidade;
		}

	}

	public void Desacelerar(int valorDaDesacelerar) {
		if (TurnOn() && this.velocidade > 0) {
			this.velocidade -= valorDaDesacelerar;
		}
	}

	public void Frear() {
		if (TurnOn() && this.velocidade > 0) {
			this.velocidade = 0;
		}
	}

	public abstract void Buzina();

	public abstract void ShowVeiculosStatus();

}
