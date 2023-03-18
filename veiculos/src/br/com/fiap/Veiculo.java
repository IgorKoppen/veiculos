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
	protected boolean aberta;
    protected int posicao;

	public Veiculo(String nomeModelo, String marca, String cor, String embreagem, String tipoCombustivel,
			String anoFabricacao, int velocidade, int maxVelocidade, double combustivel, double peso,
			boolean estaLigado, boolean temBateria, boolean estaOnfarol) throws ParseException {

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");  // instancia o formato das datas
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
		this.aberta = false;
		this.posicao = 0;
	}

	public Object EncherTanque(double quantidade) {    // funçao encher tanque
		if (TurnOff() == false) {
			return EncherTanque(quantidade);
		}
		this.combustivel += quantidade;
		return quantidade;
	}

	public boolean TurnOff() {                 // funcao desligar carro
		if (this.estaLigado == true && this.temBateria == true) {
			this.estaLigado = false;
			this.velocidade = 0;
			this.DesligarFarol();
			System.out.println("Desligou");
			return false;
		}
		return true;
	}

	public void LigarFarol() {           // funcao ligar o farol
		if (this.temBateria == true)
			this.estaOnfarol = true;
	}

	public void DesligarFarol() {           // funcao desligar o farol
		this.estaOnfarol = false;
	}

	public boolean TurnOn() {              // funcao ligar o carro
		if (this.estaLigado == false && this.temBateria == true) {
			this.estaLigado = true;
			System.out.println("Ligou o veiculo: " +  this.nomeModelo);
			return false;
		}
		return true;
	}

	public boolean Acelerar(int velocidadeNova) {          // funcao para acelerar
		if (this.TurnOn() == false) {
			return this.Acelerar(velocidadeNova);
		}
		if (this.velocidade + velocidadeNova > this.maxVelocidade) {
			return false;
		}
		if (this.combustivel >= 20) {
			this.velocidade += velocidadeNova;
			this.InformacoesConsole();
			System.out.println();
		}
		return true;
	}

	public boolean Desacelerar(int valorDaDesacelerar) {       // funcao para desacelerar o carro
		if (this.velocidade - valorDaDesacelerar < 0) {
			return false;
		}

		if (TurnOn() == true && this.velocidade > 0) {
			this.velocidade -= valorDaDesacelerar;
			this.InformacoesConsole();
			System.out.println();
			
			return true;
		}
		return false;
	}

	   public void abrir() throws Exception {
	       if (posicao < 0 || posicao > 100) {
	            throw new Exception("Posição inválida");
	        }
	        aberta = true;
	        posicao += 10;
	    }

	    public void fechar() throws Exception {
	        if (posicao < 0 || posicao > 100) {
	            throw new Exception("Posição inválida");
	        }
	        aberta = false;
	        posicao -= 10;
	    }

	    public boolean estaAberta() {
	        return aberta;
	    }

	    public int getPosicao() {
	        return posicao;
	    }
	

	public abstract void Frear();

	public abstract void Buzina();

	public abstract void FichaTecnica();
	
	public abstract void InformacoesConsole();

}
