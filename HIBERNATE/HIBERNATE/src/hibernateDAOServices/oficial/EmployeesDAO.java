package hibernateDAOServices.oficial;

import java.util.List;

import clases_y_mapas_codegeneration.Employees;

public class EmployeesDAO extends SuperClassDAO {

	private SuperClassDAO sp;

	public EmployeesDAO() {

		super();// con esto dices a la clase que vas a usar los atributos de la
		// clase SuperClassDAO

	}

	public List<Employees> obtenerEmpleado() {
		List<Employees> ls = null;

		ls = this.getSesion().createSQLQuery("select * from employees")
				.addEntity(Employees.class).list();

		return ls;

	}

}
