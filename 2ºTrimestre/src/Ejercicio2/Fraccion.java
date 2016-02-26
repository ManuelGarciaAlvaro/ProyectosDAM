package Ejercicio2;

public class Fraccion {

	  int numerador;
	  int denominador;

	    public Fraccion() {
	        this.numerador = 0;
	        this.denominador = 1;
	    }

	    public Fraccion(int num, int den) {
	        this.numerador = num;
	        if(den==0){
	            den = 1;
	        }
	        this.denominador = den;
	        simplificar();
	    }

	    public Fraccion(int num) {
	        this.numerador = num;
	        this.denominador = 1;
	    }

	    public int getDen() {
	        return denominador;
	    }

	    public void setDen(int den) {
	        this.denominador = den;
	    }

	    public int getNum() {
	        return numerador;
	    }

	    public void setNum(int num) {
	        this.numerador = num;
	    }

	    //sumar fracciones
	    public Fraccion sumar(Fraccion f) {
	        Fraccion aux = new Fraccion();
	        aux.numerador = this.numerador * f.denominador + this.denominador * f.numerador;
	        aux.denominador = this.denominador * f.denominador;
	        aux.simplificar(); 
	        return aux;
	    }
	   
	    //restar fracciones
	    public Fraccion restar(Fraccion f) {
	        Fraccion aux = new Fraccion();
	        aux.numerador = this.numerador * f.denominador - this.denominador * f.numerador;
	        aux.denominador = this.denominador * f.denominador;
	        aux.simplificar(); 
	        return aux;
	    }
	   
	    //multiplicar fracciones
	    public Fraccion multiplicar(Fraccion f) {
	        Fraccion aux = new Fraccion();
	        aux.numerador = this.numerador * f.numerador;
	        aux.denominador = this.denominador * f.denominador;
	        aux.simplificar();
	        return aux;
	    }

	    //dividir fracciones
	    public Fraccion dividir(Fraccion f) {
	        Fraccion aux = new Fraccion();
	        aux.numerador = this.numerador * f.denominador;
	        aux.denominador = this.denominador * f.numerador;
	        aux.simplificar();  //se simplifica antes de devolverla
	        return aux;
	    }
	   
	    //máximo común divisor por el algoritmo de Euclides
	    private int mcd() {
	        int u = Math.abs(numerador); 
	        int v = Math.abs(denominador);
	        if (v == 0) {
	            return u;
	        }
	        int r;
	        while (v != 0) {
	            r = u % v;
	            u = v;
	            v = r;
	        }
	        return u;
	    }

	    //simplificar fracciones
	    private void simplificar() {
	        int n = mcd();
	        numerador = numerador / n;
	        denominador = denominador / n;
	    }

	    @Override
	    public String toString() {
	        simplificar();
	        return numerador + "/" + denominador;
	    }    
}
