package test;

import java.util.Scanner;

import ejercicios.ColeccionDinamica;

public class TestColeccionDinamica {

	public static void main(String[] args) {
		
		ColeccionDinamica c = new ColeccionDinamica();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce las palabras que añadiras a la colección y termina con un \"fin\" o un \"FIN\"");
		String cadena;
		do {
		cadena = sc.next();
		c.addCadena(cadena);
		}
		while (! (sc.hasNext("FIN") || sc.hasNext("fin") || sc.hasNext("Fin")));

	}

}
