/*
 * AUTOR: ABEL JORNET MOLERO
 * ULTIMA MODIFICACION: 24/01/2022
 */

public class Persona {

	// CONSTANTES DE PERSONA

	private final char SEXOPORDEFECTO = 'H';

	// ATRIBUTOS DE PERSONA

	// NOMBRE DE LA PERSONA
	private String nombre;

	// EDAD DE LA PERSONA
	private int edad;

	// DNI DE LA PERSONA
	private String DNI;

	// SEXO DE LA PERSONA
	private char sexo = SEXOPORDEFECTO;

	// PESO DE LA PERSONA
	private double peso;

	// ALTURA DE LA PERSONA
	private double altura;

	// CONSTRUCTORES
	public Persona() {

		this.nombre = "";
		this.edad = 0;
		this.DNI = "";
		this.sexo = SEXOPORDEFECTO;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	public Persona(String nombre, int edad, char sexo) {

		this.nombre = nombre;
		this.edad = edad;
		this.DNI = "";
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char sexo, String DNI, double peso, double altura) {

		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {

		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
}
