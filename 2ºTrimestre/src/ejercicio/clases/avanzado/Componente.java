package ejercicio.clases.avanzado;

public class Componente {
	Ingrediente ingrediente;
	double cantidad;

	public Componente(Ingrediente ingrediente, double cantidad) {
		super();
		this.ingrediente = ingrediente;
		this.cantidad = cantidad;
	}

	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Componente [ingrediente=" + ingrediente + ", cantidad=" + cantidad + "]";
	}

}
