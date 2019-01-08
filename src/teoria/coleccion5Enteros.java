package teoria;

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
		
		double media = sum / TAMAÑO_COLECCION;
		System.out.printf("El valor medio de la suma de los números introdcidos es %f%n", media);
		
		for (int i = 0; i < TAMAÑO_COLECCION; i++) {
			
		}
		
		
		

	}

}
