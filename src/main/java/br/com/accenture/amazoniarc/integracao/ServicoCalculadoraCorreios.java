package br.com.accenture.amazoniarc.integracao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Servicos")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ServicoCalculadoraCorreios implements Serializable {
	
	@XmlElement
	private ResponseCalculadorCorreios cServico;
	
	public ServicoCalculadoraCorreios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServicoCalculadoraCorreios(ResponseCalculadorCorreios cServico) {
		super();
		this.cServico = cServico;
	}

	public ResponseCalculadorCorreios getcServico() {
		return cServico;
	}

	public void setcServico(ResponseCalculadorCorreios cServico) {
		this.cServico = cServico;
	}

}
