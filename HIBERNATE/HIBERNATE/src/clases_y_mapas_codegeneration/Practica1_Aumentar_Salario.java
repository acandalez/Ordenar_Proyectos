package clases_y_mapas_codegeneration;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * HACER UNA APLICACION UTILIZANDO LA PERSISITENCIA DE HIBERNATE Y AUMENTE UN
 * 20% EL SALARIO DE LOS EMPLEADOS DE VENTAS
 */

public class Practica1_Aumentar_Salario {

	private static int plus_salary = 0;
	private static final double pocentaje = 1.20;

	public static void main(String args[]) {

		/** INICIO LA CONFIGURACION */
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());

		SessionFactory factory = configuration.buildSessionFactory(builder
				.build());

		Session session = factory.openSession();

		// Me creo el POJO
		Employees employee = new Employees();

		/** CREO LA TRANSACCION */
		Transaction transaction = null;// TRANSACTION VACIA

		// Y procedo a guardarlo --> INICIO DE LA TRANSACCION

		try {
			BigDecimal bg = null;// con esto cambiamos de double a bigdecimal

			transaction = session.beginTransaction();
			@SuppressWarnings("unchecked")
			List<Employees> list = session
					.createSQLQuery// createSQLQuery pasa los registros de la
									// base de datos a
									// los objetos del arraylist
					("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID = 80")
					.addEntity(Employees.class).list();
			Iterator<Employees> it = list.iterator();
			Employees em;
			while (it.hasNext()) {
				em = it.next();
				plus_salary = (int) (em.getSalary().doubleValue() * pocentaje);// con
																				// doubleValue
																				// cambiamos
																				// BigDecimal
																				// a
																				// double
																				// para
																				// operar
																				// con
																				// el
																				// porcentaje
				System.out.println(plus_salary);

				bg = new BigDecimal(plus_salary);// cambiamos de double a
													// BigDecimal
				em.setSalary(bg);// guardamos el salario nuevo
				session.saveOrUpdate(em);// actualizamos o crea y guarda el
											// objeto en la bd
				System.out.println(em.toString());
			}
			transaction.commit();// si todo ha ido bien, persisto los cambio,
									// los hago de verdad, no en la copia de la
									// BD
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();// si algo ha ido mal, deshago la transacción
		} finally {
			session.disconnect();// haya ido bien o mal, libero recursos!
			factory.close();
		}

	}
}