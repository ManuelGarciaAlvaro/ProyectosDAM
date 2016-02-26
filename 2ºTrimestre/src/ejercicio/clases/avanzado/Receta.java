package ejercicio.clases.avanzado;

import java.util.Arrays;

public class Receta {
	Componente[] componentes;

	public Componente[] getComponentes() {
		return componentes;
	}

	public void setComponentes(Componente[] componentes) {
		this.componentes = componentes;
	}

	public Receta(Componente[] componentes) {
		super();
		this.componentes = componentes;
	}

	@Override
	public String toString() {
		return "Receta [componentes=" + Arrays.toString(componentes) + "]";
	}

}
