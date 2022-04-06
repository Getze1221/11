/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:clase principal de las operaciones
 */

package programa4;

import java.util.Scanner;

public class OperacionesPrincipal {
	private static Scanner scanner;
	private static Suma suma;
	private static Resta resta;
	private static Multiplicacion multiplicacion;
	private static Division division;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Dame el primer valor de la suma:");
		double x = scanner.nextDouble();
		System.out.println("Dame el primer valor de la suma:");
		double y = scanner.nextDouble();
		suma = new Suma();
		resta = new Resta();
		multiplicacion = new Multiplicacion();
		division = new Division();
		suma.setX(x);
		suma.setY(y);
		suma.imprimir();
		resta.setX(x);
		resta.setY(y);
		resta.imprimir();
		multiplicacion.setX(x);
		multiplicacion.setY(y);
		multiplicacion.imprimir();
		division.setX(x);
		division.setY(y);
		division.imprimir();

	}

}
