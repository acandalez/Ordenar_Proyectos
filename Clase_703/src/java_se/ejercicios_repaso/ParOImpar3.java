package java_se.ejercicios_repaso;

import java.util.Scanner;

//M�TODO QUE DADO UN N�MERO, DIGA SI ES PAR O NO
public class ParOImpar3 {
	
	private int numero;
	
	public ParOImpar3 (int n) { //M�todo constructor donde incicializamos el par�metro por valor que recibimos
		
		this.numero = n;
	}

	public String esParOImpar () { //M�todo que nos indica si un n�mero es par o impar y nos lo devuelve como texto
		
		String result = null;
		
		if ((this.numero%2) == 0) {
			
			result = "par";
		}
		else {
			result = "impar";
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int num = 0;
		String resultado = null;
		ParOImpar3 pi1 = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el n�mero a valorar: ");
		num = sc.nextInt();
		
		pi1 = new ParOImpar3(num);
		
		resultado = pi1.esParOImpar();
		
		System.out.println("\nEl n�mero introducido es " + resultado);
	}
}
