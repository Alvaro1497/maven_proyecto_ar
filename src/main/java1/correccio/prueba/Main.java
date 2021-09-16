package correccio.prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String opcionMenu;
		Scanner sc = new Scanner(System.in);
		String claveIngresada;
		int Q = 2500;
		int M = 0;
		int R = 0;
		do {

			System.out.println("Ingrese clave");
			claveIngresada = sc.nextLine();
			if (claveIngresada.equals("85DB")) {
				do {
					System.out.println("BANCO PICHINCHA");
					System.out.println(" 1) Realizar transferencia");
					System.out.println(" 2) Consultar transacciones");
					System.out.println(" 3) Salir");
					opcionMenu = sc.nextLine();

					if (opcionMenu.equals("1")) {
						System.out.println("ingrese la cuenta de destino ");
						opcionMenu = sc.nextLine();
						System.out.println("monto a transferir.");
						M = sc.nextInt();
						R = Q - M;
						System.out.println("Su nuevo saldo es: " + R);
					}

					if (opcionMenu.equals("2")) {
						System.out.println("En este momento se están procesando las transacciones, intente más tarde ");
						System.out.println("MARQUE 3 PARA SALIR");
						opcionMenu = sc.nextLine();

					}
					// WHILE (opcionMenu.equals("1")|| opcionMenu.equals("2"));
				} while (!opcionMenu.equals("3"));

			} else {
				System.out.println("Contraseña incorrecta");
			}
		} while (!claveIngresada.equals("-1"));
		System.out.println("Gracias por Preferirnos");
	}
}
