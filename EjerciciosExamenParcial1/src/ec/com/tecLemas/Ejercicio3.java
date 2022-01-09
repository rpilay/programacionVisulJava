package ec.com.tecLemas;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 3.	Escribe un programa que ordene 10 números enteros introducidos por
 teclado y almacenados en un objeto de la clase ArrayList .
*/
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> numerosList = new ArrayList<>();
		System.out.println(" Ingrese la cantidad de 10 numeros");
		
		for(int i=1;i<=10;i++) {
			System.out.println(" Ingrese el numero #" +i +": ");
			Scanner tecleoNumero=new Scanner(System.in);
			String numero = tecleoNumero.nextLine();
			numerosList.add(numero);
			
		}
		System.out.println("Numeros Ingresados: "+ numerosList);
		Collections.sort(numerosList);
		System.out.println("Numeros Ordenados: "+ numerosList);
		

	}

}
