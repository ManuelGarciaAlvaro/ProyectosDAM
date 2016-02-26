package ejercicio.clases.avanzado;

import java.util.Arrays;

public class Categoria {
	String nombre;
	String descripcion;
	String responsable;
	Plato[] platos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public Plato[] getPlatos() {
		return platos;
	}

	public void setPlatos(Plato[] platos) {
		this.platos = platos;
	}

	@Override
	public String toString() {
		return "Categoria [nombre=" + nombre + ", descripcion=" + descripcion + ", responsable=" + responsable
				+ ", platos=" + Arrays.toString(platos) + "]";
	}

	public Categoria(String nombre, String descripcion, String responsable, Plato[] platos) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.responsable = responsable;
		this.platos = platos;
	}

	public void mostrarPlatos() {
		for (int i = 0; i < platos.length; i++) {
			platos[i].mostrar();
		}
	}
	

}
