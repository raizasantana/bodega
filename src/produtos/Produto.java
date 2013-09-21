package produtos;

import java.sql.Date;

public class Produto {

	private String descricao;
	private Date validade;
	private String marca;
	private float precoUnitario;
	private String categoria;
	
	public Produto(String d, Date v, String m, float pu,String cat){
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
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	

}
