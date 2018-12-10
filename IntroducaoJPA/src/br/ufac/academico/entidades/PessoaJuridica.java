package br.ufac.academico.entidades;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="Juridico")
public class PessoaJuridica extends Pessoa{
	
	@Column(length=14)
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	

}
