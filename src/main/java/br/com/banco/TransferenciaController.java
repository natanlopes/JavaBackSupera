package br.com.banco;
import br.com.banco.service.TransferenciaServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RestController
@RequestMapping({"/transferencia"})
@CrossOrigin({"*"})
public class TransferenciaController<Transferencia> {
	@Autowired
	private final TransferenciaControllerImpl impl = new TransferenciaControllerImpl(new TransferenciaServiceImpl());
	private final ControllerAssistant assistant = new ControllerAssistant();

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Object> listar() {
		return ResponseEntity.ok().body(this.impl.listar());
	}

	@GetMapping({"/"})
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Transferencia>> buscar(@RequestParam(name = "init", required = false) String init,
			@RequestParam(name = "end", required = false) String end,
			@RequestParam(name = "nomeOperador", required = false) String nomeOperador) {
		List<Transferencia> list = this.impl.filtered(this.assistant.dateTimeConverter(init),
				this.assistant.dateTimeConverter(end), nomeOperador);
		return ResponseEntity.ok().body(list);
	}
}
