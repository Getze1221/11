/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:clase principal de rectangulo
 */



package Programa5;

import java.util.Scanner;


public class RectanguloPrincipal {
	private static Scanner scanner;
    private static Rectangulo rectangulo;
	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		System.out.println("ingrese la base:");
		double base= scanner.nextDouble();
		System.out.println("dabe la altura:");
		double altura= scanner.nextDouble();
		rectangulo= new Rectangulo();
		rectangulo.setBase(base);
		rectangulo.setAltura(altura);
		rectangulo.imprimir();
		
		

	}
}
