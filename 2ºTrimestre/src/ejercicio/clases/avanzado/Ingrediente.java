package ejercicio.clases.avanzado;

public class Ingrediente {
	String nombre;
	String tipo;

	public Ingrediente(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ingrediente [nombre=" + nombre + ", tipo=" + tipo + "]";
	}

}
