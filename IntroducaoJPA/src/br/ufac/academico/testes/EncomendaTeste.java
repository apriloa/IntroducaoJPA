package br.ufac.academico.testes;

import javax.persistence.*;

import br.ufac.academico.entidades.Destino;
import br.ufac.academico.entidades.Encomenda;

public class EncomendaTeste {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AcademicoJPA");
		EntityManager em = emf.createEntityManager();
		
		Encomenda e1,e2;
		Destino d1, d2;
		
//		e1 = new Encomenda();
//		e2 = new Encomenda();
//		
//		d1 = new Destino();
//		d2= new Destino();
//		
//		d1.setId(1);
//		d1.setCidade("Rio Branco");
//		d1.setCep("69900");
//	
//		d2.setId(2);
//		d2.setCidade("Cuiabá");
//		d2.setCep("65000");
//		
//		e1.setId(11);
//		e1.setDescricao("Televisor 4k");
//		e1.setDestino(d1);
//		
//		e2.setId(22);
//		e2.setDescricao("Saco de farinha");
//		e2.setDestino(d2);
//		
//		em.getTransaction().begin();
//		em.persist(e1);
//		em.persist(e2);
//		em.getTransaction().commit();
//		
		
//		e1 = em.find(Encomenda.class, 11);
		d1 = em.find(Destino.class, 1);
		
		System.out.println(d1);
		System.out.println(d1.getEncomenda());
		
		em.close();
		emf.close();
		
		
		
	}

}
