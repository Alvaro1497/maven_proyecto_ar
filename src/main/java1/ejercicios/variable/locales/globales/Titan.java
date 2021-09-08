package ejercicios.variable.locales.globales;

public class Titan {
	private String nombre;
	private int fuerza;
	private String daño;
	public static  String provincia ="CATA";
	public static int hora = 12;
	
	public void selva() {
		// global
		this.nombre = "Perseo";
		this.daño = "solar";
		this.fuerza = 500;
		// locales
		String salpicadura = "corrosivo";
		String enemigos = "lacayo";
	}

}
