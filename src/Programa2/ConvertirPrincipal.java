/*Autor: Getzemani Alejandro Gonzalez Cruz
 *Fecha de creacion: 05/03/22
 *Fecha de Actualizacion: 06/03/22
 *Descipcion:Clase pincipal del convertor
 */





package Programa2;

import java.util.Scanner;


public class ConvertirPrincipal {
	
	private static Scanner scanner;
	private static Convertir convertir;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		System.out.println("ingrese el numero de pesos a convertir a dolares:");
		double pesos= scanner.nextDouble();
		convertir = new Convertir();
		convertir.setPesos(pesos);
		convertir.imprimir();
		
		
		
	}

}
