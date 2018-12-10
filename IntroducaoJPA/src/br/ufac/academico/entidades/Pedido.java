package br.ufac.academico.entidades;

import java.util.*;
import java.util.List;

import javax.persistence.*;

@Entity
public class Pedido {
	
	@Id
	private int id;
	private String status;
	
//	@OneToMany(mappedBy="pedido", cascade=CascadeType.ALL, orphanRemoval=true)
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="pedido_fk")
	
	private List<Item> itens = new ArrayList<Item>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void addItem(Item i) {
//		i.setPedido(this);
		itens.add(i);
	}
	
	public void delItem(Item i) {
//		i.setPedido(null);
		itens.remove(i);
	}
	public String toString() { 
	 return String.format("Pedido [id%d, status=\"%s\", itens=%d]", id,status,itens.size());
	}
}
