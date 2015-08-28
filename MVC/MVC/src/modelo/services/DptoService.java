package modelo.services;

import java.util.List;

import modelo.beans.Department;
import modelo.persistance.dao.jdbc.DepJDBCDAO;

/**
 * Servicio Departamento, su función es obtener la lista de departamentos.
 * 
 * @author alexander
 *
 */
public class DptoService {
	private DepJDBCDAO dep = null;

	public DptoService() {
		dep = new DepJDBCDAO();
	}

	public List<Department> getDepartments() {
		return dep.getDepartments();
	}
}