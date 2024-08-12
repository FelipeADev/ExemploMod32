package br.com.faguirre;

import java.time.Instant;

import br.com.faguirre.dao.IVendaDao;
import br.com.faguirre.dao.VendaDao;
import br.com.faguirre.domain.Venda;

public class VendaTest {
	
	private IVendaDao vendaDao;
	
	public VendaTest() {
		vendaDao = new VendaDao;
	}
	
	public void VendaTest() {
		
		Venda vend = new Venda();
		vend.setCodigo("A");
		vend.setValor(321);
		vend.setDataVenda(Instant.now());
		
		vendaDao.cadastrar(vend);
		
		asssertNotNull(vend);
		assestNotNull(vend.getId());
	}

}
