package hibernateDAOServices;

import java.util.List;

import org.hibernate.Session;

import clases_y_mapas_codegeneration.Employees;

public class EmployeesDAO {

	Session sesion = null;

	public EmployeesDAO() {

	}

	public Session getSesion() {
		return sesion;
	}

	public void setSesion(Session sesion) {// Empleado DAO necesita una sesion
											// con lo que con esto le damos una
											// sesion asignada en servicios
		this.sesion = sesion;
	}

	public List<Employees> obtenerEmpleado() {// obtiene empleados
		List<Employees> ls = null;

		ls = this.getSesion()
				.createSQLQuery(InstruccionesSQL.COSULTAR_EMPLEADO_X_ID)
				.addEntity(Employees.class).list();

		return ls;

	}

	public List<Employees> obtenerEmpleadoMejorPagadoPorDepartamento() {
		List<Employees> ls = null;

		return ls;

	}

	public List<Employees> obtenerEmpleados() {// obtiene empleados
		List<Employees> ls = null;

		ls = this
				.getSesion()
				.createSQLQuery(
						InstruccionesSQL.CONSULTAR_EMPLEADOS_X_DEPARTAMENTOS)
				.addEntity(Employees.class).list();

		return ls;

	}

	public Employees read(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
