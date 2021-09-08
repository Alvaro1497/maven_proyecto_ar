package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		// 1.contains
//		String frase = "Programacion 1 Modulo 2 algoritmos";
		Scanner sc = new Scanner(System.in);
//		System.out.println("Ingrese nombre del libro");
//		String palabra = sc.nextLine();
//
//		boolean resultado = frase.contains(palabra);
//		System.out.println("contiene la palabra " + resultado);

		// 2.equals()
		System.out.println("******************************************");
		String cadena1 = "Alvaro";
		System.out.println("ingrese la segunda cadena a comparar");
		String cadena2 = sc.nextLine();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("las cadenas son:  " + resultado2);

//		// 3.toUpperCase() and tolower
//
//		System.out.println("******************************************");
//		String nombre = "juanito";
//		String nombreEnMayuscula = nombre.toUpperCase();
//		System.out.println("Mayuscula " + nombreEnMayuscula);
//
//		String nombre2 = "PABLO";
//		String nombreEnMinuscula = nombre2.toLowerCase();
//		System.out.println("Minuscula " + nombreEnMinuscula);
		
	}

}
