package java_se.ejemplos_basicos;

public class PalabraMasLarga { //Una clase de par�metros de entrada
                       	//Vamos a recorrer el par�metro args que recibimos
	
	public static void main(String[] args) { //Este m�todo muestra la palabra m�s larga, el n�mero de caracteres y la posici�n de la palabra
		String  straux = null;
		String palabramaslarga = null;
		int contpalabra = 0;
		int pospalabra = 0;
		
		for (int i = 0; i < args.length; i++) {//Recorro la longitud de mi argumento o texto
			
			straux = args[i];
			System.out.println(straux);
			
			if (straux.length() > contpalabra ) {
	
				palabramaslarga = straux;
				pospalabra = i+1;
				contpalabra = straux.length();
			}
		}
		System.out.println("La palabra m�s larga es: " + palabramaslarga);
		System.out.println("Tiene " + contpalabra + " caracteres");
		System.out.println("Y est� en la posici�n " + pospalabra);
		
		
	}
}
