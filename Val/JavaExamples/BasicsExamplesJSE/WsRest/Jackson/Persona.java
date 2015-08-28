package curso.exp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persona {

	private String nombre;
	private int edad;
	
	public Persona ()
	{
		
	}
	
	
	public Persona(String nombre, int edad) {
	
		this.nombre = nombre;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Nombre = " + this.nombre + " edad = "  + this.edad;
	}
	
	
}
