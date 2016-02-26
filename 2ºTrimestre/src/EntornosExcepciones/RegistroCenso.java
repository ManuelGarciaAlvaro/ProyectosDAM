package EntornosExcepciones;

import java.util.Scanner;

public class RegistroCenso {
	static protected String[] personas;
	static protected int personasRegistradas = 0;

	public static void main(String[] args) {
		personas = new String[4];
		int opcion=0;
		do {
			mostrarOpciones();
			opcion = leerOpcion();
			if (opcion == 1)
				registraPersona();
			if (opcion == 2)
				try {
					buscaPersona();
				} catch (PersonaNoEncontradaException e) {
					System.out.println(e.getMessage());
				}
		} while (opcion != 3);
	}

	public static void buscaPersona() throws PersonaNoEncontradaException {

		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();

		for (int i = 0; i < personas.length; i++) {
			try {
				if (personas[i].compareTo(nombre) == 0) {
	
					System.out.println(nombre + " esta registrado en el censo");
					return;
				}
			}catch (NullPointerException e){
				PersonaNoEncontradaException f = new PersonaNoEncontradaException();
				f.nombre = nombre;
				throw f;
			}
		}
		PersonaNoEncontradaException e = new PersonaNoEncontradaException();
		e.nombre = nombre;
		throw e;
	}

	private static void mostrarOpciones() {
		System.out.println("Opciones del censo: ");
		System.out.println("1. Registrar una persona");
		System.out.println("2. Buscar una persona");
		System.out.println("3. Salir");
	}

	private static void registraPersona() {
		System.out.println("Introduce nombre a registrar: ");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		personas[personasRegistradas] = nombre;
		personasRegistradas++;
		try{
			personas[personasRegistradas]=nombre;
		}catch (ArrayIndexOutOfBoundsException e){
			personasRegistradas=0;
			personas[personasRegistradas]=nombre;
			System.out.println("Se han introducido más nombres de los que se permiten.");
		}
	}

	private static int leerOpcion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la opción: ");
		return Integer.valueOf(sc.nextLine());
	}
}
