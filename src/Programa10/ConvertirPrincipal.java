/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:Clase principal de la conversion
 */

package Programa10;

import java.util.Scanner;

public class ConvertirPrincipal {

	private static Scanner scanner;
	private static Convertir convertir;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("ingrese el numero de MB a convertir a kb:");
		double n = scanner.nextDouble();
		convertir = new Convertir();
		convertir.setN(n);
		convertir.imprimir();

	}

}