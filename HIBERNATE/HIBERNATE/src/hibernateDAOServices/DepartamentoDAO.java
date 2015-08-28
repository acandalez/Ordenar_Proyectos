package hibernateDAOServices;

import java.util.List;

import clases_y_mapas_codegeneration.Departments;
import clases_y_mapas_codegeneration.Employees;

public class DepartamentoDAO extends SuperClassDAO  {
	
	public DepartamentoDAO(){
	super();
		
	}
	public List<Employees> obtenerDepartamentos() {//obtiene empleados
		List<Employees> ls = null;

		ls = this.getSesion().createSQLQuery(InstruccionesSQL.Consultar_Departamentos_X_ID)
				.addEntity(Departments.class).list();

		return ls;

	}

}
