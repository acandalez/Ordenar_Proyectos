package java_se.numero_mayor;

public class Numero {
	
	int num = 0;

	/**
	 * Constructor de la clase que recibe tres par�metros
	 * @param n1: Par�metro de entrada de tipo int
	 * @param n2: Par�metro de entrada de tipo int
	 * @param n3
	 */
	public Numero(int n1) {
		
		this.num = n1;

	}
	
	public void mostrarNumero() {
		
		System.out.println(this.num);
		
	}
	
	public boolean equals(Object ob) { //El objeto ob recibe como entrada al objeto de la clase MainNumero
		
		boolean esmayor = false;
		Numero number = null; //Este es el objeto que har� la llamada al equals
		
		if (ob instanceof Numero) { //Sirve para comprobar si el objeto es una instancia de la clase Numero
			
			number = (Numero)ob; //Es el Casting es la conversi�n de un tipo de dato a otro equivalente y para objetos que guardan una relaci�n de jerarqu�a
		}
		
		if (number.num <= this.num) {
			esmayor = true;
		}
		else {
			esmayor = false;
		}
		return esmayor;
	}
}
