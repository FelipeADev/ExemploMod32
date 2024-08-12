/**
 * 
 */
package br.com.faguirre.dao;

import br.com.faguirre.domain.Venda;

/**
 * 
 */
public class VendaDao implements IVendaDao {

	@Override
	public Venda cadastrar(Venda vend) {

		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(vend);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		
		return vend;
	}

}
