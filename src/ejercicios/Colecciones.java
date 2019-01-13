package ejercicios;

import java.util.Arrays;

public class Colecciones {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		
		
		for (int i = 0; i < 10; i++) {
			array1[i] = 3;
		}
		
		Arrays.fill(array2, 4);
		
		System.out.println("Array1  Array2");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(i + "- " + array1[i] + "    " + i + "- " + array2[i]);
		}
	}

}
