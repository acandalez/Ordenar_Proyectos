package clases_y_mapas_codegeneration;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * HACER UN PROGRAMA QUE RECORRA TODOS LOS CONTINENTES Y MUESTRE LOS PAISES
 * ASOCIADOS.
 * 
 * @author acandalez
 *
 */

public class Practica_AtributosRelacionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

			transaction = session.beginTransaction();
			@SuppressWarnings("unchecked")
			List<Regions> list = session.createSQLQuery// createSQLQuery pasa
														// los registros de la
														// base de datos a
														// los objetos del
														// arraylist
					("SELECT * FROM REGIONS ").addEntity(Regions.class).list();
			Iterator<Regions> it_regions = list.iterator();// itero los
															// continentes
			Regions region;

			while (it_regions.hasNext()) {// recorremos los continentes
				region = it_regions.next();

				Iterator<Countries> it_countries = region.getCountrieses()
						.iterator();// itero los paises

				while (it_countries.hasNext()) {

					Countries country = it_countries.next();// recorre los
															// paises para
															// guardarlo en el
															// objeto country
					System.out.println(country.getCountryName());

				}

				// System.out.println(country.toString());
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