/*
 * AUTOR: ABEL JORNET MOLERO
 * ULTIMA MODIFICACION: 24/01/2022
 */

public class MainAPP {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		Persona p2 = new Persona("Abel", 25, 'H');
		Persona p3 = new Persona("Abel", 25, 'H', "48023213H", 105.00, 184.90);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

	}
}

