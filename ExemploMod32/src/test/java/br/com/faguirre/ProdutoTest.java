package br.com.faguirre;

import org.junit.Test;

import br.com.faguirre.dao.ProdutoDao;
import br.com.faguirre.domain.Produto;

public class ProdutoTest {
	
	private IProdutoDao ProdutoDao;
	
	public ProdutoTest() {
		ProdutoDao = new ProdutoDao();
	}
	
	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		
		produto.setCodigo("A");
		produto.setNome("test");
		produto.setPreco(123);
		
		ProdutoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}

}
