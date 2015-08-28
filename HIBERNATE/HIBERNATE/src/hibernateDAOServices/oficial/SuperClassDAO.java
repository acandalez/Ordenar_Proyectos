package hibernateDAOServices.oficial;

/**
 * En esta clase configuramos la sesion de las clases DAO, ya que esta clase es
 * el factor comun de las clase DAO
 */
public class SuperClassDAO {

	Sesion sesion = null;

	public Sesion getSesion() {
		return sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

}
