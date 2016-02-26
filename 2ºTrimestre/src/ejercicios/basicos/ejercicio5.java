package ejercicios.basicos;

public class ejercicio5 {
	public static void main(String[] args) {
	int c=144;
	System.out.println("El valor "+c+((c>=0)?" es positivo":" es negativo"));
	System.out.println("El valor "+c+((c%2==0)?" es par":" es impar"));
	System.out.println("El valor "+c+((c%5==0)?" es múltiplo de 5":" no es múltiplo de 5"));
	System.out.println("El valor "+c+((c%10==0)?" es múltiplo de 10":" no es múltiplo de 10"));
	System.out.println("El valor "+c+((c>100)?" es mayor que 100":" es menor que 100"));
	}
}
