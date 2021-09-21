package ejercicios.fecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// fechas
		// deprecado = jamas se deveria usar o se puede pero no
		// java.util.Date; no se deberia usar
		Date date = new Date();// esta clase esta deprecada no se deberia usar

		// ESTA DEBEMOS USAR PARA INSTANCIAR DE FORMA PARTICULAR
		LocalDate diaHoy = LocalDate.now();
		LocalDate diafin = diaHoy.plusDays(15);// aqui aumentamos 15

		// System.out.println(diaHoy);// de esta forma tendremos la fecha actual

		CursoVacacional curso1 = new CursoVacacional();
		curso1.setNombre("Volley Principiantes");
		curso1.setFechaInicio(diaHoy);
		curso1.setFechaFin(diafin);

		System.out.println("Nombre : " + curso1.getNombre());
		System.out.println("F I " + curso1.getFechaInicio());
		System.out.println("F F " + curso1.getFechaFin());

		LocalDate diaHoy2 = LocalDate.now();// fecha actual
		LocalDate diaQueInicio = diaHoy2.minusDays(2); // para reducir dias
		LocalDate diaQuefinaliza = diaQueInicio.plusDays(20);

		CursoVacacional curso2 = new CursoVacacional();
		curso2.setNombre("Natacion Principiantes");
		curso2.setFechaInicio(diaQueInicio);
		curso2.setFechaFin(diaQuefinaliza);

		System.out.println("Nombre :  " + curso2.getNombre());
		System.out.println("F I " + curso2.getFechaInicio());
		System.out.println("F F " + curso2.getFechaFin());

		// FECHAS ESPECIFICAS
		LocalDate fechaEspecifica = LocalDate.of(2022, 2, 15);
		System.out.println(fechaEspecifica);

		// Ejercicios
		LocalDate fechaEspecificaIni = LocalDate.of(2022, 2, 15);
		LocalDate fechaEspecificafin = LocalDate.of(2022, 7, 10);

		CursoVacacional curso3 = new CursoVacacional();
		curso3.setNombre("Karate");
		curso3.setFechaInicio(fechaEspecificaIni);
		curso3.setFechaFin(fechaEspecificafin);

		LocalDate fechaVista = curso3.getFechaFin();
		LocalDate fechaVistaNueva = fechaVista.plusDays(3);

		curso3.setFechaFin(fechaVistaNueva);

		System.out.println("Nombre :  " + curso3.getNombre());
		System.out.println("F I " + curso3.getFechaInicio());
		System.out.println("F F " + curso3.getFechaFin());
		//cambio de formato 
		System.out.println("F F F (OTRO FORMATO) " + curso3.getFechaFin().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		System.out.println("Que dia es hoy");
		LocalDate diaHoy3 = LocalDate.now();
		System.out.println(diaHoy3.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		System.out.println(diaHoy3.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
	}

}
