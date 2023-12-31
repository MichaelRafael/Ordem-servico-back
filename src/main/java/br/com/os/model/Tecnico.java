package br.com.os.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_tecnico")
public class Tecnico extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@OneToMany(mappedBy = "tecnico")
	private List<OrdemServico> ondensServicos = new ArrayList<>();
	
	public Tecnico() {
		super();
	}

	public Tecnico(Long id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
	}

	public List<OrdemServico> getOndensServicos() {
		return ondensServicos;
	}

	public void setOndensServicos(List<OrdemServico> ondensServicos) {
		this.ondensServicos = ondensServicos;
	}
	
}
