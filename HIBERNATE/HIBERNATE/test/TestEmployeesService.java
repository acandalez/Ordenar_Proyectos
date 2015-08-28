import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import hibernateDAOServices.EmployeeServicesClass;
import hibernateDAOServices.EmployeesDAO;
import hibernateDAOServices.SesionManager;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.junit.Test;

import clases_y_mapas_codegeneration.Employees;

public class TestEmployeesService {

	/*
	 * Test para incrementar salario:1- (e1)Leo un registro de empleado2- llamo
	 * a incrementar salario3- (e1’)recupero el mismo registro de empleado-
	 * aserción (e1.getsalary * 1,20 = e1’.getsalary)
	 */
	@Test
	public void testIncrementar_salario() {

		Session sesion = SesionManager.obtenerSesionNueva();
		EmployeesDAO edao = new EmployeesDAO();
		edao.setSesion(sesion);
		Employees e1 = edao.read(150);
		/*------fin primera parte---------*/

		EmployeeServicesClass esc = new EmployeeServicesClass();
		esc.incrementar_salario();
		/*------fin segunda parte---------*/

		Employees e2 = edao.read(150);
		/*------fin tercera parte---------*/

		assertEquals("Salario no incremnetado",
				e1.getSalary().multiply(new BigDecimal(1.2)), e2.getSalary());
		// //1.
		//
		// Session sesión = SesionManager.obtenerSesionNueva ();//(getsesion)
		// EmployeesDAO edao = new EmployeesDAO ();
		// edao.setSesion(sesión);
		// Employees e1= (Employees) edao.read (poner numero de id que se quiera
		// consultar 1-200);
		// //2.
		// EmployeesService es = new EmployeesService ();
		// es.incrementarSalario ();
		// Employees e2 = (Employees) edao.read(id);//recuperamos el empleado
		// con la misma id

	}

	@Test
	public void testEmpleadoMejorSalarioPorDepartamento() {
		fail("Not yet implemented");
	}

}
