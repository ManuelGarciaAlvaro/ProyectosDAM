package Entornos.Ejemplos;

import Entornos.Ejemplos.ClaseParaDepurar;

public class PruebaDebugger {

		 public static void main(String[] args) {

		 ClaseParaDepurar clase = new ClaseParaDepurar();

		 double valor = clase.echaCuentas();
		 double valor1 = clase.echaCuentas();
		 double valor2 = clase.echaCuentas();

		 System.out.println("Sale "+valor);

		 }

		}

		