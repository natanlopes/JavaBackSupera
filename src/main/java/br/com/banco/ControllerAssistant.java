package br.com.banco;
import java.time.LocalDateTime;
public class ControllerAssistant {
	public LocalDateTime dateTimeConverter(String string) {
		return LocalDateTime.parse(string);
}
	}
