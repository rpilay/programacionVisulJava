package ec.com.tecLemas;

import java.util.ArrayList;
import java.util.List;

/* 1.	Crea un ArrayList con los nombres de 6 compañeros de clase. 
 * A continuación, muestra esos nombres por pantalla. 
 * Utiliza para ello un bucle for que recorra todo el ArrayList sin usar ningún índice. Ejemplo Maria, Pedro, Pablo, Andrea*/

public class ejercicio1 {

	public static void main(String[] args) {
		String nombres = "";
		List<String> nombresList= new ArrayList<>();
		nombresList.add("Ronald Pilay");
		nombresList.add("Gabriel Martinez");
		nombresList.add("Felix Henriquez");
		nombresList.add("Michael Zambrano");
		nombresList.add("Ronny Ortiz");
		
		System.out.println("Compañeros de CLases: ");
	    for(int iLoop=0; iLoop < nombresList.size(); iLoop++) {
	       
	        nombres += nombresList.get(iLoop) + ", ";
	        
	    }
		System.out.println(nombres);
		
		
		

	}

}
