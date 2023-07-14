package br.com.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_conta;
	private String nome_responsavel;

	public Long getId_conta() {
		return this.id_conta;
	}

	public String getNome_responsavel() {
		return this.nome_responsavel;
	}

	public void setId_conta(final Long id_conta) {
		this.id_conta = id_conta;
	}

	public void setNome_responsavel(final String nome_responsavel) {
		this.nome_responsavel = nome_responsavel;
	}

	public boolean equals(final Object o) {
		if (o == this) {
			return true;
		} else if (!(o instanceof Conta)) {
			return false;
		} else {
			Conta other = (Conta) o;
			if (!other.canEqual(this)) {
				return false;
			} else {
				Object this$id_conta = this.getId_conta();
				Object other$id_conta = other.getId_conta();
				if (this$id_conta == null) {
					if (other$id_conta != null) {
						return false;
					}
				} else if (!this$id_conta.equals(other$id_conta)) {
					return false;
				}

				Object this$nome_responsavel = this.getNome_responsavel();
				Object other$nome_responsavel = other.getNome_responsavel();
				if (this$nome_responsavel == null) {
					if (other$nome_responsavel != null) {
						return false;
					}
				} else if (!this$nome_responsavel.equals(other$nome_responsavel)) {
					return false;
				}

				return true;
			}
		}
	}

	protected boolean canEqual(final Object other) {
		return other instanceof Conta;
	}

	public int hashCode() {
		int PRIME = true;
		int result = 1;
		Object $id_conta = this.getId_conta();
		int result = result * 59 + ($id_conta == null ? 43 : $id_conta.hashCode());
		Object $nome_responsavel = this.getNome_responsavel();
		result = result * 59 + ($nome_responsavel == null ? 43 : $nome_responsavel.hashCode());
		return result;
	}

	public String toString() {
		this.getId_conta();
		return this.getNome_responsavel();
	}
}