package br.com.faguirre.domain;

import java.time.Instant;

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
@Table(name = "tb_venda")
public class Venda {

	@Id
	@GeneratedValue(Strategy=GenerationType.SEQUENCE, generator="venda_seq")
	@SequenceGenerator(name="venda_seq", sequenceName="sq_venda", initiaValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "codigo", length = 10, nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "valor", lenght = 10, nullable = false)
	private Integer valor;
	
	@Column(name = "data_venda")
	private Instant dataVenda;

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

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Instant getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Instant dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
}
