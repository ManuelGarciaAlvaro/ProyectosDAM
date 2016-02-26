package ejercicios.basicos;

import java.util.Scanner;

public class ejercicio8 {
	private static final double PI = 3.1416;

	public static void main(String[] args) {
		System.out.println("Introduce el valor del radio: ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		double longitud = 2*PI*r;
		double area = PI*r*r;
		System.out.println("Longitud circunferencia: "+longitud);
		System.out.println("Área circunferencia: "+area);

}
}
