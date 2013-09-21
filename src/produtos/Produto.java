package produtos;

import java.sql.Date;

public class Produto {

	private String descricao;
	private String validade;
	private String marca;
	private double precoUnitario;
	private String categoria;
	
	public Produto(){
		
	}
	public Produto(String d, String v, String m, double pu,String cat){
		this.setDescricao(d);
		this.setValidade(v);
		this.setMarca(m);
		this.setPrecoUnitario(pu);
		this.setCategoria(cat);
	}
	//Polimorfismo
	public void exibeCategoria(){
		System.out.println("Categoria dos produtos:\nBedidas: Alcoólica / Não alcoólica \nComida: Perecível / Não perecível");
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	

}
