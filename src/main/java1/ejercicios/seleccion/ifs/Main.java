package ejercicios.seleccion.ifs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String opcion;
	
		do {
			System.out.println("Escoja opcion: ");
			System.out.println("1).realizar transferencia: ");
			System.out.println("2).consultar pagos: ");
			System.out.println("3).SALIR: ");
			opcion = sc.nextLine();
			if (opcion.equals("1") ) {
				System.out.println("ingrese numero de cuenta");
				opcion = sc.nextLine();

			} else if (opcion.equals("2")) {
				System.out.println("no existen pagos");
				System.out.println("marque 3 ");
				opcion = sc.nextLine();
			}
			/// ! fijarse que niega 
		} while (!opcion.equals("3"));
		System.out.println("gracias por preferirnos");
	}

}
