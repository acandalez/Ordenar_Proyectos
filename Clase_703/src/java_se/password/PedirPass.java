package java_se.password;

import java.util.Scanner;

public class PedirPass {

	public String introPassword () {
		
		String pass = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca Contrase�a: ");
		pass = sc.nextLine();
		
		return pass;
	}
}
