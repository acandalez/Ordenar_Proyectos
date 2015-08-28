package modelo.services;

import modelo.persistance.interfaces.Recuperable;

public class EmpleadoService {
	Recuperable dao = null;

	public EmpleadoService(Recuperable dao) {
		this.dao = dao;
	}

	public void setDao(Recuperable dao) {
		this.dao = dao;
	}

	public Object obtenerEmpleado(int empId) {
		return dao.obtenerEmpleado(empId);
	}

}