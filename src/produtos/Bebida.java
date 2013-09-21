package produtos;

import java.sql.Date;

public class Bebida extends Produto {

	private float litros;
	
	
	public Bebida(String d, Date v, String m, float pu,float litros,String cat) {
		super(d, v, m, pu,cat);
		this.setLitros(litros);
		
	}

	@Override
	public void exibeCategoria() {
		System.out.println("Categoria Bebidas: Alcoólica / Não alcoólica.");
	}
	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}
	
	
}
