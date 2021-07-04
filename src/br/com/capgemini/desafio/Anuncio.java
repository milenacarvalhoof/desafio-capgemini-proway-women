package br.com.capgemini.desafio;

import java.util.Scanner;

public class Anuncio {
	
	private String nomeAnuncio;
	private String nomeCliente;
	private String dataInicio;
	private String dataTermino;
	private Double valorInvestidoDia;
	
	public Anuncio() {}
	
	public Anuncio(String nomeAnuncio, String nomeCliente, String dataInicio, String dataTermino,
			Double valorInvestidoDia) {
		super();
		this.nomeAnuncio = nomeAnuncio;
		this.nomeCliente = nomeCliente;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.valorInvestidoDia = valorInvestidoDia;
	}
	
	public Anuncio cadastrarAnuncio() {
		Scanner ler = new Scanner(System.in);
		
		Anuncio novoAnuncio = new Anuncio();
		System.out.print("Informe o nome do anúncio: ");
		novoAnuncio.setNomeAnuncio(ler.nextLine());
		System.out.print("Informe o nome do cliente: ");
		novoAnuncio.setNomeCliente(ler.nextLine());
		System.out.print("Informe a data de início (DD/MM/AAAA): ");
		novoAnuncio.setDataInicio(ler.nextLine());
		System.out.print("Informe a data de término (DD/MM/AAAA): ");
		novoAnuncio.setDataTermino(ler.nextLine());
		System.out.print("Informe o valor a ser investido por dia: ");
		novoAnuncio.setValorInvestidoDia(ler.nextDouble());
		
		return novoAnuncio;	
	}
	
	public String getNomeAnuncio() {
		return nomeAnuncio;
	}
	
	public void setNomeAnuncio(String nomeAnuncio) {
		this.nomeAnuncio = nomeAnuncio;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public String getDataTermino() {
		return dataTermino;
	}
	
	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
	
	public Double getValorInvestidoDia() {
		return valorInvestidoDia;
	}
	
	public void setValorInvestidoDia(Double valorInvestidoDia) {
		this.valorInvestidoDia = valorInvestidoDia;
	}
	
}
