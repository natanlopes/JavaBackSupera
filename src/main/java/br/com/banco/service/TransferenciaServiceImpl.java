package br.com.banco.service;

import br.com.banco.model.Transferencia;
import br.com.banco.repository.TransferenciaRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferenciaServiceImpl implements TransferenciaServiceInterface {
	@Autowired
	private TransferenciaRepository repository;

	public List<Transferencia> listar() {
		return this.repository.findAll();
	}

	public List<Transferencia> idConta(Long conta) {
		return this.repository.findByConta(conta);
	}

	public List<Transferencia> nomeOperador(String operador) {
		if (operador.equals("null")) {
			operador = null;
		}

		return this.repository.findByOperador(operador);
	}

	public List<Transferencia> periodo(LocalDateTime initial, LocalDateTime end) {
		return this.repository.findByDateTime(initial, end);
	}

	public List<Transferencia> nomeOperadorAndPeriodo(String operador, LocalDateTime initial, LocalDateTime end) {
		return this.repository.findByOperadorDateTime(operador, initial, end);
	}
}