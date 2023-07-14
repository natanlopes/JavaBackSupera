package br.com.banco.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transferencia")
public class Transferencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "data_transferencia")
	private LocalDateTime operationDate;
	private Double valor;
	private String tipo;
	@Column(name = "nome_operador_transacao")
	private String operador;
	@Column(name = "conta_id")
	private Integer conta;

	public Long getId() {
		return this.id;
	}

	public LocalDateTime getOperationDate() {
		return this.operationDate;
	}

	public Double getValor() {
		return this.valor;
	}

	public String getTipo() {
		return this.tipo;
	}

	public String getOperador() {
		return this.operador;
	}

	public Integer getConta() {
		return this.conta;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setOperationDate(final LocalDateTime operationDate) {
		this.operationDate = operationDate;
	}

	public void setValor(final Double valor) {
		this.valor = valor;
	}

	public void setTipo(final String tipo) {
		this.tipo = tipo;
	}

	public void setOperador(final String operador) {
		this.operador = operador;
	}

	public void setConta(final Integer conta) {
		this.conta = conta;
	}

	public boolean equals(final Object o) {
		if (o == this) {
			return true;
		} else if (!(o instanceof Transferencia)) {
			return false;
		} else {
			Transferencia other = (Transferencia) o;
			if (!other.canEqual(this)) {
				return false;
			} else {
				Object this$id = this.getId();
				Object other$id = other.getId();
				if (this$id == null) {
					if (other$id != null) {
						return false;
					}
				} else if (!this$id.equals(other$id)) {
					return false;
				}

				Object this$valor = this.getValor();
				Object other$valor = other.getValor();
				if (this$valor == null) {
					if (other$valor != null) {
						return false;
					}
				} else if (!this$valor.equals(other$valor)) {
					return false;
				}

				Object this$conta = this.getConta();
				Object other$conta = other.getConta();
				if (this$conta == null) {
					if (other$conta != null) {
						return false;
					}
				} else if (!this$conta.equals(other$conta)) {
					return false;
				}

				label62 : {
					Object this$operationDate = this.getOperationDate();
					Object other$operationDate = other.getOperationDate();
					if (this$operationDate == null) {
						if (other$operationDate == null) {
							break label62;
						}
					} else if (this$operationDate.equals(other$operationDate)) {
						break label62;
					}

					return false;
				}

				label55 : {
					Object this$tipo = this.getTipo();
					Object other$tipo = other.getTipo();
					if (this$tipo == null) {
						if (other$tipo == null) {
							break label55;
						}
					} else if (this$tipo.equals(other$tipo)) {
						break label55;
					}

					return false;
				}

				Object this$operador = this.getOperador();
				Object other$operador = other.getOperador();
				if (this$operador == null) {
					if (other$operador != null) {
						return false;
					}
				} else if (!this$operador.equals(other$operador)) {
					return false;
				}

				return true;
			}
		}
	}

	protected boolean canEqual(final Object other) {
		return other instanceof Transferencia;
	}

	public int hashCode() {
		int PRIME = true;
		int result = 1;
		Object $id = this.getId();
		int result = result * 59 + ($id == null ? 43 : $id.hashCode());
		Object $valor = this.getValor();
		result = result * 59 + ($valor == null ? 43 : $valor.hashCode());
		Object $conta = this.getConta();
		result = result * 59 + ($conta == null ? 43 : $conta.hashCode());
		Object $operationDate = this.getOperationDate();
		result = result * 59 + ($operationDate == null ? 43 : $operationDate.hashCode());
		Object $tipo = this.getTipo();
		result = result * 59 + ($tipo == null ? 43 : $tipo.hashCode());
		Object $operador = this.getOperador();
		result = result * 59 + ($operador == null ? 43 : $operador.hashCode());
		return result;
	}

	public String toString() {
		this.getId();
		this.getOperationDate();
		this.getValor();
		this.getTipo();
		this.getOperador();
		return this.getConta();
	}
}