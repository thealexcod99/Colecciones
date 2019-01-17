package test;

import java.util.Scanner;

import ejercicios.ColeccionDinamica;

public class TestColeccionDinamica {

	public static void main(String[] args) {

		ColeccionDinamica c = new ColeccionDinamica();
		System.out.println("Introduce palabras. Para acabar usa fin");
		Scanner sc = new Scanner(System.in);

		String cadena = sc.next();
		if (!cadena.equalsIgnoreCase("fin"))
			c.addCadena(cadena);
		
		while (!cadena.equalsIgnoreCase("fin") && sc.hasNext()) {
			cadena = sc.next();
			if (!cadena.equalsIgnoreCase("fin"))
				c.addCadena(cadena);
		}
		
		sc.close();
		c.eliminarCadena("uno");
		System.out.printf("Lista de cadenas de mayor longitud%n%s%n", c.obtenerCadenasMayorLongitud());
		System.out.println(c.getListaCadenas());

		
	}

}
