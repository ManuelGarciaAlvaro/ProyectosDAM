package ejercicios.basicos;

public class ejercicio3 {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int c= 4;
		int d= 5;
		System.out.println("El valor de a es: "+a);
		System.out.println("El valor de b es: "+b);
		System.out.println("El valor de c es: "+c);
		System.out.println("El valor de d es: "+d);
		int aux = 3;
		b=c;
		c=a;
		a=d;
		d=aux;
		
		System.out.println("___________________________");
		System.out.println("B toma el valor de C: "+b);
		System.out.println("C toma el valor de A: "+c);
		System.out.println("A tomar el valor de D: "+a);
		System.out.println("D toma el valor de B: "+d);
	}

}
