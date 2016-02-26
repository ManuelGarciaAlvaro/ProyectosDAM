package ejercicios.basicos;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		System.out.println("Introduce los grados centígrados: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int F = 32+(9*a/5);
		System.out.println("Los grados farenheit son: "+F);
		
	}

}
