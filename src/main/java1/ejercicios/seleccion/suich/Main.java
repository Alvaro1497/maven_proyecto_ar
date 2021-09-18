package ejercicios.seleccion.suich;

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
			// el switch antes de la version 1.7
			// solo funcinava para byte, short , char, int
			switch (opcion) {
			case "1":
				System.out.println("Ingrese numero de cuenta");
				break;
			case "2":
				System.out.println("No existen pagos");
				break;
			case "3":
				System.out.println("Cerrando sistema");
				break;
			default:
				System.out.println("No ha elegido ninguna opcion valida");
				break;
			}

		} while (!opcion.equals("3"));
		System.out.println("Gracias por preferirnos");
	}

}
