package br.com.accenture.amazoniarc;

import java.math.BigDecimal;

import br.com.accenture.amazoniarc.domain.Carrinho;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void test1ProdutoSemDesconto()
    {
    	Carrinho c = new Carrinho();
    	c.setFrete(new BigDecimal(10));
    	assertEquals(new BigDecimal(10).doubleValue(), c.getFrete().doubleValue());
    }
    
    public void test1ProdutoComDesconto()
    {
    	Carrinho c = new Carrinho();
    	c.setFrete(new BigDecimal(10));
    	assertEquals(new BigDecimal(10).doubleValue(), c.getFrete().doubleValue());
    }
}
