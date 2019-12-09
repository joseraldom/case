package br.com.accenture.amazoniarc;

import java.util.List;

import br.com.accenture.amazoniarc.domain.Carrinho;
import br.com.accenture.amazoniarc.domain.ItemVenda;

public class Order {
	
	private Long id;
	private List<ItemVenda> listaItens;
	private Carrinho carrinho;

}
