/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion: Pincipal de convertir
 */

package Programa11;

import java.util.Scanner;

public class ConvertirPrincipal {

	private static Scanner scanner;
	private static Convertir convertir;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("ingrese el numero de KB a convertir a MB:");
		double n = scanner.nextDouble();
		convertir = new Convertir();
		convertir.setN(n);
		convertir.imprimir();

	}

}