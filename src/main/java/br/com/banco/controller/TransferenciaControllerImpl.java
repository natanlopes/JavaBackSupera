package br.com.banco.controller;

import br.com.banco.model.Transferencia;
import br.com.banco.service.TransferenciaServiceInterface;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferenciaControllerImpl {
	@Autowired
	private TransferenciaServiceInterface anInterface;

	public List<Transferencia> listar() {
		return this.anInterface.listar();
	}

	public List<Transferencia> filtered(LocalDateTime init, LocalDateTime end, String nomeOperador) {
		List<Transferencia> transferencias = this.anInterface.listar();
		if (!nomeOperador.isEmpty()) {
			transferencias = (List) transferencias.stream().filter(nomeOperador).collect(Collectors.toList());
		}

		if (init != null && end != null) {
			transferencias.stream();
			transferencias = (List) init.filter(end).collect(Collectors.toList());
		}

		return transferencias;
	}

	public TransferenciaControllerImpl(final TransferenciaServiceInterface anInterface) {
		this.anInterface = anInterface;
	}
}
