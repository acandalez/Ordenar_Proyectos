package hibernate.jpa;

public class MainTest {

	/**
	 * Vamos a probar nuestro metodo con distintas formas por medio de la
	 * interfas.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		EmployeeService es = new EmployeeService();

		// Con Hibernate
		Recuperable i_hibernate = new EmpleadoDAO();

		es.setEmployee(i_hibernate);
		es.ReadEmployee(150);

		// Con jdbc
		Recuperable jdbc = new EmployeeJDBC();

		es.setEmployee(jdbc);
		es.ReadEmployee(150);

		// Con jpa
		Recuperable jpa = new EmployeeJPA();

		es.setEmployee(jpa);
		es.ReadEmployee(150);

	}

}
