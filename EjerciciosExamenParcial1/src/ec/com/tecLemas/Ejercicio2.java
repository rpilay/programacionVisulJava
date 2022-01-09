package ec.com.tecLemas;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean ingreso = false;
		int oportunidades = 3;
		
		/*MAPEO PARA LA VALIDACION DE USER/PASSWORD*/
		
		HashMap<String, String>mapearLogin = new HashMap<>();
		mapearLogin.put("admin", "224477");
		mapearLogin.put("maria", "ztf99");
		mapearLogin.put("pepe", "zxcvb");
		
		 System.out.println("Por favor, introduzca nombre de usuario y "
		          + "contraseña para acceder al área restringida.\nDispone de "
		          + "3 intentos.");

	        do{
		        	  /* para el ingreso del usuario por teclado*/
		            System.out.println("usuario:");
		            Scanner tecleoUser = new Scanner(System.in);
		            String usuario = tecleoUser.nextLine();
		            /* para el ingreso de la clave por teclado*/
		            System.out.println("contraseña:");
		            Scanner tecleoPassw = new Scanner(System.in);
		            String password = tecleoPassw.nextLine();

		            if(mapearLogin.containsKey(usuario)){
		            	
		                if(mapearLogin.get(usuario).equalsIgnoreCase(password)){ // compara 
		                    System.out.println("Ha accedido al área restringida");
		                    ingreso = true;
		                } else {
		                    System.out.println("Contraseña incorrecta");
		                }
		            } else {
		                System.out.println("El usuario ingresado no existe");
		            }

		            oportunidades--;
		            if(!ingreso){
		                System.out.println("Le quedan " + (oportunidades) + " oportunidades");
		            }
		            
	          } while((!ingreso) && (oportunidades > 0));

		          if(!ingreso){
		              System.out.println("Lo siento, no tiene acceso al área restringida");
		          }
		
		
		
	}

}
