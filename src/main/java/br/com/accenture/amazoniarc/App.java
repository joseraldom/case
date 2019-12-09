package br.com.accenture.amazoniarc;

import java.math.BigDecimal;

import br.com.accenture.amazoniarc.integracao.SistemaCorreios;

/**
 * Hello world!
 *
 */
public class App 
{
	public static BigDecimal valor;
	public static BigDecimal imposto;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SistemaCorreios sc = new SistemaCorreios();
        sc.consultaCep("53030-620", "04510");
    }
    
    
	
}
