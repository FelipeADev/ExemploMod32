package br.com.faguirre.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(Strategy=GenerationType.SEQUENCE, generator="produto_seq")
	@SequenceGenerator(name="protudo_seq", sequenceName="sq_produto", initiaValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "codigo", length = 10, nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "nome", lenght = 50, nullable = false)
	private String nome;
	
	@Column(name = "preco", lenght = 10, nullable = false)
	private Integer preco;
	
	@Entity
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}
	
	
}
