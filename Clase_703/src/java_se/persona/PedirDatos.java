package java_se.persona;

import java.util.Scanner;

public class PedirDatos {
	
	public static String pedirNombre () { //Funci�n q devuelve el nombre
		String nombre = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca nombre: "); //El 'print' me deja escribir en la misma l�nea
		nombre = sc.nextLine();// Recoje la l�nea entera escrita que recibe de entrada
		
		return nombre;
	}
	public static byte pedirEdad () {  //Funci�n q devuelve la edad
		byte edad = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca edad: ");
		edad = sc.nextByte();		
		
		return edad;
	}
}
