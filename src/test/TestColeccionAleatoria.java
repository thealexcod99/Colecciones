package test;

import java.util.Arrays;
import java.util.List;

import ejercicios.ColeccionAleatoria;

public class TestColeccionAleatoria {

	public static void main(String[] args) {
		ColeccionAleatoria c = new ColeccionAleatoria();
		
		int[] array = c.getArray();
		
		System.out.println(Arrays.toString(array));
		System.out.printf("Valor medio %.2f%n",c.valorMedio());
		System.out.printf("Desviación típica %.4f%n", c.desviacionTipica());
		int[] arrayOrdenado = c.arrayOrdenado();
		System.out.println("Original" + Arrays.toString(array));
		System.out.println("Ordenado" + Arrays.toString(arrayOrdenado));
		List<Integer> coleccionPares = c.numerosPares();
		System.out.println("Pares" + coleccionPares);
		System.out.printf("El valor mas pequeño es %d%n", c.valorMinimo());
		System.out.printf("El valor mas grande es %d%n", c.valorMaximo());
	}

}
