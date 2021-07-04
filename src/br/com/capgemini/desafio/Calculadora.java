package br.com.capgemini.desafio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Calculadora {
		
	/**
	 * 	Método para calcular a quantidade de dias entre duas datas.
	 * @param dataInicio
	 * @param dataTermino
	 * @return
	 */
	public Integer calculaQuantidadeDias(String dataInicio, String dataTermino ) {
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
			
		try {
		    Date date1 = myFormat.parse(dataInicio);
		    Date date2 = myFormat.parse(dataTermino);
		    Long qtdeDias = date2.getTime() - date1.getTime();
			    
		    Long retorno = TimeUnit.DAYS.convert(qtdeDias, TimeUnit.MILLISECONDS);
		    
		    return retorno.intValue();
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		return null;
	}
		
	/**
	 * Método para calcular o valor total investido.
	 * @param investimentoDia
	 * @param qtdeDias
	 * @return
	 */
	public Double calculaValorTotalInvestido(Double investimentoDia, Integer qtdeDias) {
		Double investimentoTotal;
		
		investimentoTotal = investimentoDia * qtdeDias;
		
		return investimentoTotal;
			
	}
		
	/**
	 * Método para calcular a quantidade aproximada de clics.
	 * @param investimento
	 * @return
	 */
	public Double calculaClics(Double investimento) {
		Double alcanceAnuncioOriginal, clics;
			
		alcanceAnuncioOriginal = investimento * 30;
	    clics = (alcanceAnuncioOriginal / 100) * 12;
	    
	    return clics;
	}
		
	/**
	 * Método para calcular a quantidade aproximada de compartilhamentos.
	 * @param clics
	 * @return
	 */
	public Double calculaCompartilhamentos(Double clics) {
		Double compartilhamentos;
			
		compartilhamentos = clics / 20 * 3;
			
		return compartilhamentos;		
	}
		
	/**
	 * Método para calcular a quantidade total de alcance/visualização.
	 * @param investimento
	 * @param clics
	 * @param compartilhamentos
	 * @return
	 */
	public Double calculaTotalVisualizacao(Double investimento, Double clics, Double compartilhamentos) {
		Double alcanceAnunOrig, alcanceTotal;		    
	    	    	    
	    alcanceAnunOrig = investimento * 30;
	    
	    alcanceTotal = compartilhamentos * 40 + alcanceAnunOrig;
	    
	    return alcanceTotal;
	}
}
