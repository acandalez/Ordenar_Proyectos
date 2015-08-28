package hibernateDAOServices;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import clases_y_mapas_codegeneration.Employees;

public class EmployeeServicesClass {

	private EmployeesDAO eDAO;

	public EmployeeServicesClass() {

		eDAO = new EmployeesDAO();

	}

	public boolean incrementar_salario() {

		boolean bl = false;

		Session sesion = null;

		Transaction transaction = null;
		List<Employees> lista_empleados = null;

		try {

			Employees employee;

			sesion = SesionManager.obtenerSesionNueva();// llamo al
														// sesionmanager para
														// que me de una sesion
														// y lo guardo en sesion
			transaction = sesion.beginTransaction();// empezamos la sesion en la
													// base de datos
			eDAO.setSesion(sesion);
			lista_empleados = eDAO.obtenerEmpleado();
			actualizarSalario(lista_empleados);// act
			transaction.commit();
			bl = true;

		} catch (Exception e) {
			transaction.rollback();
			bl = false;
			e.printStackTrace();

		} finally {

			SesionManager.cerrarSession(sesion);

		}

		return bl;

	}

	private void actualizarSalario(List<Employees> listaem) {
		// 1. recorremos la lista
		for (Employees emp : listaem) {
			emp.setSalary(emp.getSalary().multiply(new BigDecimal(1.2)));// realizamos
																			// la
																			// operacion
																			// de
																			// multiplicar
																			// el
																			// salario
																			// por
																			// 1.2
		}

	}

	/**
	 * Hacer un servicio que me devuelva una lista del empleado mejor pagado de
	 * cada departamento.
	 * 
	 */
	public List<Employees> empleadoMejorSalarioPorDepartamento() {

		List<Employees> empleadoMejorSalario = null;

		//
		Session sesion = null;

		Transaction transaction = null;
		List<Employees> lista_empleados2 = null;

		try {
			sesion = SesionManager.obtenerSesionNueva();
			transaction = sesion.beginTransaction();

		} catch (Exception e) {
			transaction.rollback();

			e.printStackTrace();

		} finally {

			SesionManager.cerrarSession(sesion);

		}

		return empleadoMejorSalario;

	}

	/**
	 * hacer un serivicio que obtenga los empleados por la id del departamento
	 */

	public List<Employees> obtenerEmpleadosPorDepartamento (Object department){
		List<Employees> ls = null;
		
		Session sesion = null;
		Transaction transaction = null;
		List<Employees> ls2 = null;
		
		try {
			sesion = SesionManager.obtenerSesionNueva();
			transaction = sesion.beginTransaction();
			eDAO.setSesion(sesion);
			ls2 = eDAO.();
			actualizarSalario(lista_empleados);// act
			transaction.commit();

		} catch (Exception e) {
			transaction.rollback();

			e.printStackTrace();

		} finally {

			SesionManager.cerrarSession(sesion);

		}

		return ls;

	}
}
