/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:clase principal de la multiplicacion
 */

package Programa1;

import java.util.Scanner;

public class MultiplicacionPrincipal {
	private static Scanner scanner;
	private static Multiplicacion multiplicacion;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("ingrese el primer valor :");
		double x = scanner.nextDouble();
		System.out.println("Ingrese el segundo valor:");
		double y = scanner.nextDouble();
		multiplicacion = new Multiplicacion();
		multiplicacion.setX(x);
		multiplicacion.setY(y);
		multiplicacion.imprimir();

	}

}
