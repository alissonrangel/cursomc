package xyz.alissonrangel.domain;

import javax.persistence.Entity;

import xyz.alissonrangel.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer numeroDePArcelas;

	public PagamentoComCartao() {
		// TODO Auto-generated constructor stub
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		// TODO Auto-generated constructor stub
		this.numeroDePArcelas = numeroDeParcelas;
	}

	public Integer getNumeroDePArcelas() {
		return numeroDePArcelas;
	}

	public void setNumeroDePArcelas(Integer numeroDePArcelas) {
		this.numeroDePArcelas = numeroDePArcelas;
	}

}
