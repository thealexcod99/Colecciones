package teoria;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList10datos {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño de la lista:");
		int tam = sc.nextInt();
		
		for (int i = 0; i < tam; i++) {
			System.out.println("Introduce un nuevo número: ");
			int numero = sc.nextInt();
			list.add(numero);
		}
		sc.close();
		System.out.println(list);

		int sum = 0;

		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		double media = 1.0 * sum / tam;
		System.out.println("El valor medio es " + media);
	
		int valorMaximo = list.get(0);	//Integer.MIN_VALUE;
		int valorMinimo = list.get(0);	//Integer.MAX_VALUE;
		
		for (Integer integer : list) { //Apunta al primer objeto(en este momento de tipo Integer) de la lista y va continuando el bucle hasta el ultimo
			if (integer > valorMaximo) {
				valorMaximo = integer;
				continue;
			}
			if (integer < valorMinimo) {
				valorMinimo = integer;
			}
			
		}
		System.out.printf("Valor máximo: %d%n", valorMaximo);
		System.out.printf("Valor mínimo: %d%n", valorMinimo);
		
		list.forEach(System.out::println);
	}

}
