package val.examples.basic.exceptions.runtimeexceptions;


/**
 * Ejemplo de c�mo funcionan las clases que heredan de RunTimeException:
 * 
 * El compilador no me fuerza a coger las excepciones que heredan de RunTimeException.
 * Es una forma vaga y desaconsejada de procesar las excepciones, c�mo hace Hibernate
 * a partir de la versi�n 2
 * 
 * En palabras de un miembro del equipo de Hibernate
 * 
 * checkked exceptions in a *framework* is in almost all cases evil. 

we learned from that mistake in Hibrenate 2 and changed it for Hibernate 3 ...the code is *much* cleaner now when you are not *forced* to always catch or throw.
 * 
 * @author Vale
 *
 */
public class MainRunTimeException {
	
	
	public static void main(String[] args) {
		/*Ojo, llamo a un m�todo que internamente lanza una excepci�n, pero el compilador
		 * no me fuerza a definir un try - catch*/
		ClaseTestException cl = new ClaseTestException(15);
		cl.toString();
		
	}

}
