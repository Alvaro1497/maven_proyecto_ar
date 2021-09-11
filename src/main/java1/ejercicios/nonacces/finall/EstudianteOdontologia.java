package ejercicios.nonacces.finall;

public class EstudianteOdontologia extends EstudianteMedicina {

	
	//LOSMETODOS FINAL no se pueden sobreescribir mismo metodo de la clase padre
	@Override
	protected void realizarPracticas() {
		System.out.println("REALIZA 100 HRS DE PRACTICAS ");
		
	}
	//este metodo si me sirve ya que no lleva final en su metodo herea de su clase padre 
	protected void realizarPasantias() {
		System.out.println("SON 200 HRS");
	}
}
