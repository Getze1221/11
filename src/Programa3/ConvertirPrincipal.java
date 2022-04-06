/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:clase pincipal del convertor
 */



package Programa3;

import java.util.Scanner;


public class ConvertirPrincipal {
	
	private static Scanner scanner;
	private static Convertir convertir;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.println("ingrese el numero de dolares a convertir a pesos:");
		double dolares= scanner.nextDouble();
		convertir = new Convertir();
		convertir.setDolares(dolares);
		convertir.imprimir();
		
		
		
	}

}
