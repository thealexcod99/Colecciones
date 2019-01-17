package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ColeccionDinamica {

	private List<String> listaCadenas = new ArrayList<>();
	
	public List<String> getListaCadenas() {
		return listaCadenas;
	}

	public void addCadena(String cadena) {
		listaCadenas.add(cadena);
	}
	
	public boolean buscarCadena(String cadena) {
		return listaCadenas.contains(cadena);
	}
	
	public void eliminarCadena(String cadena) {
		listaCadenas.remove(cadena);
	}
	
	public List<String> obtenerCadenasMayorLongitud() {
		List<String> listaCadenasMayorLongitud = new ArrayList<>();
		int mayorLongitud = 0;
		
		for (String string : listaCadenas) {
			
			if (string.length() > mayorLongitud) {
				mayorLongitud = string.length();
				listaCadenasMayorLongitud.clear();
				listaCadenasMayorLongitud.add(string);
			}
			else if (string.length() == mayorLongitud) 
				listaCadenasMayorLongitud.add(string);
		}
		
		return listaCadenasMayorLongitud;
	}
	
	
}
