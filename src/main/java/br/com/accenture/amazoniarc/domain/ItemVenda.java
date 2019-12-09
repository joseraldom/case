package br.com.accenture.amazoniarc.domain;

import java.math.BigDecimal;

public class ItemVenda {
	
	private Long id;
	private Produto produto;
	private BigDecimal valor;
	private BigDecimal desconto;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}
	
	public BigDecimal getValorLiquido() {
		return desconto != null ? valor.subtract(desconto) : valor;
	}

}
