package produtos;

import java.sql.Date;

public class Comida extends Produto{
	
	private float quilos;
	
	
	public Comida(String d, Date v, String m, float pu,String cat) {
		super(d, v, m, pu,cat);
		// TODO Auto-generated constructor stub
	}

	public float getQuilos() {
		return quilos;
	}

	public void setQuilos(float quilos) {
		this.quilos = quilos;
	}
	
	//Polimorfismo
	@Override
	public void exibeCategoria() {
		System.out.println("Categoria Comida: Perecível e Não perecível.");
	}
	
}
