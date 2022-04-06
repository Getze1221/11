/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:principal de la clase iva
 */



package programa7;

import java.util.Scanner;

public class IvaPrincipal {
	private static Scanner scanner;
	private static Iva iva;
	
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.println("ingrese el precio sin iva:");
		double n= scanner.nextDouble();
		iva= new Iva();
		iva.setN(n);
		iva.imp();
		
		
		
	}

}
