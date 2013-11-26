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
		System.out.println("Categoria Bebidas: Alco�lica / N�o alco�lica.");
	}
	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}
	
	
}
 // TESTEEEEEEEEEEE