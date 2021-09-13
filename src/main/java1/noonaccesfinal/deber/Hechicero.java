package noonaccesfinal.deber;

public class Hechicero extends Principal {

	//LOSMETODOS FINAL no se pueden sobreescribir mismo metodo de la clase padre
	protected final void danioSolar() {
		System.out.println("DAÑO 3000");
	}
	//este metodo si me sirve ya que no lleva final en su metodo herea de su clase padre 
	protected void danioHielo() {
		System.out.println("DAÑO 500");
		
		
	}
}
