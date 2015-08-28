package hibernate.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeJPA implements Recuperable {

	@Override
	public Object ReadEmployee(int n) {
		// TODO Auto-generated method stub.
		long empId = 190; // emp 190 - Timothy Gates
		EmployeesDTOJDBC yo = null;
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("UnidadPersonas");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			yo = em.find(Employees.class, empId);
			System.out.println(yo.toString());
			// em.persist(yo);
			em.getTransaction().commit();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			em.close();
			// System.exit(0);//no sé pporqué no acaba sólo...parace que se
			// queda conlgando si no le pongo esto

		}
		return yo;
	}

}
