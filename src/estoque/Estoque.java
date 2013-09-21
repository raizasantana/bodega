package estoque;

import java.util.ArrayList;

import produtos.Produto;

public class Estoque {

	ArrayList<ItemEstoque> itens = new ArrayList<ItemEstoque>();
	
	public Estoque(ArrayList<ItemEstoque> i){
		this.setItens(i);
	}
	
	public void addItem(ItemEstoque ie){
		itens.add(ie);
	}
	public void removeItem(Produto p, int qtd){
		for (ItemEstoque ie : itens) {
			if(ie.getProduto().equals(p)){
				ie.setQuantidade(ie.getQuantidade() - qtd);
				System.out.println("Produto encontrado.");
				return;
			}
		}
		System.out.println("Produto não encontrado.");
		
	}
	public void listaItensEstoque(){
		System.out.println("\n::Lista de Itens::");
		for (ItemEstoque itemEstoque : itens)
			System.out.println("Descrição: "+itemEstoque.getProduto().getDescricao()+" Quantidade: "+itemEstoque.getQuantidade()+" Sessão: "+itemEstoque.getSessao());
	}

	public ArrayList<ItemEstoque> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemEstoque> itens) {
		this.itens = itens;
	}
	
}
