package br.com.fiap;

import java.util.Date;

public abstract class Veiculo {
	
  protected String marca;
  protected Date anofabricacao;
  protected String cor;
  protected int velocidade;
  protected Boolean ligado;
  protected float peso;
  
public Veiculo(String marca, Date anofabricacao, String cor, int velocidade, Boolean ligado, float peso) {
	this.marca = marca;
	this.anofabricacao = anofabricacao;
	this.cor = cor;
	this.velocidade = 0;
	this.ligado = false;
}





  
  
  
}
