package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class ColeccionAleatoria {
	private static final int TAMANNO = 100;	
	private static int[] array = new int[TAMANNO];

	public ColeccionAleatoria() {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (100 * Math.random());
		}
	}
	
	public int[] getArray() {
		return array;
	}
	
	public void mostrarArray() {
		System.out.println(Arrays.toString(array));
	}
	
	public double valormedio() {
		double suma = 0.0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma / array.length;
	}
	
	public double desviacionTipica() {
		double suma = 0.0;
		for (int i = 0; i < array.length; i++) {
			suma += Math.pow(array[i] - valormedio(), 2);
		}
		return Math.sqrt(suma / array.length);
	}
	
	public int[] arrayOrdenado() {
		int[] arrayOrdenado = array;
		Arrays.sort(arrayOrdenado);
		return arrayOrdenado;
	}
	
//	public int[] numerosPares() {
//		int contador = 0;
//		int[] arrayPares = new int[contador];
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] % 2 == 0) {
//				contador++;
//				arrayPares[i] = array[i];
//			}
//				
//		}
//		return arrayPares;
//	}
	public int[] numerosPares() {
		ArrayList<Integer> arrayPares = new ArrayList();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				arrayPares.add(array[i]);
			}

		}
		
	}
}
