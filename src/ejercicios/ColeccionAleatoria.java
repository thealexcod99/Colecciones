package ejercicios;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Random; 

public class ColeccionAleatoria {
	private static final int TAMANNO = 100;	
	private static int[] array = new int[TAMANNO];
	private int[] arrayOrdenado;

	public ColeccionAleatoria() {
		//Usar la clase random(codigo comentado del constructor)
//		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (100 * Math.random());
//			array[i] = random.nextInt(100);   numeros del 0 al 99 (para incluir el 100 argumentar a 101
		}
		arrayOrdenado = array.clone();
		Arrays.sort(arrayOrdenado);
	}
	
	public int[] getArray() {
		return array;
	}
	
	public void mostrarArray() {
		System.out.println(Arrays.toString(array));
	}
	
	public double valorMedio() {
		double suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma / array.length;
	}
	
	public double desviacionTipica() {
		double suma = 0;
		double valorMedio = valorMedio();	//se asigna el valor medio a una variable para que haga una unica llamada al metodo, si se incluyera en el bucle llamaria al metodo 100 veces 
		for (int i : array) {
			suma += Math.pow(i - valorMedio, 2);
		}
		return Math.sqrt(suma / array.length);
	}
	
	public int[] arrayOrdenado() {
//		int[] arrayOrdenado = array;
//		Arrays.sort(arrayOrdenado);
//		return arrayOrdenado;
//		int[] arrayOrdenado = array.clone();	//no siempre va a funcionar el clone con todos los objetos
//		Arrays.sort(arrayOrdenado);				//tambien se podria recorrer el array y volcarlo en el nuevo con un bucle
		return arrayOrdenado;
	}
	
	public List<Integer> numerosPares() {
		List<Integer> listaPares = new ArrayList();	//no siempre va a funcionar el clone con todos los objetos
//		Arrays.sort(arrayOrdenado);
		for (int i : array) {
			if (i % 2 == 0) {
				listaPares.add(i);
			}
		}
		return listaPares;
	}
	
	public int valorMinimo() {
//		int[] arrayOrdenado = arrayOrdenado();
		return arrayOrdenado[0];
	}

	public int valorMaximo() {
//		int[] arrayOrdenado = arrayOrdenado();
		return arrayOrdenado[array.length -1];
	}
	
}
