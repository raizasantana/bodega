package produtos;

import java.sql.Date;

public class Bebida extends Produto {

	private double litros;
	
	
	public Bebida(String d, String v, String m, double e,double f,String cat) {
		super(d, v, m, e,cat);
		this.setLitros(f);
		
	}

	@Override
	public void exibeCategoria() {
		System.out.println("Categoria Bebidas: Alcoólica / Não alcoólica.");
	}
	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}
	
	
}
