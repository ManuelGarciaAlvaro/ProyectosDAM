package EntornosExcepciones;

import java.util.Scanner;

public class PersonaNoEncontradaException extends Exception {

	String nombre;

	public String getMessage() {
		return nombre + " no es un usuario del sistem";
	}

}
