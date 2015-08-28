package java_se.ejemplos_basicos;

import java.io.File;

public class ArgLetraPalabra {//Programa que muestra el n�mero de veces que aparece la primera letra de la �ltima palabra
	
	public static void main(String[] args) {
		
		//1: Recorrer args[]
		//2: Hay que recorrer para cada palabra
		//Comprobar si el car�cter actual es igual al car�cter de la primera letra de la �ltima palabra
		//Contar n� veces ++;
		String straux = null;
		int contletra = 0;
		char c = ' ';
		
		//palabra = args[args.length-1]; //Me guarda en 'palabra' la �ltima palabra de mi args
		c = args[args.length-1].charAt(0);//Me guarda en 'c' el primer caracter de la �ltima palabra de mi texto
		
		for (int i = 0; i < args.length-1; i++) { //args.length-1 me devuelve la longitud de todas
		//las palabras menos la �ltima palabra que es la que vamos a utilizar para buscar el caracter en todas las anteriores
			
			straux = args[i];
			
			for (int j = 0; j < args[i].length(); j++) {//Me devuelve la longitud de la palabra que se
														//encuentra en la posici�n 'i' de mi texto
				
				if (straux.charAt(j) == c) {	
					contletra++;
				}
			}
		}
		System.out.println("La primera letra de la �ltima palabra es: "+ c + 
				"\nY aparece " + contletra + " veces en todo el texto");
	}
}
