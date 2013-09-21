import java.sql.Date;
import java.util.ArrayList;

import estoque.Estoque;
import estoque.ItemEstoque;

import produtos.Bebida;
import produtos.Comida;
import produtos.Produto;


public class Principal {

	public static void main(String[] args) {

		Bebida sucoUva = new Bebida("Suco de uva natural", "13/09/2017","Jolimont", 2.30, 1.3, "Não Alcoólica");
		Bebida skyy = new Bebida("Vodka SKYY","20/08/2019","SKYY",23.90,1.0,"Alcoólica");
		
		Comida arroz1Kg = new Comida("Arroz Amarelo 1Kg","12/10/2014","Marca 1",3.20,1.0,"Não Perecível");
		
		//Piadinha
		Comida costelaPorco = new Comida("Costela de porco 1kg","10/10/2013","Friboi",10.30,1.0,"Perecível");
		
		ArrayList<ItemEstoque> itensEstoque = new ArrayList<ItemEstoque>();
		itensEstoque.add(new ItemEstoque(sucoUva, 100, "A"));
		itensEstoque.add(new ItemEstoque(skyy, 20, "B"));
		itensEstoque.add(new ItemEstoque(arroz1Kg, 19, "C"));
		
		
		ItemEstoque friBoi = new ItemEstoque(costelaPorco, 20, "E");
		
		Estoque estoque = new Estoque(itensEstoque);
		
		estoque.addItem(friBoi);
		
		estoque.listaItensEstoque();
		estoque.removeItem(arroz1Kg, 10);
		estoque.listaItensEstoque();
		
		
		
		
		
		
		

	}

}
