package ejercicios.non.acces.staticos;

public class MainPersona {

	public static void main(String[] args) {
		Paciente pasiente1 = new Paciente();
		pasiente1.setNombre("juan");
		pasiente1.setEdad(15);
		
		pasiente1.registrar(pasiente1.getNombre());
		Paciente.consultarNacionalidadStatica();
		
	}

}
