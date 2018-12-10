package br.ufac.academico.entidades;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="Fisica")
public class PessoaFisica extends Pessoa{
	
	@Column(length=11)
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
