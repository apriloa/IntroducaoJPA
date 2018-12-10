package br.ufac.academico.testes;

import java.util.List;

import javax.persistence.*;

import br.ufac.academico.entidades.*;

public class PedidoTeste {

	public static void main(String [] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AcademicoJPA");
		EntityManager em = emf.createEntityManager();

		List<Pedido> pedidos;
		Query q;
	
		Pedido p1,p2, p3;
		Item i11, i12, i13, i21, i22;
		

//		p1 =  new Pedido();
//		p1.setId(1);
//		p1.setStatus("Em processamento");
//
//		p2 =  new Pedido();
//		p2.setId(2);
//		p2.setStatus("Em trânsito");
//		
//		p3 =  new Pedido();
//		p3.setId(3);
//		p3.setStatus("Cancelar");
//
//		
//		i11 = new Item();
//		i11.setId(11);
//		i11.setQuantidade(10);
//		//		i11.setPedido(p1);
//
//		i12 = new Item();
//		i12.setId(12);
//		i12.setQuantidade(15);
////		i12.setPedido(p1);
//
//		i13 = new Item();
//		i13.setId(13);
//		i13.setQuantidade(20);
//		//		i13.setPedido(p1);
//
//		i21 = new Item();
//		i21.setId(21);
//		i21.setQuantidade(30);
//		//		i21.setPedido(p2);
//
//		i22 = new Item();
//		i22.setId(22);
//		i22.setQuantidade(60);
//		//		i22.setPedido(p2);
//
//		p1.addItem(i11);
//		p1.addItem(i12);
//		p1.addItem(i13);
//
//		p2.addItem(i21);
//		p2.addItem(i22);
//
//
//
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//	
////		em.persist(i11); // Isso antes de fazer o Array List em pedidos
////		em.persist(i12);
////		em.persist(i13);
////		em.persist(i21);
////		em.persist(i22);
//		em.getTransaction().commit();

		//		p1= em.find(Pedido.class, 1);
		//		i12 = em.find(Item.class, 12);
		//		
		//		p1.delItem(i12);
		//		
		//		em.getTransaction().begin();
		//		em.merge(p1);
		//		em.getTransaction().commit();

		q = em.createQuery("SELECT p FROM Pedido p");
		pedidos = q.getResultList();
		
		System.out.println("Listando todos os pedidos");
		for(Pedido p: pedidos) {
			System.out.println(p);
		}
		
		q = em.createQuery("SELECT p FROM Pedido p WHERE p.itens IS EMPTY");
		pedidos = q.getResultList();
		
		System.out.println("Listando todos os pedidos sem itens");
		for(Pedido p: pedidos) {
			System.out.println(p);
		}
		
		q = em.createQuery("SELECT p FROM Pedido p WHERE p.itens IS NOT EMPTY");
		pedidos = q.getResultList();
		
		System.out.println("Listando todos os pedidos com itens");
		for(Pedido p: pedidos) {
			System.out.println(p);
		}

		em.close();
		emf.close();

	}
}
