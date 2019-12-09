package br.com.accenture.amazoniarc.integracao;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cServico")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ResponseCalculadorCorreios implements Serializable {
	
	@XmlElement(name = "Codigo")
	private String codigo;
	@XmlElement(name = "Valor")
	private String valor;
	@XmlElement(name = "PrazoEntrega")
	private String prazoEntrega;
	@XmlElement(name = "ValorSemAdicionais")
	private String valorSemAdicionais;
	@XmlElement(name = "ValorMaoPropria")
	private String valorMaoPropria;
	@XmlElement(name = "ValorAvisoRecebimento")
	private String valorAvisoRecebimento;
	@XmlElement(name = "ValorValorDeclarado")
	private String valorValorDeclarado;
	@XmlElement(name = "EntregaDomiciliar")
	private String entregaDomiciliar;
	@XmlElement(name = "EntregaSabado")
	private String entregaSabado;
	@XmlElement(name = "EntregaSabado")
	private String obsFim;
	@XmlElement(name = "Erro")
	private String erro;
	@XmlElement(name = "MsgErro")
	private String msgErro;
	
	public ResponseCalculadorCorreios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseCalculadorCorreios(String codigo, String valor, String prazoEntrega, String valorSemAdicionais,
			String valorMaoPropria, String valorAvisoRecebimento, String valorValorDeclarado, String entregaDomiciliar,
			String entregaSabado, String obsFim, String erro, String msgErro) {
		this.codigo = codigo;
		this.valor = valor;
		this.prazoEntrega = prazoEntrega;
		this.valorSemAdicionais = valorSemAdicionais;
		this.valorMaoPropria = valorMaoPropria;
		this.valorAvisoRecebimento = valorAvisoRecebimento;
		this.valorValorDeclarado = valorValorDeclarado;
		this.entregaDomiciliar = entregaDomiciliar;
		this.entregaSabado = entregaSabado;
		this.obsFim = obsFim;
		this.erro = erro;
		this.msgErro = msgErro;
	}

	@Override
	public String toString() {
		return "ResponseCalculadorCorreios [codigo=" + codigo + ", valor=" + valor + ", prazoEntrega=" + prazoEntrega
				+ ", valorSemAdicionais=" + valorSemAdicionais + ", valorMaoPropria=" + valorMaoPropria
				+ ", valorAvisoRecebimento=" + valorAvisoRecebimento + ", valorValorDeclarado=" + valorValorDeclarado
				+ ", entregaDomiciliar=" + entregaDomiciliar + ", entregaSabado=" + entregaSabado + ", obsFim=" + obsFim
				+ ", erro=" + erro + ", msgErro=" + msgErro + "]";
	}
}
