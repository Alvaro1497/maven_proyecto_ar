package ejercicios.nonacces.finall;

public final class EstudianteCiencias extends Estudiante {

	public final String horarioEntrada = " 08:00 ";
	
	public String ciudadNacimiento = "Quito ";
	//atributo final
	//no se puuede reaccinar a un atributo final
	public EstudianteCiencias() {
		horarioEntrada = " 08:00";
	//atributo sin final
		ciudadNacimiento=  "guayaquil";
		
	}
	
	
}
