package br.com.capgemini.desafio;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o nome do an�ncio: ");
		String nomeAnuncio = ler.nextLine();
				
		System.out.print("Informe o nome do cliente: ");
		String nomeCliente = ler.nextLine();
				
		System.out.print("Informe a data de in�cio (DD/MM/AAAA): ");
		String dataInicio = ler.nextLine();
		
		System.out.print("Informe a data de t�rmino (DD/MM/AAAA): ");
		String dataTermino = ler.nextLine();
		
		System.out.print("Informe o valor a ser investido por dia: ");
		Double valorInvestidoDia = ler.nextDouble();
						
		Calculadora calculadora = new Calculadora();
		
		Long qtdeDias = calculadora.calculaQuantidadeDias(dataInicio, dataTermino);
						
		Double valorTotalInvestido = calculadora.calculaValorTotalInvestido(valorInvestidoDia, qtdeDias);
		
		Double totalClics = calculadora.calculaClics(valorTotalInvestido);

		Double totalCompartilhamentos = calculadora.calculaCompartilhamentos(totalClics);
		
		Double alcanceTotal = calculadora.calculaTotalVisualizacao(valorTotalInvestido, totalClics, totalCompartilhamentos);	
		
		System.out.println("\nANUNCIO: " + nomeAnuncio + " - " + "CLIENTE: " + nomeCliente);
				
		System.out.printf("Valor total investido: R$ %.2f\n", valorTotalInvestido);
		System.out.printf("Quantidade m�xima de visualiza��es: %.0f\n", alcanceTotal);
		System.out.printf("Quantidade m�xima de cliques: %.0f\n", totalClics);
		System.out.printf("Quantidade m�xima de compartilhamentos: %.0f\n", totalCompartilhamentos);
		
		ler.close();
		
	}
}
