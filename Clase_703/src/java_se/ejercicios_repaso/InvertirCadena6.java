package java_se.ejercicios_repaso;

import java.util.Scanner;

//M�TODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREV�S
public class InvertirCadena6 {
	
	private String cadena;
	
	public InvertirCadena6(String c) { //M�todo constructor donde incicializamos el par�metro por valor que recibimos
		
		this.cadena = c;
	}
	
	public String cadenaInvertida() { //M�todo que nos devuelve un String al rev�s
		
		String cinvertida = "";
		int longitud = 0;
		
		longitud = this.cadena.length();
		
		for (int i = (longitud-1); i >= 0; i--) {
			
			cinvertida = cinvertida + this.cadena.charAt(i);
		}
		return cinvertida;			
	}
	
	public static void main(String[] args) {
		
		String cad = null;
		
		InvertirCadena6 str = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la cadena: ");
		cad = sc.nextLine();

		str = new InvertirCadena6(cad);
		
		System.out.print("\nLa cadena al rev�s es: " + str.cadenaInvertida());
	}

}
