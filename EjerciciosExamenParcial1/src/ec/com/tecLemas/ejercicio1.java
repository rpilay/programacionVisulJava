package ec.com.tecLemas;

import java.util.ArrayList;
import java.util.List;

/* 1.	Crea un ArrayList con los nombres de 6 compa�eros de clase. 
 * A continuaci�n, muestra esos nombres por pantalla. 
 * Utiliza para ello un bucle for que recorra todo el ArrayList sin usar ning�n �ndice. Ejemplo Maria, Pedro, Pablo, Andrea*/

public class ejercicio1 {

	public static void main(String[] args) {
		String nombres = "";
		List<String> nombresList= new ArrayList<>();
		nombresList.add("Ronald Pilay");
		nombresList.add("Gabriel");
		nombresList.add("Felix");
		nombresList.add("Michael");
		nombresList.add("Ronny Arias");
		nombresList.add("Ronald Pilay");
		System.out.println("Compa�eros de CLases: ");
	    for(int iLoop=0; iLoop < nombresList.size(); iLoop++) {
	       
	        nombres += nombresList.get(iLoop) + ", ";
	        
	    }
		System.out.println(nombres);
		
		
		

	}

}
