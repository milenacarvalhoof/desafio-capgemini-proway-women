package br.com.capgemini.desafio;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	static List<Anuncio> listaAnuncio = new ArrayList<Anuncio>();
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner ler = new Scanner(System.in);
				
		boolean isEnable = true;
		final Anuncio anuncioBuilder = new Anuncio();
		
		while (isEnable) {			
			Anuncio novoAnuncio = anuncioBuilder.cadastrarAnuncio();
			
			listaAnuncio.add(novoAnuncio);
			
			System.out.println("\nDeseja cadastrar um novo anuncio (S/N)?");
			String resp = ler.nextLine();
			
			if (resp.equalsIgnoreCase("N")) {
				isEnable = false;
			}
		}
		
							
		for (Anuncio anuncio : listaAnuncio) {
			Calculadora calculadora = new Calculadora();
			
			Integer qtdeDias = calculadora.calculaQuantidadeDias(anuncio.getDataInicio(), anuncio.getDataTermino());
							
			Double valorTotalInvestido = calculadora.calculaValorTotalInvestido(anuncio.getValorInvestidoDia(), qtdeDias);
			
			Double totalClics = calculadora.calculaClics(valorTotalInvestido);

			Double totalCompartilhamentos = calculadora.calculaCompartilhamentos(totalClics);
			
			Double alcanceTotal = calculadora.calculaTotalVisualizacao(valorTotalInvestido, totalClics, totalCompartilhamentos);	
			
			System.out.println("\nANUNCIO: " + anuncio.getNomeAnuncio() + " - " + "CLIENTE: " + anuncio.getNomeCliente());
					
			System.out.printf("Valor total investido: R$ %.2f\n", valorTotalInvestido);
			System.out.printf("Quantidade máxima de visualizações: %.0f\n", alcanceTotal);
			System.out.printf("Quantidade máxima de cliques: %.0f\n", totalClics);
			System.out.printf("Quantidade máxima de compartilhamentos: %.0f\n", totalCompartilhamentos);
			
			System.out.println("--------------------------------------------------------------------------");
		}	
		
		ler.close();		
	}
	
}
