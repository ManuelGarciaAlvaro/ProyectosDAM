package ejercicio.clases.avanzado;

import java.util.Scanner;

public class Restaurante {
	static Categoria[] Categorias = new Categoria[3];
	
	
	public static void main(String[] args) {

		// Ingredientes Arroz Tres Delicias

		Ingrediente iArroz = new Ingrediente("Arroz", "Cereal");
		Ingrediente iGuisantes = new Ingrediente("Guisantes", "Verdura");
		Ingrediente iZanahoria = new Ingrediente("Zanahoria", "Hortalizas");
		Ingrediente iJamon = new Ingrediente("Jamon", "Embutido");

		// Ingredientes macarrones con salchichas

		Ingrediente iMacarron = new Ingrediente("Macarron", "Pasta");
		Ingrediente iTomate = new Ingrediente("Tomate", "Verdura");
		Ingrediente iSalchicha = new Ingrediente("Salchicha", "Curtidos");
		Ingrediente iQueso = new Ingrediente("Queso", "Lacteos");

		// Ingredientes pizza de salami

		Ingrediente iSalami = new Ingrediente("Salami", "Embutido");
		Ingrediente iMasa = new Ingrediente("Pan", "Pan");

		// Ingredientes de sushi

		Ingrediente iSalmon = new Ingrediente("Salmon", "Pescado");
		Ingrediente iSalsaSoja = new Ingrediente("SalsaSoja", "Salsas");
		Ingrediente iAlgas = new Ingrediente("Algas", "Verduras");

		// Ingredientes de perrito caliente

		Ingrediente iMostaza = new Ingrediente("Mostaza", "Salsas");
		Ingrediente iKetchup = new Ingrediente("Ketchup", "Salsas");
		Ingrediente iPanPerrito = new Ingrediente("PanPerrito", "Pan");

		// Componente perrito caliente
		Componente cMostaza = new Componente(iMostaza, 20);
		Componente cKetchup = new Componente(iKetchup, 20);
		Componente cPanPerrito = new Componente(iPanPerrito, 200);
		Componente cSalchicha = new Componente(iSalchicha, 50);

		// Componente arroz tres delicias
		Componente cArroz = new Componente(iArroz, 100);
		Componente cGuisantes = new Componente(iGuisantes, 30);
		Componente cZanahoria = new Componente(iZanahoria, 20);
		Componente cJamon = new Componente(iJamon, 50);

		// Componente shushi
		Componente cSalmon = new Componente(iSalmon, 20);
		Componente cSalsaSoja = new Componente(iSalsaSoja, 20);
		Componente cArroz2 = new Componente(iArroz, 50);
		Componente cAlgas = new Componente(iAlgas, 10);

		// Componente pizza de salami
		Componente cSalami = new Componente(iSalami, 20);
		Componente cMasa = new Componente(iMasa, 300);
		Componente cTomate = new Componente(iTomate, 100);
		Componente cQueso = new Componente(iQueso, 50);

		// Componente macarrones con salchichas
		Componente cMacarron = new Componente(iMacarron, 89);
		Componente cTomate2 = new Componente(iTomate, 50);
		Componente cSalchicha2 = new Componente(iSalchicha, 30);
		Componente cQueso2 = new Componente(iQueso, 10);

		// Receta perrito
		Componente[] recetaPerrito = new Componente[4];
		recetaPerrito[0] = cMostaza;
		recetaPerrito[1] = cKetchup;
		recetaPerrito[2] = cPanPerrito;
		recetaPerrito[3] = cSalchicha;

		// Receta arroz tres delicias
		Componente[] recetaArroz3delicias = new Componente[4];
		recetaArroz3delicias[0] = cArroz;
		recetaArroz3delicias[1] = cGuisantes;
		recetaArroz3delicias[2] = cZanahoria;
		recetaArroz3delicias[3] = cArroz;

		// Receta sushi
		Componente[] recetaSushi = new Componente[4];
		recetaSushi[0] = cArroz2;
		recetaSushi[1] = cSalsaSoja;
		recetaSushi[2] = cAlgas;
		recetaSushi[3] = cSalmon;

		// Receta pizza Salami
		Componente[] recetaPizzaSalami = new Componente[4];
		recetaPizzaSalami[0] = cSalami;
		recetaPizzaSalami[1] = cMasa;
		recetaPizzaSalami[2] = cTomate;
		recetaPizzaSalami[3] = cQueso;

		// Receta macarrones con salchichas
		Componente[] recetaMacarrones = new Componente[4];
		recetaMacarrones[0] = cTomate2;
		recetaMacarrones[1] = cMacarron;
		recetaMacarrones[2] = cQueso2;
		recetaMacarrones[3] = cSalchicha2;

		// Platos
		Plato Sushi = new Plato("Sushi", 4.20, 10, recetaSushi);
		Plato PerritoCaliente = new Plato("Sushi", 4.20, 10, recetaPerrito);
		Plato Arroz3delicias = new Plato("Sushi", 4.20, 10, recetaArroz3delicias);
		Plato PizzaSalami = new Plato("Sushi", 4.20, 10, recetaPizzaSalami);
		Plato MacarronesconSalchichas = new Plato("Macarrones con Salchichas", 4.20, 10, recetaMacarrones);

		Plato[] PlatosChinos = new Plato[2];
		PlatosChinos[0] = Sushi;
		PlatosChinos[1] = Arroz3delicias;

		Plato[] PlatosAmericanos = new Plato[1];
		PlatosAmericanos[0] = PerritoCaliente;

		Plato[] PlatosItalianos = new Plato[2];
		PlatosItalianos[0] = MacarronesconSalchichas;
		PlatosItalianos[1] = PizzaSalami;

		// Categorias

		Categoria China = new Categoria("Comida China", "La comida es la mejor", "Xin Zhao", PlatosChinos);
		Categoria Italiana = new Categoria("Comida Italiana", "Mucha pasta", "Francesco Totti", PlatosItalianos);
		Categoria Americana = new Categoria("Comida Americana", "Para engordar rapido", "Barack Obama",
				PlatosAmericanos);

		Categorias[0] = China;
		Categorias[1] = Italiana;
		Categorias[2] = Americana;
		
		mostrarCategoria();
		
	}	
	
	public static void mostrarCategoria (){
		Scanner sc = new Scanner (System.in);
		String opcionesCategorias = sc.nextLine();					
		 
		for (int i=0; i<Categorias.length; i++)
		{
			if (Categorias[i].getNombre().compareTo(opcionesCategorias)==0)
			{
				Categorias[i].mostrarPlatos();
			}
		}
	}
}

