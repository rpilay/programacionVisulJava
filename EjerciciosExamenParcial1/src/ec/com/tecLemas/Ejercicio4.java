package ec.com.tecLemas;

import java.util.HashMap;
import java.util.Scanner;

/*4.	Crea un mini-diccionario español-inglés que contenga, al menos,20 palabras (con su traducción) listado de palabras: 
 *  a) Utiliza un objeto de la clase HashMap para almacenar las parejas de palabras. 
 *   b) El programa pedirá por teclado una palabra en español y dará la correspondiente traducción en inglés.
*/

public class Ejercicio4 {

	public static void main(String[] args) {
		boolean ingreso = true;
		
		HashMap<String, String>mapDiccionario = new HashMap<>();
		mapDiccionario.put("ordenador", "computer");
		mapDiccionario.put("gato", "cat");
		mapDiccionario.put("rojo", "red");
		mapDiccionario.put("árbol", "tree");
		mapDiccionario.put("pingüino", "penguin");
		mapDiccionario.put("sol", "sun");
		mapDiccionario.put("agua", "water");	
		mapDiccionario.put("viento", "wind");	
		mapDiccionario.put("siesta", "siesta");	
		mapDiccionario.put("arriba", "up");
		mapDiccionario.put("ratón", "mouse");
		mapDiccionario.put("estadio", "arena");
		mapDiccionario.put("calumnia", "aspersion");
		mapDiccionario.put("aguacate", "avocado");
		mapDiccionario.put("cuerpo", "body");	
		mapDiccionario.put("concurso", "contest");			
		mapDiccionario.put("cena", "dinner");	
		mapDiccionario.put("salida", "exit");	
		mapDiccionario.put("lenteja", "lentil");	
		mapDiccionario.put("cacerola", "pan");	
		mapDiccionario.put("pastel", "pie");	
		mapDiccionario.put("membrillo", "quince");	
		
		System.out.println("Diccionario español-ingles ");
		do {
			
			System.out.println("Ingrese una palabra : ");
		
			Scanner tecleoPalabra = new Scanner(System.in);
            String palabra = tecleoPalabra.nextLine();
            if(mapDiccionario.containsKey(palabra)) {
            	System.out.println("Translation is: "+mapDiccionario.get(palabra));
            	
            	System.out.println("Desea consultar otra palabra? S/N");
            	Scanner tecleoOpcion = new Scanner(System.in);
            	char opcion = tecleoOpcion.next().charAt(0);
            	
            	//System.out.println(opcion.toUpperCase());
            	if(Character.toUpperCase(opcion)=='N')
            		ingreso=false;
            }
			
		}while(ingreso);
		
		
	
			
			
			
			
			
		
			
			
			

	

	}

}
