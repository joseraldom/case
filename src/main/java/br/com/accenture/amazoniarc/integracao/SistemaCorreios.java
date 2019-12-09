package br.com.accenture.amazoniarc.integracao;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class SistemaCorreios {
	
	
	public ServicoCalculadoraCorreios consultaCep(String sCepDestino, String nCdServico) {
		StringBuilder textView = new StringBuilder();
		HttpClient httpClient = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet("http://ws.correios.com.br/calculador/CalcPrecoPrazo.aspx?sCepOrigem=04094-050&sCepDestino=" + sCepDestino + "&nVlPeso=0.3&nVlComprimento=30&nVlAltura=2&nVlLargura=15&nVlDiametro=0.0&nCdFormato=1&sCdMaoPropria=N&sCdAvisoRecebimento=N&nVlValorDeclarado=0,00&nCdServico=" + nCdServico + "&nCdEmpresa=&sDsSenha=&StrRetorno=xml");
		HttpResponse response;
		
		// Get the response
		BufferedReader rd;
		try {
			response = httpClient.execute(request);
			
			rd = new BufferedReader (new InputStreamReader (response.getEntity().getContent()));
			
			String line = "";
			while ((line = rd.readLine()) != null) {
				textView.append(line);
			}
			
			JAXBContext jaxbContext = JAXBContext.newInstance(ServicoCalculadoraCorreios.class);
			 
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		    
		    InputStream stream = new ByteArrayInputStream(textView.toString().getBytes(StandardCharsets.UTF_8));
		    ServicoCalculadoraCorreios scc = (ServicoCalculadoraCorreios) jaxbUnmarshaller.unmarshal(stream);
		    
		    return scc;
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
