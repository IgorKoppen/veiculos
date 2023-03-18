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

	public Object EncherTanque(double quantidade) {
		if (TurnOff() == false) {
			return EncherTanque(quantidade);
		}
		this.combustivel += quantidade;
		return quantidade;
	}

	public boolean TurnOff() {
		if (this.estaLigado == true && this.temBateria == true) {
			this.estaLigado = false;
			this.velocidade = 0;
			this.DesligarFarol();
			System.out.println("Desligou");
			return false;
		}
		return true;
	}

	public void LigarFarol() {
		if (this.temBateria == true)
			this.estaOnfarol = true;
	}

	public void DesligarFarol() {
		this.estaOnfarol = false;
	}

	public boolean TurnOn() {
		if (this.estaLigado == false && this.temBateria == true) {
			this.estaLigado = true;
			System.out.println("Ligou o veiculo: " +  this.nomeModelo);
			return false;
		}
		return true;
	}

	public boolean Acelerar(int velocidadeNova) {
		if (this.TurnOn() == false) {
			return this.Acelerar(velocidadeNova);
		}
		if (this.velocidade + velocidadeNova > this.maxVelocidade) {
			return false;
		}
		if (this.combustivel >= 20) {
			this.velocidade += velocidadeNova;
			this.InformaçõesConsole();
			System.out.println();
		}
		return true;
	}

	public boolean Desacelerar(int valorDaDesacelerar) {
		if (this.velocidade - valorDaDesacelerar < 0) {
			return false;
		}

		if (TurnOn() == true && this.velocidade > 0) {
			this.velocidade -= valorDaDesacelerar;
			this.InformaçõesConsole();
			System.out.println();
			
			return true;
		}
		return false;
	}

	public abstract void Frear();

	public abstract void Buzina();

	public abstract void FichaTecnica();
	
	public abstract void InformaçõesConsole();

}
