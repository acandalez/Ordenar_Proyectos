package java_se.password;

public class Password {

	private String palabraclave = null;
	private int longitud;
	private final int min = 8; //Creo un atributo constante en toda mi clase con lo cual le pongo el final
	/**
	 * @ Mi pass es buena si tiene m�n. 8 caracteres 
	 * @ Si contiene may�sculas y min�sculas 
	 * @ Si contiene caracteres especiales 
	 * @ Si contiene alg�n n�mero
	 * 
	 * @return
	 */
	public Password (String pw) {
		
		this.palabraclave = pw;
		this.longitud = this.palabraclave.length();//Optimiza el c�digo, ya que llamammos a length una vez en vez
		//de i veces en el for y ahorramos proceso de ejecuci�n
	}
	
	public boolean esPasswordBuena () {
		
		boolean esbuena = false;
//		this.length(); //Me da la longitud del Strng
//		this.charAt(int cont); //Me recorre el String car�cter a car�cter;
		
		if (min8Caracteres() && siMayuscula() && siMinuscula() && siNumero() && siEspeciales()) {
			
			esbuena = true;
		}
		else {
			System.out.println("La contrase�a que va crear no es correcta. Recuerde los requisitos:" +
					"\n* Tiene que tener un m�nimo 8 caracteres" +
					"\n* Tiene que contener al menos una may�scula" +
					"\n* Tiene que contener al menos una min�cula" +
					"\n* Tiene que contener alg�n car�cter especial" +
					"\n* Y al menos contener un n�mero");
			esbuena = false;
		}
		return esbuena;
	}

	public boolean min8Caracteres() { //Determina si mi pass es menor de 8 caracteres

		boolean minimo8 = false;

		if (palabraclave.length() >= min) { //Longitud de pass es mayor o igual de constante global

			minimo8 = true;
		} else {
			minimo8 = false;
		}
		return minimo8;
	}
	
	public boolean siMayuscula() { //Comprueba si mi pass contiene alguna may�scula
		
		boolean mayuscula = false;
			
		for (int i = 0; i < this.longitud; i++) {
			
			if (Character.isUpperCase(palabraclave.charAt(i))) {
			//Determina si mi caracter i es una may�scula	
				mayuscula = true;
			}
		}
		return mayuscula;		
	}
	
	public boolean siMayuscula2() { //M�todo perfecto del profe
		
		boolean mayuscula = false;
		int cont = 0;
		char c = ' ';
		
		do {
			c = this.palabraclave.charAt(cont);
			mayuscula = Character.isUpperCase(c);
			cont++;
		} while((!mayuscula) && (cont < this.longitud));//Recorre la cadena mientras no encuentre una may�scula y no llegue al final
		
		return mayuscula;
	}
	
	public boolean siMinuscula() { //Comprueba si mi pass contiene alguna min�scula
		
		boolean minuscula = false;
		
		for (int i = 0; i < this.longitud; i++) {
			
			if (Character.isLowerCase(palabraclave.charAt(i))) {
			//Character.isLowerCase: Determina si mi caracter i es una m�nuscula	
				minuscula = true;
			}
		}
		return minuscula;
	}
	
	public boolean siNumero() {
		
		boolean numero = false;
				
		for (int i = 0; i < this.longitud; i++) {
			
			if (Character.isDigit(palabraclave.charAt(i))) {
			//Character.isDigit: Determina si mi caracter i que recibe es un n�mero	
				numero = true;
			}
		}
		return numero;
	}
	
	public  boolean siEspeciales() {
		
		boolean especial= false;
		char [] c = {'!', '"', '�', '$', '%', '&', '/', '(', ')', '=', '?', '�', '+', '*', '�', '�', '[', ']', '{', '}',
		',', '.', '-', ';', ':', '_', '�','�', '|', '\\', '@', '#','~','�', '�'};
		int longarray = 0;
		int pcaracter = 0; //Contador donde se ir� guardando la posici�n del caracter de mi palabraclave
		int carray = 0; //Contador donde se ir� guardando la posici�n del caracter de mi array 'c'
		
		longarray = c.length; //El length para los arrays no llevan par�ntesis xk no es una llamada sino es un campo
		do {
			do {
				if (this.palabraclave.charAt(pcaracter) == c[carray]) {
					especial = true;		
				}
				carray++;
			}while ((!especial) && (carray < longarray));
			pcaracter++;
			carray = 0;
		}while((!especial) && (pcaracter < this.longitud));//Recorre la cadena mientras no encuentre una may�scula y no llegue al final
		
//		for (int i = 0; i < this.longitud; i++) {
//			
//			for (int j = 0; j < longarray; j++) {
//				do {
//					if (this.palabraclave.charAt(i) == c[j]) {
//						
//						especial = true;
//					}				
//				} while (!especial == true);
//			}	
//
//		}
		return especial;
	}
	
}
