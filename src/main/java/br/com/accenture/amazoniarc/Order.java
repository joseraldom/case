package br.com.accenture.amazoniarc;

import java.util.List;

import br.com.accenture.amazoniarc.domain.Carrinho;
import br.com.accenture.amazoniarc.domain.ItemVenda;

public class Order {
	
	private Long id;
	private Carrinho carrinho;
	private String cep;
	private String codigoCep;
	
	public void preparaCarrinho(List<ItemVenda> itensVenda) {
		carrinho = new Carrinho();
		for (ItemVenda itemVenda : itensVenda) {
			carrinho.aplicarDesconto(itemVenda);
			carrinho.calcularFrete(itemVenda, cep, codigoCep);
			carrinho.aplicaIsensaoImposto(itemVenda);
			
		}
	}
	
	public void emailConfiramcao() {
		
	}

}
