package br.ufac.academico.entidades;

import javax.persistence.*;

@Entity
public class Item {
	
	@Id
	private int id;
	private int quantidade;
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="pedido_fk")
//	private Pedido pedido;
	
//	public Pedido getPedido() {
//		return pedido;
//	}
//	public void setPedido(Pedido pedido) {
//		this.pedido = pedido;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
