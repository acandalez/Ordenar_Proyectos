package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.beans.Employees;
import modelo.persistance.dao.hibernate.EmpHiberDAO;
import modelo.persistance.dao.jdbc.EmployeeDAO;
import modelo.persistance.interfaces.Recuperable;
import modelo.services.EmpleadoService;

import org.apache.xpath.operations.String;

/**
 * Este servlet obtiene una lista de empleados llamando al servicio de
 * empleados.
 * 
 * @author alexander
 *
 */
@WebServlet
public class EmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String empIdStr = null;
		if (null != (empIdStr = (String) req.getParameter("employee_id"))) {
			// con este metodo pretendo cambiar un String a un entero.
			int empId = Integer.parseInt(empIdStr);
			Recuperable daoJDBC = new EmployeeDAO();
			EmpleadoService service = new EmpleadoService(daoJDBC);
			service.setDao(new EmpHiberDAO());
			Employees emp = (Employees) service.obtenerEmpleado(empId);
			req.setAttribute("empleado", emp);
			req.getRequestDispatcher("GestorEmpleados.jsp").forward(req, resp);
		}

	}
}