package Ejercicios1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		 

		 Scanner sc = new Scanner(System.in);

		 

		 //Utilizar el constructor por defecto

		 Contador contador1 = new Contador();

		 

		 int n;

		 System.out.println("Introduce valor para inicializar el contador: ");

		 n = sc.nextInt();

		 

		 //asignar un valor al contador

		 contador1.setCont(n);

		 //incrementar el contador

		 contador1.incrementar();

		 //mostrar el valor actual

		 System.out.println(contador1.getCont());

		 

		 contador1.incrementar();

		 contador1.incrementar();

		 

		 //mostrar el valor actual

		 System.out.println(contador1.getCont());

		 

		 //restar 1 al valor del contador

		 contador1.decrementar();

		 

		 //mostrar el valor actual

		 System.out.println(contador1.getCont());

}
}
