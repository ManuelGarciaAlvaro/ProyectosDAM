
public class MyArray {
	int nuevoarray[];

	public MyArray(int length) {
	}

	public void MiArray() {
		nuevoarray = new int[10];
		for (int i = 0; i <= 10; i++) {
			nuevoarray[i] = -1;
		}
	}

	public void MiArray(int longitud) {
		nuevoarray = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			nuevoarray[i] = -1;
		}
	}

	public void MiArray(int longitud, int valor) {
		nuevoarray = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			nuevoarray[i] = valor;
		}
	}

	public void inicializar(int valor) {
		for (int i = 0; i < nuevoarray.length; i++){
			nuevoarray[i] = valor;
		}

	}

	public void resetear() {
		for (int i = 0; i < nuevoarray.length; i++){
			nuevoarray[i] =-1;
	}

	}
	public int sumaValores(){
		int suma=0;
		for (int i =0; i<nuevoarray.length;i++){
			suma=suma+nuevoarray[i];
			
		}
		return suma;
		
	}
	public int pares(){
		int contador=0;
		for (int i= 0; i<nuevoarray.length;i++){
			
			if (i%2==0){
				contador++;
			}	
		}
		return contador;
	}
	public int impares(){
		int contador=0;
		for (int i=0; i<nuevoarray.length;i++){
			if (i%2!=0){
				contador++;
			}
		}
		return contador;
	}
	public boolean contains(int numero){
		boolean contiene= false;
		for (int i=0; i<nuevoarray.length; i++){
			if (numero==nuevoarray[i]){
				contiene=true;
				}	
		}
		return contiene;
	}
	public int count(int numero){
		int contador=0;
		for(int i=0; i<nuevoarray.length; i++){
			if (numero==nuevoarray[i]){
				contador++;
			}	
		}
		return contador;
	}
	public String toString(){
		return "Los valores son: "+ nuevoarray;
	}
	public String show(){
		return "El array es: " + nuevoarray;
	}
	public int sumaArray(int numeroarray[], boolean actualiza){
		actualiza = false;
		int volv=0;
		for (int i=0; i<nuevoarray.length;){
			
			if (actualiza==true){
				volv= nuevoarray[i] + numeroarray[i];
			}	
		}
		return volv;
	}
	public MyArray clone(){
		MyArray arrayclone;
		arrayclone=new MyArray(nuevoarray.length);
		for (int i=0; i<nuevoarray.length; i++)
			arrayclone.nuevoarray[i]=this.nuevoarray[i];
		return arrayclone;
		
	}
	public MyArray contact(int array[]){
		MyArray arraycontact=new MyArray(array.length+this.nuevoarray.length);
		int m=0;
		for (int i=0; i<this.nuevoarray.length;i++){
			arraycontact.nuevoarray[i]=this.nuevoarray[i];
		}
		for(int x=this.nuevoarray.length; x<(array.length+this.nuevoarray.length);x++){
			arraycontact.nuevoarray[x]=array[m];
			m++;
		}
		return arraycontact;
	}
}

