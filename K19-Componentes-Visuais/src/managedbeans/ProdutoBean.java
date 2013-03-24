package managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Produto;

@ManagedBean
@SessionScoped
public class ProdutoBean {
	private static List<Produto> produtos;
	static{
		produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Camiseta branca", 29.90));
		produtos.add(new Produto("Camiseta preta", 39.99));
		produtos.add(new Produto("Calça jeans", 59.99));
		produtos.add(new Produto("Gravata", 19.90));
		Produto produto = new Produto("Terno", 285.65);
		produto.setShowPrice(false);
		produtos.add(produto);
		
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

}
