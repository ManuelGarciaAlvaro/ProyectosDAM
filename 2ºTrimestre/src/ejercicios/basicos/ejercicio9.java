package ejercicios.basicos;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		System.out.println("Introduce los km/H: ");
		Scanner sc = new Scanner(System.in);
		int variable = sc.nextInt();
		double resultado =variable*0.27;
		
		System.out.println("El equivalente en m/s es : "+resultado);
}
}