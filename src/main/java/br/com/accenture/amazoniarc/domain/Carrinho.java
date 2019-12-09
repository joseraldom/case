package br.com.accenture.amazoniarc.domain;

import java.math.BigDecimal;
import java.util.List;

import br.com.accenture.amazoniarc.CupomDesconto;

public class Carrinho {
	
	private Long id;
	private CupomDesconto cupomDesconto;
	private BigDecimal valorCarrinho;
	private BigDecimal frete;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CupomDesconto getCupomDesconto() {
		return cupomDesconto;
	}
	public void setCupomDesconto(CupomDesconto cupomDesconto) {
		this.cupomDesconto = cupomDesconto;
	}
	public BigDecimal getValorCarrinho() {
		return valorCarrinho;
	}
	public void setValorCarrinho(BigDecimal valorCarrinho) {
		this.valorCarrinho = valorCarrinho;
	}
	public BigDecimal getFrete() {
		return frete;
	}
	public void setFrete(BigDecimal frete) {
		this.frete = frete;
	}
	
	public void preparaCarrinho(List<ItemVenda> itensVenda) {
		for (ItemVenda itemVenda : itensVenda) {
			aplicarDesconto(itemVenda);
			calcularFrete(itemVenda);
			aplicaIsensaoImposto(itemVenda);
			
		}
	}
	
	private void aplicaIsensaoImposto(ItemVenda itemVenda) {
		if ("livro".equals(itemVenda.getProduto().getFormato()) ||
			"jornal".equals(itemVenda.getProduto().getFormato()) ||	
			"revista".equals(itemVenda.getProduto().getFormato()) ||
			"eReader".equals(itemVenda.getProduto().getFormato())) {
			itemVenda.getProduto().setImposto(new BigDecimal(0));
		}
	}
	private void calcularFrete(ItemVenda itemVenda) {
		// TODO Auto-generated method stub
		
	}
	private void aplicarDesconto(ItemVenda itemVenda) {
		if (cupomDesconto != null && cupomDesconto.isValido() && itemVenda.getProduto().isPromocao()) {
			itemVenda.setDesconto(cupomDesconto.getValor());
		}
		valorCarrinho.add(itemVenda.getValorLiquido());
	}

}
