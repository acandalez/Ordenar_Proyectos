package hibernate.jpa;

public class EmployeeService implements Recuperable {

	public Recuperable generico = null;

	/**
	 * 
	 */
	@Override
	public Object ReadEmployee(int n) {
		// TODO Auto-generated method stub
		Object empleado = null;
		empleado = this.generico.ReadEmployee(n);
		return empleado;
	}

	public void setEmployee(Recuperable obj) {

		this.generico = obj;

	}

	// @SuppressWarnings("static-access")
	// @Override
	// public Object ReadEmployee(int n) {
	// // TODO Auto-generated method stub
	// SesionManager sm = null;
	// EmployeesDAO empleadoDAO = null;
	// List<Employees> leerEmpleado = null;
	//
	// Transaction transaction = null;
	// Session sesion = null;
	// sesion = sm.obtenerSesionNueva();// asignamos la sesion del
	// // sesionManager.
	// List<Employees> lsEmDTO = null;// asignamos una array donde vamos a
	// // almacenar los empleados.
	// empleadoDAO.setSesion(sesion);
	//
	// // Empieza la transaccion de incrementar salario
	// try {
	// transaction = empleadoDAO.getSesion().beginTransaction();
	// empleadoDAO = (EmployeesDAO) sm.obtenerSesionNueva()
	// .createSQLQuery(InstruccionesSQL.COSULTAR_EMPLEADO_X_ID);// almacenamos
	// // en
	// // el
	// // array
	// // la
	// // lista
	// // recogida de la BD.
	//
	// transaction.commit();// verificado que todo funciona correctamente
	// // hacemos que los datos se vuelquen a la BD
	// // original y el estado del objeto cambie a
	// // persistent.
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// transaction.rollback();// si la transaccion falla volveremos al
	// // punto anterio y deshacemos los cambios
	// // realizados.
	//
	// } finally {
	// sm.cerrarSession(sesion); // cerramos la sesion.
	// }
	// // FIN DE LA TRANSACCION
	//
	// return leerEmpleado;
	//
	// }
}
