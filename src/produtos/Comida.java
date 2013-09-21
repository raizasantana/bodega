package produtos;

import java.sql.Date;

public class Comida extends Produto{
	
	private double quilos;
	
	
	public Comida(String d, String v, String m, double pu, double kg,String cat) {
		super(d, v, m, pu,cat);
		this.setQuilos(kg);
	}

	public double getQuilos() {
		return quilos;
	}

	public void setQuilos(double quilos) {
		this.quilos = quilos;
	}
	
	//Polimorfismo
	@Override
	public void exibeCategoria() {
		System.out.println("Categoria Comida: Perecível e Não perecível.");
	}
	
}
