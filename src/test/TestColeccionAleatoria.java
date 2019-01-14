package test;

import java.util.Arrays;

import ejercicios.ColeccionAleatoria;

public class TestColeccionAleatoria {

	public static void main(String[] args) {
		ColeccionAleatoria coleccion = new ColeccionAleatoria();
		
		coleccion.mostrarArray();
		System.out.println(coleccion.valormedio());
		System.out.printf("%.4f%n", coleccion.desviacionTipica());
//		System.out.println(Arrays.toString(coleccion.numerosPares()));
	}

}
