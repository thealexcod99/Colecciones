package ejercicios;

import java.util.Arrays;

public class ColeccionesObjetos {
	private static final int TAMANNO_ARRAY = 10;
	
	private int[] array1 = new int[TAMANNO_ARRAY];
	private int[] array2 = new int[TAMANNO_ARRAY];
	
	
//	private int[] array1;				}
//	private int[] array2;				}
//										}Esta es otra forma de declarar e inicializar
//	public ColeccionesObjetos() {		}los atributos que son colecciones
//		array1 = new int[10];			}
//		array2 = new int[10];			}
//	}
	
	public ColeccionesObjetos(int numero) {
		for (int i = 0; i < array1.length; i++) {	//Inicializar con bucle for normal
			array1[i] = numero;
		}
//		for (int i : array1) {	No funciona para inicializar
//			i = numero;
//		}
		Arrays.fill(array2, numero);
	}

	public int[] getArray1() {
		return array1;
	}

	public int[] getArray2() {
		return array2;
	}
	
	//método que muestra los dos arrays de forma simultanea
	public void mostrarArrays() {
		System.out.println("Array1  Array2");
		for (int i = 0; i < array1.length; i++) {
			System.out.printf("%d%8d%n", array1[i], array2[i]);
		}
	}
	
}
