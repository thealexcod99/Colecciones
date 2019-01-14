package test;

import java.util.Arrays;

import ejercicios.ColeccionesObjetos;

public class TestColeccionesObjetos {

	public static void main(String[] args) {
		ColeccionesObjetos colecciones = new ColeccionesObjetos(2);
		int[] array1 = colecciones.getArray1();
		int[] array2 = colecciones.getArray2();
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		colecciones.mostrarArrays();
	}

}
