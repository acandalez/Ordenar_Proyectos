package java_se.ejercicios_repaso;

import java.util.Scanner;

//M�TODO QUE RECIBE UNA NOTA DE 0 A 10 Y DICE SI EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE
public class Nota5 {

	private int nota;
	
	public Nota5(int n) {//M�todo constructor donde incicializamos el par�metro por valor que recibimos
		
		this.nota = n;
	}
	
	public enum Notas { //Un enumerado (o Enum) es una clase �especial� que limitan la creaci�n de objetos  a los especificados 
						//expl�citamente en la implementaci�n de la clase
		SUSPENSO, APROBADO, BIEN, NOTABLE, SOBRESALIENTE
	}
	
	public Notas notaTexto() { //M�todo donde utilizamos un switch para asignar un tipo Nota a un valor num�rico y nos devuelve un tipo Nota
		
		Notas calificacion = null;
		
		switch (this.nota) {
			
			case 10: 
			case 9: calificacion = Notas.SOBRESALIENTE;
				break;
			case 8:
			case 7: calificacion = Notas.NOTABLE;
				break;
			case 6: calificacion = Notas.BIEN;
				break;
			case 5: calificacion = Notas.APROBADO;
				break;
			default: calificacion = Notas.SUSPENSO;
				break;
		}
		return calificacion;
	}
	
	public static void main(String[] args) {
		
		int num = 0;
		
		Nota5 n = null;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print
			("Introduzca la nota num�rica entre 0 y 10: ");
			num = sc.nextInt();
			
		}while(num < 0 || num > 10);
		
		n = new Nota5(num);
		
		System.out.println("\nLa nota equivale a un: " + n.notaTexto());		
	}
}
