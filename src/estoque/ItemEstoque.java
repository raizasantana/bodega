package estoque;

import produtos.Produto;

public class ItemEstoque {
	
	public Produto produto;
	public int quantidade;
	public String sessao;
	
	public ItemEstoque(Produto p, int q, String s){
		this.setProduto(p);
		this.setQuantidade(q);
		this.setSessao(s);		
	}
	
	public void imprimeQtd(ItemEstoque i){
		System.out.println("Produto: "+i.getProduto().getDescricao()+" Quantidade em estoque: "+i.getQuantidade());
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getSessao() {
		return sessao;
	}
	public void setSessao(String sessao) {
		this.sessao = sessao;
	}
	
	
	

}
