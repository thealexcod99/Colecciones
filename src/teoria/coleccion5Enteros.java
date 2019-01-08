package teoria;

import java.util.Arrays;
import java.util.Scanner;

public class coleccion5Enteros {

	public static void main(String[] args) {
		final int TAMAÑO_COLECCION = 5;
		int[] numeros = new int[TAMAÑO_COLECCION];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < TAMAÑO_COLECCION; i++) {
			System.out.println("Introduce un nuevo número:");
			numeros[i] = sc.nextInt();
			sum += numeros[i];
		}
		sc.close();
		
		System.out.println("Array original " + Arrays.toString(numeros));
		
		float media = 1.0f * sum / TAMAÑO_COLECCION;
		System.out.printf("El valor medio de la suma de los números introdcidos es %.2f%n", media);
		
		//calcular el valor maximo recorriendo el array
		int valorMaximo = Integer.MIN_VALUE; //en vez de usar un -9999999 o algo parecido
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > valorMaximo ) {
				valorMaximo = numeros[i];
			}
		}
		System.out.printf("El valo máximo es %d%n", valorMaximo);
		
		//calcular el valor minimo ordenando el array
		Arrays.sort(numeros); //ordena el array
		System.out.println("Array ordenado " + Arrays.toString(numeros));
		System.out.printf("El valor mínimo es %d%n", numeros[0]);
		System.out.printf("El valor mínimo es %d%n", numeros[numeros.length - 1]);
		
		
		

	}

}
