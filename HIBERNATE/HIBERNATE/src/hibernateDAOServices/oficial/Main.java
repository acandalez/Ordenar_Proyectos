package hibernateDAOServices.oficial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean bn = false;
		EmployeeServicesClass sc = new EmployeeServicesClass();

		bn = sc.incrementar_salario();

		System.out.println(bn);

	}
}
